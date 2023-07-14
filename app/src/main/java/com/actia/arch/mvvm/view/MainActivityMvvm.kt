package com.actia.arch.mvvm.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.actia.arch.databinding.ActivityMainBinding
import com.actia.arch.mvvm.model.UserMVVM
import com.actia.arch.mvvm.viewmodel.UserViewModel

class MainActivityMvvm : AppCompatActivity() {
    private lateinit var userViewModel: UserViewModel
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        userViewModel = ViewModelProvider(this).get(UserViewModel::class.java)

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
    private fun updateUserList(userList: List<UserMVVM>) {
        // Update your UI with the new list of users
        binding.rvUsers.adapter = UserMVVMAdapter(userList)
    }
}