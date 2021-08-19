package com.github.travelervihaan.hogwarts.users.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
interface UserRepository extends JpaRepository<UserEntity, Long> {

    Optional<UserEntity> findFirstByNicknameEquals(String nickname);
}
