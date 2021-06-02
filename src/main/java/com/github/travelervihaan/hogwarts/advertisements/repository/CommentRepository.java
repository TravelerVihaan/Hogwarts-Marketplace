package com.github.travelervihaan.hogwarts.advertisements.repository;

import com.github.travelervihaan.hogwarts.advertisements.domain.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {
}
