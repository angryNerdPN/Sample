package com.example.demoapp.data.services.base

abstract class ApiService {

    suspend fun <T> request(apiCall: suspend () -> T): T {
        return try {
            apiCall.invoke()
        } catch (throwable: Throwable) {
            throw Exception(throwable)
        }
    }
}