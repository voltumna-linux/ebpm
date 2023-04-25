require recipes-core/images/voltumna-sre.inc
require include/ebpm.inc

append_to_osrelease() {
	cat <<-__EOF__ >> ${IMAGE_ROOTFS}/etc/os-release
	VARIANT_ID="${BPN}"
	VARIANT="elettron Beam Position Monitor (Runtime)"
	MACHINE="${MACHINE}"
	__EOF__
}
