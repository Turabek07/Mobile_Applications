package com.example.xyz

import junit.framework.TestCase.assertEquals
import org.junit.Test

class CredentialsManagerTest {

    // Test empty email
    @Test
    fun givenEmptyEmail_thenReturnFalse() {
        val credentialsManager = CredentialsManager()

        val isEmailValid = credentialsManager.isEmailValid("")

        assertEquals(false, isEmailValid)
    }

    // Test wrong email format
    @Test
    fun givenWrongEmailFormat_thenReturnFalse() {
        val credentialsManager = CredentialsManager()

        val isEmailValid = credentialsManager.isEmailValid("invalid-email")

        assertEquals(false, isEmailValid)
    }

    // Test proper email
    @Test
    fun givenProperEmailFormat_thenReturnTrue() {
        val credentialsManager = CredentialsManager()

        val isEmailValid = credentialsManager.isEmailValid("example@example.com")

        assertEquals(true, isEmailValid)
    }

    // Test empty password
    @Test
    fun givenEmptyPassword_thenReturnFalse() {
        val credentialsManager = CredentialsManager()

        val isPasswordValid = credentialsManager.isPasswordValid("")

        assertEquals(false, isPasswordValid)
    }

    // Test filled password
    @Test
    fun givenValidPassword_thenReturnTrue() {
        val credentialsManager = CredentialsManager()

        val isPasswordValid = credentialsManager.isPasswordValid("securePassword123")

        assertEquals(true, isPasswordValid)
    }
}
