package com.github.travelervihaan.hogwarts.users.creator;

import com.github.travelervihaan.hogwarts.validation.IValidator;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
@Qualifier("userValidator")
public class UserValidator implements IValidator {

    @Override
    public <T> Set<String> validate(T objectToValidate) {
        Set<String> validationMessages = basicValidate(objectToValidate);
        return validationMessages;
    }
}
