DESCRIPTION = "Base packages require for image."
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/LICENSE;md5=3f40d7994397109285ec7b81fdeb3b58 \
                    file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

PV = "1.0"
PR = "r7"

inherit task

RDEPENDS = "\
	oe-alliance-enigma2 \
	openatv-enigma2 \
	openatvspark-bootlogo \
	openatv-spinner \
	openatv-feed-config \
	avahi-daemon \
	dropbear \
	early-configure \
	e2fsprogs-mke2fs \
	e2fsprogs-e2fsck \
	e2fsprogs-tune2fs \
	util-linux-blkid \
	fakelocale \
	libavahi-client \
	libcrypto-compat \
	ntpdate \
	openssh-sftp-server \	
	opkg \
	sdparm \
	task-base \
	task-core-boot \
	tzdata \
	util-linux-sfdisk \
	volatile-media \
	vsftpd \
	ntfs-3g \
	hddtemp \
	busybox-cron \
	python-imaging \
	"
