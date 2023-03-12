package com.legion.coreBusiness.login

import com.legion.coreBusiness.AccessControlRepository
import kotlinx.coroutines.flow.Flow

class LoginUseCase(private val repository: AccessControlRepository) {

    operator fun invoke(email: String, password: Array<Char>): Flow<LoginResult> {
        return repository.login(email, password)
    }

}