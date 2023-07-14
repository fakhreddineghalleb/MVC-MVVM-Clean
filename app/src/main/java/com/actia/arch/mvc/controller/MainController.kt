package com.actia.arch.mvc.controller

import com.actia.arch.mvc.model.data.User
import com.actia.arch.mvc.model.repository.UserRepository

class MainController(private val userRepository: UserRepository) {

    fun loadUser(callback: (MutableList<User>) -> Unit) {
        userRepository.getUser(callback)
    }

}