package com.github.travelervihaan.hogwarts.users.dao;

import com.github.travelervihaan.hogwarts.users.domain.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
interface UserRoleRepository extends JpaRepository<UserRole, Long> {
}
