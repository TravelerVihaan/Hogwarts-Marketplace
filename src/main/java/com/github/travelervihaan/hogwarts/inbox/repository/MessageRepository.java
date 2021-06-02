package com.github.travelervihaan.hogwarts.inbox.repository;

import com.github.travelervihaan.hogwarts.inbox.domain.Message;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MessageRepository extends JpaRepository<Message, Long> {
}
