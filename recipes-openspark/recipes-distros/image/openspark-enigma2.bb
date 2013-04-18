DESCRIPTION = "Merge machine and distro options to create a enigma2 machine task/package"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/LICENSE;md5=3f40d7994397109285ec7b81fdeb3b58 \
                    file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

PV = "1.0"
PR = "r1"

inherit task

DEPENDS = "enigma2-pliplugins openspark-feeds openspark-3rdparty-plugins"

RRECOMMENDS = "\
	openspark-version-info \
	enigma2-plugin-drivers-usbserial \
	enigma2-plugin-extensions-ppanel \
	enigma2-plugin-pli-softcamsetup \
	enigma2-plugin-extensions-graphmultiepg \
	enigma2-plugin-extensions-mediaplayer \
	enigma2-plugin-extensions-cutlisteditor \
	enigma2-plugin-extensions-dvdplayer \
	enigma2-plugin-extensions-zaphistorybrowser \
	enigma2-plugin-extensions-gbaspectratioswitch \
	enigma2-plugin-systemplugins-videotune \
	enigma2-plugin-systemplugins-skinselector \
	enigma2-plugin-systemplugins-autoresolution \
	enigma2-plugin-systemplugins-softwaremanager \
	enigma2-plugin-systemplugins-devicemanager \
	enigma2-plugin-systemplugins-swapmanager \
	enigma2-plugin-systemplugins-fastscan \	
	"
	
RRECOMMENDS_append_spark = " swap-workaround"
RRECOMMENDS_append_spark7162 = " swap-workaround"	
