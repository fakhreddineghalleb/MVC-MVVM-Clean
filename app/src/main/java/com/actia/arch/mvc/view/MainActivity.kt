package com.actia.arch.mvc.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.actia.arch.R
import com.actia.arch.mvc.controller.MainController
import com.actia.arch.databinding.ActivityMainBinding
import com.actia.arch.mvc.model.data.User
import com.actia.arch.mvc.model.repository.UserRepository

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private lateinit var controller: MainController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val userRepository = UserRepository()
        controller = MainController(userRepository)

        binding.rvUsers.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)

        binding.buttonLoadUser.setOnClickListener {
            controller.loadUser { user ->
                updateUser(user)
            }
        }

    }

    // Update UI with user data
    fun updateUser(users: MutableList<User>) {
        binding.rvUsers.adapter = UserAdapter(users)
    }
}