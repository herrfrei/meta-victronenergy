DESCRIPTION = "A plugin that turns FlashMQ into a dbus aware MQTT broker."

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=a5815abd99fd5defcd36000125b24f99"
DEPENDS = "dbus"

inherit cmake

SRC_URI = "git://github.com/victronenergy/dbus-flashmq.git;protocol=https"
SRCREV = "74c3d80eb5782e2b70edf9a33cf5be6570f267c0"
S = "${WORKDIR}/git"
EXTRA_OECMAKE = "-DCMAKE_BUILD_TYPE=Release"

PACKAGES =+ "${PN}-test"

FILES:${PN}-test = "${bindir}/flashmq-dbus-plugin-tests"
