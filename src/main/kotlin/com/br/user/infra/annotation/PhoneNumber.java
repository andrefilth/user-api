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
        regexp = "^\\(?(?:[14689][1-9]|2[12478]|3[1234578]|5[1345]|7[134579])\\)? ?(?:[2-8]|9[1-9])[0-9]{3}\\-?[0-9]{4}$",
        message = "Por favor, forneça um endereço de e-mail válido"
)
@NotBlank(message = "E-mail não pode estar em branco")
@Documented
@Constraint(validatedBy = { })
@Target({ FIELD })
@Retention(RUNTIME)
public @interface PhoneNumber {
}
