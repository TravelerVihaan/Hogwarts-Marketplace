package com.github.travelervihaan.hogwarts.inbox.dao;

import com.github.travelervihaan.hogwarts.inbox.domain.Message;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
interface MessageRepository extends JpaRepository<Message, Long> {
}
