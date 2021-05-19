package com.example.demoapp

import com.example.demoapp.core.utils.TestUtils
import org.junit.Assert
import org.junit.Test

class LoginTest {

    @Test
    fun `check if email is empty`() {
        val email = ""
        Assert.assertEquals(false, TestUtils.emailPatternValidator.validate(email))
    }

    @Test
    fun `check if email is null`() {
        val email = null
        Assert.assertEquals(false, TestUtils.emailPatternValidator.validate(email))
    }

    @Test
    fun `check if email has wrong pattern`() {
        val email = "abc@@@com"
        Assert.assertEquals(false, TestUtils.emailPatternValidator.validate(email))
    }

    @Test
    fun `check correct email pattern`() {
        val email = "email@mail.com"
        Assert.assertEquals(true, TestUtils.emailPatternValidator.validate(email))
    }

    @Test
    fun `check if password is too short`() {
        val password = "abc"
        Assert.assertEquals(false, TestUtils.passwordLengthValidator.validate(password))
    }

    @Test
    fun `check if password contains at least 1 capital character`() {
        val password = "Avc12"
        Assert.assertEquals(true, TestUtils.passwordContainsCapitalCharacterValidator.validate(password))
    }

    @Test
    fun `check if password contains only alphabetical and numerical characters`() {
        val password = "Password123"
        Assert.assertEquals(true, TestUtils.passwordContainsOnlyAlphabeticalAndNumericalCharactersValidator.validate(password))
    }

}