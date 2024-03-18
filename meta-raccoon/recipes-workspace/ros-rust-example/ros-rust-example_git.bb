LICENSE = "CLOSED"
LIC_FILES_CHKSUM = ""

SRC_URI = " \
	gitsm://github.com/jdiez17/ros2_rust_example;protocol=https;branch=master \
    	crate://crates.io/bitflags/2.4.2 \
	crate://crates.io/aho-corasick/1.1.2 \
	crate://crates.io/cfg-if/1.0.0 \
	crate://crates.io/env_logger/0.8.4 \
	crate://crates.io/getrandom/0.2.12 \
	crate://crates.io/itoa/1.0.10 \
	crate://crates.io/libc/0.2.153 \
	crate://crates.io/log/0.4.21 \
	crate://crates.io/memchr/2.7.1 \
	crate://crates.io/proc-macro2/1.0.79 \
	crate://crates.io/quickcheck/1.0.3 \
	crate://crates.io/quote/1.0.35 \
	crate://crates.io/rand/0.8.5 \
	crate://crates.io/rand_core/0.6.4 \
	crate://crates.io/regex-automata/0.4.6 \
	crate://crates.io/regex-syntax/0.8.2 \
	crate://crates.io/regex/1.10.3 \
	crate://crates.io/ryu/1.0.17 \
	crate://crates.io/serde/1.0.197 \
	crate://crates.io/serde_derive/1.0.197 \
	crate://crates.io/serde_json/1.0.114 \
	crate://crates.io/syn/2.0.52 \
	crate://crates.io/unicode-ident/1.0.12 \
	crate://crates.io/wasi/0.11.0+wasi-snapshot-preview1 \
	\
	crate://crates.io/ament_rs/0.2.1 \
	crate://crates.io/futures/0.3.30 \
	crate://crates.io/libloading/0.8.3 \
	crate://crates.io/windows-targets/0.52.4 \
	crate://crates.io/tempfile/3.3.0 \
	crate://crates.io/fastrand/1.6.0 \
	crate://crates.io/libc/0.2.27 \
	crate://crates.io/remove_dir_all/0.5.0 \
	crate://crates.io/redox_syscall/0.2.9 \
	crate://crates.io/winapi/0.3.0 \
	crate://crates.io/bindgen/0.66.1 \
	crate://crates.io/itertools/0.8.2 \
	crate://crates.io/walkdir/2.5.0 \
	crate://crates.io/same-file/1.0.1 \
	crate://crates.io/futures-channel/0.3.30 \
	crate://crates.io/futures-core/0.3.30 \
	crate://crates.io/futures-io/0.3.30 \
	crate://crates.io/futures-sink/0.3.30 \
	crate://crates.io/futures-task/0.3.30 \
	crate://crates.io/futures-util/0.3.30 \
	crate://crates.io/futures-macro/0.3.30 \
	crate://crates.io/futures-executor/0.3.30 \
	crate://crates.io/assert_matches/1.5.0 \
	crate://crates.io/pin-project/1.0.11 \
	crate://crates.io/pin-utils/0.1.0 \
	crate://crates.io/static_assertions/1.0.0 \
	crate://crates.io/tokio/0.1.11 \
	\
    crate://crates.io/aho-corasick/0.7.20 \
    crate://crates.io/annotate-snippets/0.9.1 \
    crate://crates.io/bitflags/1.3.2 \
    crate://crates.io/bitflags/2.2.1 \
    crate://crates.io/block/0.1.6 \
    crate://crates.io/cc/1.0.78 \
    crate://crates.io/cexpr/0.6.0 \
    crate://crates.io/cfg-if/1.0.0 \
    crate://crates.io/clang-sys/1.4.0 \
    crate://crates.io/clap/4.1.4 \
    crate://crates.io/clap_complete/4.2.0 \
    crate://crates.io/clap_derive/4.1.0 \
    crate://crates.io/clap_lex/0.3.1 \
    crate://crates.io/diff/0.1.13 \
    crate://crates.io/either/1.8.1 \
    crate://crates.io/env_logger/0.10.0 \
    crate://crates.io/env_logger/0.8.4 \
    crate://crates.io/errno-dragonfly/0.1.2 \
    crate://crates.io/errno/0.2.8 \
    crate://crates.io/fastrand/1.8.0 \
    crate://crates.io/getrandom/0.2.8 \
    crate://crates.io/glob/0.3.1 \
    crate://crates.io/heck/0.4.0 \
    crate://crates.io/hermit-abi/0.2.6 \
    crate://crates.io/humantime/2.1.0 \
    crate://crates.io/instant/0.1.12 \
    crate://crates.io/io-lifetimes/1.0.4 \
    crate://crates.io/is-terminal/0.4.2 \
    crate://crates.io/lazy_static/1.4.0 \
    crate://crates.io/lazycell/1.3.0 \
    crate://crates.io/libc/0.2.139 \
    crate://crates.io/libloading/0.7.4 \
    crate://crates.io/linux-raw-sys/0.1.4 \
    crate://crates.io/log/0.4.17 \
    crate://crates.io/malloc_buf/0.0.6 \
    crate://crates.io/memchr/2.5.0 \
    crate://crates.io/minimal-lexical/0.2.1 \
    crate://crates.io/nom/7.1.3 \
    crate://crates.io/objc/0.2.7 \
    crate://crates.io/once_cell/1.17.0 \
    crate://crates.io/os_str_bytes/6.4.1 \
    crate://crates.io/peeking_take_while/0.1.2 \
    crate://crates.io/prettyplease/0.2.0 \
    crate://crates.io/proc-macro-error-attr/1.0.4 \
    crate://crates.io/proc-macro-error/1.0.4 \
    crate://crates.io/proc-macro2/1.0.52 \
    crate://crates.io/quickcheck/1.0.3 \
    crate://crates.io/quote/1.0.26 \
    crate://crates.io/rand/0.8.5 \
    crate://crates.io/rand_core/0.6.4 \
    crate://crates.io/redox_syscall/0.2.16 \
    crate://crates.io/regex-syntax/0.6.28 \
    crate://crates.io/regex/1.7.1 \
    crate://crates.io/rustc-hash/1.1.0 \
    crate://crates.io/rustix/0.36.7 \
    crate://crates.io/shlex/1.1.0 \
    crate://crates.io/strsim/0.10.0 \
    crate://crates.io/syn/1.0.107 \
    crate://crates.io/syn/2.0.7 \
    crate://crates.io/tempfile/3.4.0 \
    crate://crates.io/termcolor/1.2.0 \
    crate://crates.io/unicode-ident/1.0.6 \
    crate://crates.io/unicode-width/0.1.10 \
    crate://crates.io/version_check/0.9.4 \
    crate://crates.io/wasi/0.11.0+wasi-snapshot-preview1 \
    crate://crates.io/which/4.4.0 \
    crate://crates.io/winapi-i686-pc-windows-gnu/0.4.0 \
    crate://crates.io/winapi-util/0.1.5 \
    crate://crates.io/winapi-x86_64-pc-windows-gnu/0.4.0 \
    crate://crates.io/winapi/0.3.9 \
    crate://crates.io/windows-sys/0.42.0 \
    crate://crates.io/windows_aarch64_gnullvm/0.52.4 \
    crate://crates.io/windows_aarch64_msvc/0.52.4 \
    crate://crates.io/windows_i686_gnu/0.52.4 \
    crate://crates.io/windows_i686_msvc/0.52.4 \
    crate://crates.io/windows_x86_64_gnu/0.52.4 \
    crate://crates.io/windows_x86_64_gnullvm/0.52.4 \
    crate://crates.io/windows_x86_64_msvc/0.52.4 \
    crate://crates.io/yansi-term/0.1.2 \
   \
    crate://crates.io/assert_matches/1.5.0 \
    crate://crates.io/autocfg/1.1.0 \
    crate://crates.io/bitflags/1.3.2 \
    crate://crates.io/byteorder/1.5.0 \
    crate://crates.io/bytes/0.4.12 \
    crate://crates.io/cfg-if/0.1.10 \
    crate://crates.io/cloudabi/0.0.3 \
    crate://crates.io/crossbeam-deque/0.7.4 \
    crate://crates.io/crossbeam-epoch/0.8.2 \
    crate://crates.io/crossbeam-queue/0.2.3 \
    crate://crates.io/crossbeam-utils/0.7.2 \
    crate://crates.io/fnv/1.0.7 \
    crate://crates.io/fuchsia-zircon-sys/0.3.3 \
    crate://crates.io/fuchsia-zircon/0.3.3 \
    crate://crates.io/hermit-abi/0.3.9 \
    crate://crates.io/iovec/0.1.4 \
    crate://crates.io/kernel32-sys/0.2.2 \
    crate://crates.io/lazy_static/1.4.0 \
    crate://crates.io/libc/0.2.153 \
    crate://crates.io/lock_api/0.3.4 \
    crate://crates.io/log/0.4.21 \
    crate://crates.io/maybe-uninit/2.0.0 \
    crate://crates.io/memchr/2.7.1 \
    crate://crates.io/memoffset/0.5.6 \
    crate://crates.io/mio-uds/0.6.8 \
    crate://crates.io/mio/0.6.23 \
    crate://crates.io/miow/0.2.2 \
    crate://crates.io/net2/0.2.39 \
    crate://crates.io/num_cpus/1.16.0 \
    crate://crates.io/parking_lot/0.9.0 \
    crate://crates.io/parking_lot_core/0.6.3 \
    crate://crates.io/pin-project-internal/1.1.5 \
    crate://crates.io/pin-project-lite/0.2.13 \
    crate://crates.io/pin-project/1.1.5 \
    crate://crates.io/pin-utils/0.1.0 \
    crate://crates.io/portable-atomic/1.6.0 \
    crate://crates.io/proc-macro2/1.0.79 \
    crate://crates.io/quote/1.0.35 \
    crate://crates.io/redox_syscall/0.1.57 \
    crate://crates.io/rustc_version/0.2.3 \
    crate://crates.io/scopeguard/1.2.0 \
    crate://crates.io/semver-parser/0.7.0 \
    crate://crates.io/semver/0.9.0 \
    crate://crates.io/slab/0.4.9 \
    crate://crates.io/smallvec/0.6.14 \
    crate://crates.io/static_assertions/1.1.0 \
    crate://crates.io/syn/2.0.52 \
    crate://crates.io/tokio-codec/0.1.2 \
    crate://crates.io/tokio-current-thread/0.1.7 \
    crate://crates.io/tokio-executor/0.1.10 \
    crate://crates.io/tokio-fs/0.1.7 \
    crate://crates.io/tokio-io/0.1.13 \
    crate://crates.io/tokio-reactor/0.1.12 \
    crate://crates.io/tokio-sync/0.1.8 \
    crate://crates.io/tokio-tcp/0.1.4 \
    crate://crates.io/tokio-threadpool/0.1.18 \
    crate://crates.io/tokio-timer/0.2.13 \
    crate://crates.io/tokio-udp/0.1.6 \
    crate://crates.io/tokio-uds/0.2.7 \
    crate://crates.io/tokio/0.1.22 \
    crate://crates.io/unicode-ident/1.0.12 \
    crate://crates.io/winapi-build/0.1.1 \
    crate://crates.io/winapi-i686-pc-windows-gnu/0.4.0 \
    crate://crates.io/winapi-x86_64-pc-windows-gnu/0.4.0 \
    crate://crates.io/winapi/0.2.8 \
    crate://crates.io/winapi/0.3.9 \
    crate://crates.io/ws2_32-sys/0.2.1 \
"

