SRC_URI += " \
crate://crates.io/addr2line/0.21.0 \
crate://crates.io/adler/1.0.2 \
crate://crates.io/aho-corasick/1.1.2 \
crate://crates.io/android-tzdata/0.1.1 \
crate://crates.io/android_system_properties/0.1.5 \
crate://crates.io/anyhow/1.0.81 \
crate://crates.io/autocfg/1.1.0 \
crate://crates.io/backtrace/0.3.69 \
crate://crates.io/bitflags/1.3.2 \
crate://crates.io/bitflags/2.4.2 \
crate://crates.io/bumpalo/3.15.4 \
crate://crates.io/byteorder/1.5.0 \
crate://crates.io/cc/1.0.90 \
crate://crates.io/cfg-if/1.0.0 \
crate://crates.io/chrono/0.4.35 \
crate://crates.io/core-foundation-sys/0.8.6 \
crate://crates.io/gimli/0.28.1 \
crate://crates.io/iana-time-zone-haiku/0.1.2 \
crate://crates.io/iana-time-zone/0.1.60 \
crate://crates.io/io-kit-sys/0.4.0 \
crate://crates.io/js-sys/0.3.69 \
crate://crates.io/libc/0.2.153 \
crate://crates.io/libudev-sys/0.1.4 \
crate://crates.io/libudev/0.3.0 \
crate://crates.io/log/0.4.21 \
crate://crates.io/mach2/0.4.2 \
crate://crates.io/memchr/2.7.1 \
crate://crates.io/miniz_oxide/0.7.2 \
crate://crates.io/nix/0.26.4 \
crate://crates.io/num-traits/0.2.18 \
crate://crates.io/object/0.32.2 \
crate://crates.io/once_cell/1.19.0 \
crate://crates.io/pkg-config/0.3.30 \
crate://crates.io/proc-macro2/1.0.79 \
crate://crates.io/quote/1.0.35 \
crate://crates.io/regex-automata/0.4.6 \
crate://crates.io/regex-syntax/0.8.2 \
crate://crates.io/regex/1.10.3 \
crate://crates.io/rustc-demangle/0.1.23 \
crate://crates.io/scopeguard/1.2.0 \
crate://crates.io/serialport/4.3.0 \
crate://crates.io/syn/2.0.52 \
crate://crates.io/thiserror-impl/1.0.58 \
crate://crates.io/thiserror/1.0.58 \
crate://crates.io/unescaper/0.1.4 \
crate://crates.io/unicode-ident/1.0.12 \
crate://crates.io/wasm-bindgen-backend/0.2.92 \
crate://crates.io/wasm-bindgen-macro-support/0.2.92 \
crate://crates.io/wasm-bindgen-macro/0.2.92 \
crate://crates.io/wasm-bindgen-shared/0.2.92 \
crate://crates.io/wasm-bindgen/0.2.92 \
crate://crates.io/winapi-i686-pc-windows-gnu/0.4.0 \
crate://crates.io/winapi-x86_64-pc-windows-gnu/0.4.0 \
crate://crates.io/winapi/0.3.9 \
crate://crates.io/windows-core/0.52.0 \
crate://crates.io/windows-targets/0.52.4 \
crate://crates.io/windows_aarch64_gnullvm/0.52.4 \
crate://crates.io/windows_aarch64_msvc/0.52.4 \
crate://crates.io/windows_i686_gnu/0.52.4 \
crate://crates.io/windows_i686_msvc/0.52.4 \
crate://crates.io/windows_x86_64_gnu/0.52.4 \
crate://crates.io/windows_x86_64_gnullvm/0.52.4 \
crate://crates.io/windows_x86_64_msvc/0.52.4 \
"

DEPENDS += " pkgconfig-native pkgconfig udev"
