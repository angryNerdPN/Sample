package com.example.demoapp.domain.usecases

import com.example.demoapp.domain.models.User
import com.example.demoapp.domain.repositories.UsersRepository
import com.example.demoapp.domain.usecases.base.UseCase
import javax.inject.Inject

class GetUsersUseCase @Inject constructor(
    private val usersRepository: UsersRepository
) : UseCase<Unit, List<User>>() {

    override suspend fun run(params: Unit): List<User> = usersRepository.getUsers()

}