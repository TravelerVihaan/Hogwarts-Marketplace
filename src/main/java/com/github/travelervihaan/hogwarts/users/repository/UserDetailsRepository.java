package com.github.travelervihaan.hogwarts.users.repository;

import com.github.travelervihaan.hogwarts.users.domain.UserDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDetailsRepository extends JpaRepository<UserDetails, Long> {
}
