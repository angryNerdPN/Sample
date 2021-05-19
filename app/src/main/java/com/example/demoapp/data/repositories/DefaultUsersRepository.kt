package com.example.demoapp.data.repositories

import com.example.demoapp.data.services.UsersService
import com.example.demoapp.domain.models.User
import com.example.demoapp.domain.repositories.UsersRepository
import javax.inject.Inject

class DefaultUsersRepository @Inject constructor(
    private val usersApiService: UsersService.Api
) : UsersRepository {

    override suspend fun getUsers(): List<User> = usersApiService.getUsers()
}