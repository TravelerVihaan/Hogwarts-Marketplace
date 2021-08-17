package com.github.travelervihaan.hogwarts.advertisements.dao;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "votes")
class VoteEntity {

    @Id
    @Column(name = "id_vote")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Integer value;
    @ManyToMany(fetch=FetchType.LAZY)
    @JoinTable(
            name = "advertisements_votes",
            joinColumns = @JoinColumn(name = "vote_id"),
            inverseJoinColumns = @JoinColumn(name = "advertisement_id"))
    private Set<AdvertisementEntity> advertisements;

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
