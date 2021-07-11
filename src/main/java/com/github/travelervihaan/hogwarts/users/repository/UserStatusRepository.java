package com.github.travelervihaan.hogwarts.users.repository;

import com.github.travelervihaan.hogwarts.users.domain.UserStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserStatusRepository extends JpaRepository<UserStatus, Long> {
}
