package com.analyzer

import com.analyzer.models.User
import com.analyzer.utils.Greeter
import spock.lang.Specification

class AppSpec extends Specification {
    def "greet works"() {
        expect:
        Greeter.greet('world') == 'Hello, world'
    }

    def "create user works"() {
        expect:
        User.create('a').name == 'a'
    }
}
