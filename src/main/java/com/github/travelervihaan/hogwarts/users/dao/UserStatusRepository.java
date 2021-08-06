package com.github.travelervihaan.hogwarts.users.dao;

import com.github.travelervihaan.hogwarts.users.domain.UserStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
interface UserStatusRepository extends JpaRepository<UserStatus, Long> {
}
