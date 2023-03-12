package com.legion.coreBusiness

import com.legion.coreBusiness.createAccount.CreateAccountResult
import com.legion.coreBusiness.login.LoginResult
import kotlinx.coroutines.flow.Flow

interface AccessControlRepository {

    fun createBankAccount(email: String, password: Array<Char>): Flow<CreateAccountResult>

    fun login(email: String, password: Array<Char>): Flow<LoginResult>

}