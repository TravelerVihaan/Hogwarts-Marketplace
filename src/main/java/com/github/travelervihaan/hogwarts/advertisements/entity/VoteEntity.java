package com.github.travelervihaan.hogwarts.advertisements.entity;

import javax.persistence.*;

@Entity
@Table(name = "votes")
public class VoteEntity {

    @Id
    @Column(name = "id_vote")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Integer value;
}
