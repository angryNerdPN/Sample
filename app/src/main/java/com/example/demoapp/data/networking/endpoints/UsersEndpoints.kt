package com.example.demoapp.data.networking.endpoints

import com.example.demoapp.domain.models.User
import javax.inject.Inject

// Should be interface
class UsersEndpoints @Inject constructor() {

    suspend fun getUsers(): List<User> = listOf(
        User(0, "John", "Rich"),
        User(1, "Alex", "Snow"),
        User(2, "Peter", "Bridge"),
    )
}