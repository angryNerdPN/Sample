package com.example.demoapp.data.di

import com.example.demoapp.data.repositories.DefaultUsersRepository
import com.example.demoapp.domain.repositories.UsersRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
interface RepositoriesModule {

    @Binds
    fun bindUsersRepository(repository: DefaultUsersRepository): UsersRepository
}