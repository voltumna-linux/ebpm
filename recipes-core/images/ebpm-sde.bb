require recipes-core/images/voltumna-sde.bb
require include/ebpm.inc

IMAGE_INSTALL:append = ""

append_to_osrelease() {
	cat <<-__EOF__ >> ${IMAGE_ROOTFS}/etc/os-release
	VARIANT_ID="${BPN}"
	VARIANT="elettron Beam Position Monitor (Development)"
	MACHINE="${MACHINE}"
	__EOF__
}
