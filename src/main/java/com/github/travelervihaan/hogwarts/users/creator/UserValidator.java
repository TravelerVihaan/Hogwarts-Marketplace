package com.github.travelervihaan.hogwarts.users.creator;

import com.github.travelervihaan.hogwarts.users.domain.User;
import org.springframework.stereotype.Service;

@Service
public class UserValidator {

    boolean validate(User user){
        return true;
    }
}
