# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)

LICENSE = "Apache-2.0 & Unknown"
LIC_FILES_CHKSUM = "file://src/ros2/common_interfaces/LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57 \
                    file://src/ros2/common_interfaces/sensor_msgs_py/LICENSE;md5=beb995861a4848002f265f16e172ce6d \
                    file://src/ros2/example_interfaces/LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57 \
                    file://src/ros2/rcl_interfaces/LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57 \
                    file://src/ros2/rosidl_defaults/LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57 \
                    file://src/ros2/test_interface_files/LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57 \
                    file://src/ros2/unique_identifier_msgs/LICENSE;md5=2f4caf67bfc477e6c47143b029271124 \
                    file://src/ros2_rust/LICENSE;md5=86d3f3a95c324c9479bd8986968f4327"

SRC_URI = "gitsm://github.com/jdiez17/ros2_rust_example;protocol=https;branch=master"

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
	rosidl-adapter \
	rosidl-adapter-native \
	rosidl-typesupport-introspection-c \
	rosidl-typesupport-introspection-c-native \
	rosidl-typesupport-c \
	rosidl-typesupport-c-native \
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
	rmw-native \
"

inherit ros_ament_cmake

# Modify these as desired
PV = "1.0+git${SRCPV}"
SRCREV = "3e1126a711324c9b43137ae1fb59502852e93708"

S = "${WORKDIR}/git"

# NOTE: no Makefile found, unable to determine what needs to be done

do_configure () {
	# Specify any needed configure commands here
	:
}

do_compile () {
	#export AMENT_PREFIX_PATH="${STAGING_DATADIR}/ros_workspace"
	#export AMENT_PREFIX_PATH="${STAGING_DIR_HOST}${prefix}" #;${STAGING_DIR_NATIVE}${prefix}"
	#export AMENT_PREFIX_PATH="${STAGING_DIR_HOST}${prefix};${STAGING_DIR_NATIVE}${prefix}"
	${PYTHON_PN} -c "import sys; print(sys.path)"
	cd "${S}"
	colcon build --packages-up-to example_rust_node
}

do_install () {
	# Specify install commands here
	:
}

