do_install:append() {
    sed -i 's|iface wlan0|auto wlan0\niface wlan0|' ${D}${sysconfdir}/network/interfaces
}