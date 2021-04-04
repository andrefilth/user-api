package com.br.user.application

import com.br.user.infra.dto.UserRequest
import org.springframework.stereotype.Service
import javax.validation.Valid

@Service
class UserService {
    fun createUser(userRequest: @Valid UserRequest) {

    }

}
