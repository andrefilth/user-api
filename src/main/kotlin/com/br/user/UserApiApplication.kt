package com.br.user

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cache.annotation.EnableCaching
import org.springframework.data.web.config.EnableSpringDataWebSupport

@EnableSpringDataWebSupport
@EnableCaching
@SpringBootApplication
class UserApiApplication

fun main(args: Array<String>) {
	runApplication<UserApiApplication>(*args)
}