BB_STRICT_CHECKSUM = "0"
# TODO

DEPENDS = "\
        python3-colcon-ros-native \
        python3-colcon-cargo-native \
        python3-colcon-ros-cargo-native \
	python3-colcon-package-selection \
	python3-colcon-package-selection-native \
        cargo-ament-build-native \
        ament-cmake-native \
	ament-cmake-core-native \
        ament-package-native \
        ament-package \
	ros-workspace \
	rosidl-generator-c \
	rosidl-generator-c-native \
	rosidl-generator-cpp-native \
	rosidl-parser-native \
	rosidl-generator-py \
	rosidl-generator-py-native \
	rosidl-adapter \
	rosidl-adapter-native \
	rosidl-typesupport-introspection-c \
	rosidl-typesupport-introspection-c-native \
	rosidl-typesupport-c \
	rosidl-typesupport-c-native \
	rosidl-default-runtime \
	rosidl-default-generators-native \
	rosidl-default-generators \
	rosgraph-msgs \
	ament-lint-auto \
	ament-lint-native \
	ament-cmake-cppcheck \
	ament-cmake-cppcheck-native \
	ament-cpplint-native \
	ament-cmake-cpplint \
	ament-cmake-uncrustify \
	ament-uncrustify-native \
	rmw-implementation-cmake \
	rmw-implementation-cmake-native \
	rmw \
	rmw-implementation \
	builtin-interfaces \
	builtin-interfaces-native \
	rmw-native \
	ament-flake8-native \
	ament-cmake-flake8 \
	ament-cmake-pep257 \
	ament-pep257-native \
	python3 \
	python3-numpy \
	python3-numpy-native \
	python-cmake-module \
	python-cmake-module-native \
	std-msgs \
	libcxx \
	clang-native \
	rcl \
	gcc binutils \
"
inherit ros_ament_cmake
inherit cargo

