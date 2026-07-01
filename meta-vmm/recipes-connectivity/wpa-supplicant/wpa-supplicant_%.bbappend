FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"

SRC_URI:append = " file://my-wpa-supplicant.conf"

do_install:append() {
    install -m 0600 ${WORKDIR}/my-wpa-supplicant.conf ${D}${sysconfdir}/wpa_supplicant.conf
}