package com.github.travelervihaan.hogwarts.users.repository;

import com.github.travelervihaan.hogwarts.users.domain.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRoleRepository extends JpaRepository<UserRole, Long> {
}
