package com.analyzer.probes

class SecurityProbes {
    // PROBE-SEC-001
    static final String API_KEY = 'AKIAIOSFODNN7EXAMPLE'

    // PROBE-SEC-002
    static String buildQuery(String id) {
        "SELECT * FROM users WHERE id = ${id}"
    }

    // PROBE-SEC-003
    static void ping(String host) {
        "ping -c 1 ${host}".execute()
    }
}
