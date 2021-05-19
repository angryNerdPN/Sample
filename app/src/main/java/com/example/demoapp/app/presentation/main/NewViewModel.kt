package com.example.demoapp.app.presentation.main

import androidx.lifecycle.*
import com.example.demoapp.core.livedata.Resource
import com.example.demoapp.domain.models.User
import com.example.demoapp.domain.usecases.GetUsersUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class NewViewModel @Inject constructor(
    private val getUsers: GetUsersUseCase,
    private val savedStateHandle: SavedStateHandle
) : ViewModel() {

    private val _users = MutableLiveData<Resource<List<User>>>()
    val users: LiveData<Resource<List<User>>> = _users

    fun getUsers() {
        _users.value = Resource.Loading()
        getUsers(
            viewModelScope,
            Unit,
            ::onGetUsersSuccess,
            ::onGetUsersFailure
        )
    }

    private fun onGetUsersSuccess(users: List<User>) {
        _users.value = Resource.Success(users)
    }

    private fun onGetUsersFailure(throwable: Throwable) {
        _users.value = Resource.Error(throwable)
    }

}