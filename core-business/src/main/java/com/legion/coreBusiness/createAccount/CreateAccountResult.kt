package com.legion.coreBusiness.createAccount

sealed class CreateAccountResult {
    object Success: CreateAccountResult()
    data class Error(val error: CreateAccountError): CreateAccountResult()
}

sealed class CreateAccountError {
    data class ExternalError(val errorMessage: String): CreateAccountError()
    data class ConnectionError(val errorMessage: String): CreateAccountError()
}