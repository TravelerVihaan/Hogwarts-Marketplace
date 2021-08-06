package com.github.travelervihaan.hogwarts.users.dao;

import com.github.travelervihaan.hogwarts.users.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
interface UserRepository extends JpaRepository<User, Long> {
}
