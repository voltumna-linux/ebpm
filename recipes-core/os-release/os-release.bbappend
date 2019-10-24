VARIANT = "Elettra Beam Position Monitor"
VARIANT_ID = "ebpm"

do_install_append () {
	cat <<-__EOF__ >> ${D}${sysconfdir}/os-release
	VARIANT="${VARIANT}"
	VARIANT_ID="${VARIANT_ID}"
	__EOF__
}

