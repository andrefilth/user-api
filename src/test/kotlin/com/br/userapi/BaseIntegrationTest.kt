package com.br.userapi

import org.springframework.beans.factory.annotation.Value
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment
import org.springframework.test.context.ActiveProfiles

@ActiveProfiles("test")
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT
//        , classes = [TestRedisConfiguration::class]
)
class BaseIntegrationTest {

    val path = "/api"

    @Value("http://localhost:\${local.server.port}")
    protected var baseUri: String? = null

    fun init(){

//        RestAssbaseURI = baseUri
//        basePath = BaseIntegrationTest.path
//        enableLoggingOfRequestAndResponseIfValidationFails()

    }
}