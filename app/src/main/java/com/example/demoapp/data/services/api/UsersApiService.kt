package com.example.demoapp.data.services.api

import com.example.demoapp.data.networking.endpoints.UsersEndpoints
import com.example.demoapp.data.services.UsersService
import com.example.demoapp.data.services.base.ApiService
import com.example.demoapp.domain.models.User
import javax.inject.Inject

class UsersApiService @Inject constructor(
    private val endpoints: UsersEndpoints
) : ApiService(), UsersService.Api {

    override suspend fun getUsers(): List<User> = request { endpoints.getUsers() }

}