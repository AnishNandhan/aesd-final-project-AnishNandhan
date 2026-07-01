LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI = "git://git@github.com/AnishNandhan/myVMM.git;protocol=ssh;branch=main"

PV = "1.0+git${SRCPV}"
SRCREV = "67947f456f492f74773a1e7f8a75d05ead696d43"

S = "${WORKDIR}/git"

FILE:${PN} = "${bindir}/vmm"

do_configure () {
	:
}

do_compile () {
	oe_runmake
}

do_install () {
	install -d ${D}${bindir}
	install -m 0755 ${S}/vmm ${D}${bindir}
}