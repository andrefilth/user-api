package com.br.user.infra.dto

import com.br.user.infra.annotation.Email
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import io.swagger.annotations.ApiModelProperty

@JsonInclude(JsonInclude.Include.NON_NULL)
data class UserRequest(
        @JsonProperty("consumer_id")
        val consumerId: String,

        @ApiModelProperty(name = "Senha", example = "1234", required = true)
        val password: String,

        @JsonProperty("user_name")
        val userName: String,

        @ApiModelProperty(name = "email", example = "andrelgfranco@gmail.com", required = true)
        @Email
        @JsonProperty("email")
        val email: String,

        @JsonProperty("phone_number")
        val phoneNumber: String,

        @JsonProperty("installation_id")
        val installationId: String,

        @JsonProperty("android_id")
        val androidId: String? = null,

        @JsonProperty("device_id")
        val deviceId: String,

        @JsonProperty("device_model")
        val deviceModel: String

){


}


