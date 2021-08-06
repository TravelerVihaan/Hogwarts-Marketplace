package com.github.travelervihaan.hogwarts.advertisements.dao;

import javax.persistence.*;

@Entity
@Table(name = "votes")
class VoteEntity {

    @Id
    @Column(name = "id_vote")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Integer value;
    // TODO
    // relation with adv - many to many
    // relation with user who casted vote - many to many(?)

    public VoteEntity() {}
    public VoteEntity(Integer value) {
        this.value = value;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "VoteEntity{" +
                "id=" + id +
                ", value=" + value +
                '}';
    }
}
