// Put your package name here. Check your activity for reference.
package com.example.xyz

class CredentialsManager {
    fun isEmailValid(email: String) {

    }

    fun isPasswordValid(password: String): Boolean {
        // Minimum password length requirement
        if (password.length < 8) return false

        // Check for at least one uppercase letter
        if (!password.any { it.isUpperCase() }) return false

        // Check for at least one lowercase letter
        if (!password.any { it.isLowerCase() }) return false

        // Check for at least one digit
        if (!password.any { it.isDigit() }) return false

        // Check for at least one special character
        if (!password.any { !it.isLetterOrDigit() }) return false

        // If all conditions are met, return true
        return true
    }

}