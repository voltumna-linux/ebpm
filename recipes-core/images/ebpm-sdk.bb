require recipes-core/images/voltumna-sdk.inc
require recipes-core/images/elettra-sdk.inc
require include/ebpm.inc

IMAGE_INSTALL:append = ""

TOOLCHAIN_HOST_TASK:append = ""

append_to_osrelease() {
	cat <<-__EOF__ >> ${IMAGE_ROOTFS}/etc/os-release
	VARIANT_ID="${BPN}"
	VARIANT="elettrons Beam Position Monitor (Cross Development)"
	MACHINE="${MACHINE}"
	__EOF__
}
