FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"

SRC_URI += "file://0001-WIP.patch \
            file://0002-Remove-error-on-target-flag.patch \
            file://0003-Make-args-mutable.patch \
            file://0004-WIP-split-args.patch \
            file://0005-WIP-update-src_dir-based-on-rust_target.patch \
            "

