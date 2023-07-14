package com.actia.arch.mvvm.repository

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.actia.arch.mvvm.model.UserMVVM

class UserRepositoryMVVM {

    private val userListLiveData: MutableLiveData<List<UserMVVM>> = MutableLiveData()

    // Get the LiveData list of users
    fun getUserList(): LiveData<List<UserMVVM>> {
        return userListLiveData
    }

    // Fetch user data and update the LiveData list
    fun fetchUserList() {
        // Simulated network or database operation
        // Fetch user data and update the userListLiveData
        val userList = listOf(
            UserMVVM("1", "John Doe", "john.doe@example.com"),
            UserMVVM("2", "Jane Smith", "jane.smith@example.com"),
            UserMVVM("3", "Jane Smith", "jane.smith@example.com"),
            UserMVVM("1", "John Doe", "john.doe@example.com"),
            UserMVVM("2", "Jane Smith", "jane.smith@example.com"),
            UserMVVM("1", "John Doe", "john.doe@example.com"),
            UserMVVM("2", "Jane Smith", "jane.smith@example.com"),
            UserMVVM("1", "John Doe", "john.doe@example.com"),
            UserMVVM("2", "Jane Smith", "jane.smith@example.com"),
            UserMVVM("1", "John Doe", "john.doe@example.com"),
            UserMVVM("2", "Jane Smith", "jane.smith@example.com"),
            UserMVVM("1", "John Doe", "john.doe@example.com"),
            UserMVVM("2", "Jane Smith", "jane.smith@example.com")
        )
        userListLiveData.value = userList
    }
}