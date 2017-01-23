DESCRIPTION = "Yocto recipe for rospy_tutorials"
SECTION = "devel"
LICENSE = "CLOSED"
DEPENDS += "std-msgs"
RDEPENDS_${PN} += ""

SRC_URI = "git://git@github.com/ros/ros_tutorials.git;protocol=ssh;branch=kinetic-devel"
S = "${WORKDIR}/git/${ROS_SPN}/"
SRCREV ?= "${AUTOREV}"
PV = "1.0.0+gitr${SRCPV}"

inherit catkin
