package com.example.demoapp.data.services

import com.example.demoapp.domain.models.User

interface UsersService {

    interface Api : UsersService {

        suspend fun getUsers(): List<User>
    }

    interface DataBase: UsersService {

    }
}