package com.example.demoapp.core.utils

class InputValidator(
    val errorMessage: String,
    val validationRule: (String?) -> Boolean
) {

    fun validate(input: String?): Boolean = validationRule(input)
}