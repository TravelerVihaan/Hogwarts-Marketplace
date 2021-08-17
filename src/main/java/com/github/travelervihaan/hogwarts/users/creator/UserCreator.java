package com.github.travelervihaan.hogwarts.users.creator;

import com.github.travelervihaan.hogwarts.users.domain.User;
import com.github.travelervihaan.hogwarts.users.domain.UserRole;
import com.github.travelervihaan.hogwarts.users.domain.UserStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class UserCreator {

    private final UserValidator userValidator;

    @Autowired
    public UserCreator(UserValidator userValidator) {
        this.userValidator = userValidator;
    }

    User createUser(String login, String password, String email, String nickname){
        User user = new User(login, password, email, nickname);
        user.setUserRole(Set.of(UserRole.NEW_USER));
        user.setUserStatus(UserStatus.UNCONFIRMED);
        boolean isValid = userValidator.validate(user);

        return user;
    }
}
