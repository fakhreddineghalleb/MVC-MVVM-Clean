package com.actia.arch.clean.domain

import com.actia.arch.clean.data.UserMVVMClean
import com.actia.arch.clean.data.UserRepositoryClean

class FetchUserListUseCase(private val userRepository: UserRepositoryClean) {
    fun execute(callback: (List<UserMVVMClean>) -> Unit) {
        userRepository.fetchUserList()
    }
}