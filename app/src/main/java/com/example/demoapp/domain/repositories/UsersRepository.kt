package com.example.demoapp.domain.repositories

import com.example.demoapp.domain.models.User

interface UsersRepository {

    suspend fun getUsers(): List<User>
}