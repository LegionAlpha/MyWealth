package com.legion.coreBusiness.createAccount

import com.legion.coreBusiness.AccessControlRepository
import kotlinx.coroutines.flow.Flow

class CreateAccountUseCase(private val repository: AccessControlRepository) {

    operator fun invoke(email: String, password: Array<Char>): Flow<CreateAccountResult> {
        return repository.createBankAccount(email, password)
    }

}