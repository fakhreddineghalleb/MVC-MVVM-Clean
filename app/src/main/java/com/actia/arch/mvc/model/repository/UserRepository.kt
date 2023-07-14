package com.actia.arch.mvc.model.repository

import com.actia.arch.mvc.model.data.User

class UserRepository {

    fun getUser(callback: (MutableList<User>) -> Unit) {
        // Simulated network or database operation
        // Fetch user data and invoke the callback
        val user = mutableListOf<User>(
            User("1", "John Doe", "john.doe@example.com"),
            User("1", "John Doe", "john.doe@example.com"),
            User("1", "John Doe", "john.doe@example.com"),
            User("1", "John Doe", "john.doe@example.com"),
            User("1", "John Doe", "john.doe@example.com"),
            User("1", "John Doe", "john.doe@example.com"),
            User("1", "John Doe", "john.doe@example.com"),
            User("1", "John Doe", "john.doe@example.com"),
            User("1", "John Doe", "john.doe@example.com"),
            User("1", "John Doe", "john.doe@example.com"),
            User("1", "John Doe", "john.doe@example.com"),
            User("1", "John Doe", "john.doe@example.com"),
            User("1", "John Doe", "john.doe@example.com"),
        )
        callback(user)
    }
}