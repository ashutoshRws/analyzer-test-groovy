package com.analyzer

import com.analyzer.models.User
import com.analyzer.utils.Greeter

class Main {
    static void main(String[] args) {
        def user = User.create('tester')
        println Greeter.greet(user.name)
    }
}
