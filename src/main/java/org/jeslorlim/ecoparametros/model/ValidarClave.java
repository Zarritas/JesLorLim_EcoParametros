package org.jeslorlim.ecoparametros.model;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Target(ElementType.TYPE)
@Retention(RUNTIME)
@Constraint(validatedBy = ClaveValidator.class)
@Documented
public @interface ValidarClave {

    String message() default "Las contraseñas no coinciden.";

    Class<?>[] groups() default { };

    Class<? extends Payload>[] payload() default { };

}
