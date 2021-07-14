package com.github.travelervihaan.hogwarts.users.entity;

import javax.persistence.*;

@Entity
@Table(name = "user_details")
public class UserDetailsEntity {

    @Id
    @Column(name = "id_user_details")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
}
