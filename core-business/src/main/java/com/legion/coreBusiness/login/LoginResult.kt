package com.legion.coreBusiness.login

import com.legion.coreBusiness.createAccount.CreateAccountError

sealed class LoginResult {
    object Success: LoginResult()
    data class Error(val error: CreateAccountError): LoginResult()
}

sealed class LoginError {
    data class ExternalError(val errorMessage: String): LoginError()
    data class ConnectionError(val errorMessage: String): LoginError()
}