package org.jeslorlim.ecoparametros.model;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Target({ FIELD })
@Retention(RUNTIME)
@Constraint(validatedBy = ClaveValidator.class)
@Documented
public @interface Clave {

    String message() default "Las contraseñas no coinciden.";

    Class<?>[] groups() default { };

    Class<? extends Payload>[] payload() default { };

}
