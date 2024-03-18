LICENSE = "CLOSED"
LIC_FILES_CHKSUM = ""

SRC_URI = "gitsm://git@git.tu-berlin.de/raccoon/software/raccoon_ws.git;protocol=ssh;branch=p/diez/use_rust_ros2_fork \
"
SRCREV = "073e6450b0befc93de5348a90a6121ee4905457e"

# TODO
BB_STRICT_CHECKSUM = "0"

require rust-deps.inc
require colcon-deps.inc
require ccsds-pus-connector-deps.inc

inherit ros_ament_cmake
inherit cargo

# Modify these as desired
PV = "1.0+git${SRCPV}"
S = "${WORKDIR}/git"

do_compile () {
	export AMENT_PREFIX_PATH="${STAGING_DIR_HOST}${prefix}:${STAGING_DIR_NATIVE}${prefix}"
	export RUSTFLAGS="${RUSTFLAGS}"
	export ROS_DISTRO="${ROS_DISTRO}"
	export BINDGEN_EXTRA_CLANG_ARGS="-D__LP64__=1 -D__WORDSIZE=64 -D __aarch64__"
	cd "${S}"

	colcon build \
		--paths $(find src -type d) \
		--packages-up-to ccsds_pus_connector \
		--install-base "${STAGING_DIR_HOST}${prefix}" \
		--cmake-args -DCMAKE_VERBOSE_MAKEFILE=ON -DPYTHON_SOABI=${PYTHON_SOABI} \
		--rust-target ${RUST_HOST_SYS} \
		--cargo-args --offline ${BUILD_MODE}
}

do_install () {
	install -d "${D}${prefix}/share"
	install -d "${D}${prefix}/lib"
	install -d "${D}${prefix}/include"

	cp -r "${STAGING_DIR_HOST}${prefix}/ccsds_pus_connector"/*  "${D}${prefix}/"
	cp -r "${STAGING_DIR_HOST}${prefix}/ccsds_pus_msgs"/*  "${D}${prefix}/"
}
FILES:${PN} = "\
	${prefix}/include \
	${prefix}/lib \
	${prefix}/share \
"

# To avoid `QA Issue: -dev package $PN-dev contains non-symlink .so '/usr/lib/lib<something>__rosidl_typesupport_fastrtps_c.so'`
FILES:${PN}-dev = ""
