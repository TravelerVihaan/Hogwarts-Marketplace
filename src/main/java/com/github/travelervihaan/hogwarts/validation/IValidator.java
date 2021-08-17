package com.github.travelervihaan.hogwarts.validation;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import java.util.Set;
import java.util.stream.Collectors;

public interface IValidator {

    <T> Set<String> validate(T objectToValidate);

    default <T> Set<String> basicValidate(T objectToValidate){
        Validator validator = Validation.buildDefaultValidatorFactory().getValidator();
        Set<ConstraintViolation<T>> validationErrors = validator.validate(objectToValidate);
        return validationErrors.stream().map(ConstraintViolation::getMessage).collect(Collectors.toSet());
    }
}