# Modify these as desired
PV = "1.0+git${SRCPV}"
SRCREV = "d023665b8ced58e0076341adc9944f34befefce7"
S = "${WORKDIR}/git"

do_compile () {
	export AMENT_PREFIX_PATH="${STAGING_DIR_HOST}${prefix}:${STAGING_DIR_NATIVE}${prefix}"
	export RUSTFLAGS="${RUSTFLAGS}"
	export ROS_DISTRO="${ROS_DISTRO}"
	export BINDGEN_EXTRA_CLANG_ARGS="-D__LP64__=1 -D__WORDSIZE=64 -D __aarch64__"
	cd "${S}"
	colcon build --packages-up-to example_rust_node --install-base "${STAGING_DIR_HOST}${prefix}" --cmake-args -DCMAKE_VERBOSE_MAKEFILE=ON -DPYTHON_SOABI=${PYTHON_SOABI} --rust-target ${RUST_HOST_SYS} --cargo-args --offline ${BUILD_MODE}
}

do_install () {
	install -d "${D}${prefix}/share"
	install -d "${D}${prefix}/lib"
	install -d "${D}${prefix}/include"

	cp -r "${STAGING_DIR_HOST}${prefix}/example_messages"/*  "${D}${prefix}/"
	cp -r "${STAGING_DIR_HOST}${prefix}/example_rust_node"/*  "${D}${prefix}/"
}
FILES:${PN} = "\
	${prefix}/include \
	${prefix}/lib \
	${prefix}/share \
"

# To avoid `QA Issue: -dev package ros-rust-example-dev contains non-symlink .so '/usr/lib/librosgraph_msgs__rosidl_typesupport_fastrtps_c.so'`
FILES:${PN}-dev = ""

