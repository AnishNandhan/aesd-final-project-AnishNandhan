CORE_IMAGE_EXTRA_INSTALL:append = " vmm guest-os"
DISTRO_FEATURES:append = " virtualization"
IMAGE_INSTALL:append = " linux-firmware-rpidistro-bcm43455 python3 iw ntp wpa-supplicant"
IMAGE_FEATURES:append = " ssh-server-openssh"
