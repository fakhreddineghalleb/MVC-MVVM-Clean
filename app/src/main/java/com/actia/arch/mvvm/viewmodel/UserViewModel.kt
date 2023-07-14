package com.actia.arch.mvvm.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.actia.arch.mvvm.model.UserMVVM
import com.actia.arch.mvvm.repository.UserRepositoryMVVM

class UserViewModel : ViewModel() {
    private val userRepository = UserRepositoryMVVM()

    // LiveData list of users
    val userList: LiveData<List<UserMVVM>> = userRepository.getUserList()

    // Fetch user data
    fun fetchUserList() {
        userRepository.fetchUserList()
    }
}