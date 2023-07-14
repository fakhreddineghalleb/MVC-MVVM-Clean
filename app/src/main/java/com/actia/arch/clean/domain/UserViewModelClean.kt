package com.actia.arch.clean.domain

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.actia.arch.clean.data.UserMVVMClean
import com.actia.arch.clean.data.UserRepositoryClean

class UserViewModelClean: ViewModel() {
    private val userRepository = UserRepositoryClean()

    // LiveData list of users
    val userList: LiveData<List<UserMVVMClean>> = userRepository.getUserList()

    // Fetch user data
    fun fetchUserList() {
        userRepository.fetchUserList()
    }
}