package org.jeslorlim.ecoparametros.model;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

class ClaveValidator implements ConstraintValidator<ValidarClave, Formulario> {
    @Override
    public boolean isValid(Formulario formulario, ConstraintValidatorContext context) {
        return formulario.getClave().equals(formulario.getValiClave());
    }
}

