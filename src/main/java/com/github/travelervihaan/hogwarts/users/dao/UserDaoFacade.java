package com.github.travelervihaan.hogwarts.users.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserDaoFacade {

    private UserRepository userRepository;

    @Autowired
    public UserDaoFacade(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public Optional<UserEntity> getUserByNickname(String nicknaname){
        return userRepository.findFirstByNicknameEquals(nicknaname);
    }
}
