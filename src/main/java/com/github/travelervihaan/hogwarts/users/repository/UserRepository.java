package com.github.travelervihaan.hogwarts.users.repository;

import com.github.travelervihaan.hogwarts.users.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
