LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI = "git://git@github.com/AnishNandhan/myGuestOS.git;protocol=ssh;branch=main"

PV = "1.0+git${SRCPV}"
SRCREV = "03331cae8682f4d4666d64f5af31ee24d15dd817"

S = "${WORKDIR}/git"

FILES:${PN} = "${libdir}/guest.img"

do_configure () {
	:
}

do_compile () {
	oe_runmake
}

do_install () {
	install -d ${D}${libdir}
	install -m 0644 ${S}/guest.img ${D}${libdir}
}