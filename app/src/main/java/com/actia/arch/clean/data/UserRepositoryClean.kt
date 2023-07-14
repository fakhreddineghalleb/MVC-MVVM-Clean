package com.actia.arch.clean.data

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.actia.arch.mvvm.model.UserMVVM


class UserRepositoryClean {
    private val userListLiveData: MutableLiveData<List<UserMVVMClean>> = MutableLiveData()

    // Get the LiveData list of users
    fun getUserList(): LiveData<List<UserMVVMClean>> {
        return userListLiveData
    }

    fun fetchUserList() {
        generateUserList()
    }

    private fun generateUserList() {
        val userList = listOf(
            UserMVVMClean("1", "John Doe", "john.doe@example.com"),
            UserMVVMClean("2", "Jane Smith", "jane.smith@example.com"),
            UserMVVMClean("3", "Jane Smith", "jane.smith@example.com"),
            UserMVVMClean("1", "John Doe", "john.doe@example.com"),
            UserMVVMClean("2", "Jane Smith", "jane.smith@example.com"),
            UserMVVMClean("1", "John Doe", "john.doe@example.com"),
            UserMVVMClean("2", "Jane Smith", "jane.smith@example.com"),
            UserMVVMClean("1", "John Doe", "john.doe@example.com"),
            UserMVVMClean("2", "Jane Smith", "jane.smith@example.com"),
            UserMVVMClean("1", "John Doe", "john.doe@example.com"),
            UserMVVMClean("2", "Jane Smith", "jane.smith@example.com"),
            UserMVVMClean("1", "John Doe", "john.doe@example.com"),
            UserMVVMClean("2", "Jane Smith", "jane.smith@example.com")
        )
        userListLiveData.value = userList

    }
}