package com.analyzer.models

class User {
    int id
    String name

    static User create(String name) {
        new User(id: 1, name: name)
    }
}
