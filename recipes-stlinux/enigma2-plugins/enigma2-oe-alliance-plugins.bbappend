DESCRIPTION = "Additional plugins for Enigma2"
MAINTAINER = "oe-alliance team"
PACKAGE_ARCH = "${MACHINE_ARCH}"

# Remove dependencies that cannot be built for sh4
RDEPENDS_enigma2-plugin-systemplugins-vfdcontrol_spark = ""
RDEPENDS_enigma2-plugin-systemplugins-vfdcontrol_spark7162 = ""
DEPENDS_enigma2-plugin-extensions-hbbtv_spark = ""
DEPENDS_enigma2-plugin-extensions-hbbtv_spark7162 = ""
RDEPENDS_enigma2-plugin-extensions-hbbtv_spark = ""
RDEPENDS_enigma2-plugin-extensions-hbbtv_spark7162 = ""

SRC_URI_spark="git://github.com/DvbMedia/oe-alliance-plugins.git;protocol=git"
SRC_URI_spark7162="git://github.com/DvbMedia/oe-alliance-plugins.git;protocol=git"

