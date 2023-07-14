package com.actia.arch.clean.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.actia.arch.clean.data.UserMVVMClean
import com.actia.arch.clean.domain.UserViewModelClean
import com.actia.arch.databinding.ActivityMainBinding
import com.actia.arch.mvvm.model.UserMVVM
import com.actia.arch.mvvm.viewmodel.UserViewModel

class MainActivityMvvmClean : AppCompatActivity() {

    private lateinit var userViewModel: UserViewModelClean
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        userViewModel = ViewModelProvider(this)[UserViewModelClean::class.java]

        // Observe the LiveData list of users
        userViewModel.userList.observe(this) { userList ->
            // Update UI with the new user list
            updateUserList(userList)
        }

        binding.rvUsers.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)


        // Trigger fetching user data
        userViewModel.fetchUserList()
    }

    // Update UI with the user list
    private fun updateUserList(userList: List<UserMVVMClean>) {
        // Update your UI with the new list of users
        binding.rvUsers.adapter = UserMVVMCleanAdapter(userList)
    }
}