package com.br.user.restapi

import com.br.user.infra.dto.UserRequest
import com.br.user.application.UserService
import io.swagger.annotations.Api
import org.springframework.http.HttpStatus
import org.springframework.validation.annotation.Validated
import org.springframework.web.bind.annotation.*
import javax.validation.Valid

@Api(tags = ["Recebe uma solicitação de criação de um novo USER"])
@Validated
@RestController
@RequestMapping(value = ["users"], produces = ["application/json; charset=UTF-8"])
class UserController(private val userService: UserService) {

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    fun createUser(@RequestBody userRequest: @Valid UserRequest) {
        userService.createUser(userRequest)
    }
}