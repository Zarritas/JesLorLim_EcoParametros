package org.jeslorlim.ecoparametros.model;

import jakarta.validation.*;

import java.util.regex.*;

class ClaveValidator implements ConstraintValidator<Clave, String> {

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        Pattern pattern =
                Pattern.compile("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*\\p{Punct})[A-Za-z\\d\\p{Punct}]{6,12}$");
        Matcher matcher = pattern.matcher(value);
        try {
            return matcher.matches();
        } catch (Exception e) {
            return false;
        }
    }
}

