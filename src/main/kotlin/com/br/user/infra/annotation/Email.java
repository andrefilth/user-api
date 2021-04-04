package com.br.user.infra.annotation;

import javax.validation.Constraint;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Pattern(
        regexp = ".+@.+\\..+",
        message = "Por favor, forneça um endereço de e-mail válido"
)
@NotBlank(message = "E-mail não pode estar em branco")
@Documented
@Constraint(validatedBy = { })
@Target({ FIELD })
@Retention(RUNTIME)
public @interface Email {

    String message() default "{javax.validation.constraints.Email.message}";
}
