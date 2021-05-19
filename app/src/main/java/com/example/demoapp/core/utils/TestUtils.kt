package com.example.demoapp.core.utils

import androidx.core.util.PatternsCompat
import java.util.regex.Pattern

object TestUtils {

    val emailPatternValidator = InputValidator("Wrong email pattern.") { input ->
        input != null && PatternsCompat.EMAIL_ADDRESS.matcher(input).matches()
    }

    val passwordLengthValidator = InputValidator("Password must have at least 8 characters.") { input ->
        input != null && input.length >= 8
    }

    val passwordContainsOnlyAlphabeticalAndNumericalCharactersValidator = InputValidator("Wrong password pattern") { input ->
        input != null && Pattern.matches("^[a-zA-Z0-9]*\$", input)
    }

    val passwordContainsCapitalCharacterValidator =  InputValidator("Password must have at least 1 capital character.") { input ->
        input != null && input.asSequence().any { it.isUpperCase() }
    }
}