package com.example.demoapp.data.di

import com.example.demoapp.data.services.UsersService
import com.example.demoapp.data.services.api.UsersApiService
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
interface ServicesModule {

    @Binds
    fun bindUsersApiService(service: UsersApiService): UsersService.Api
}