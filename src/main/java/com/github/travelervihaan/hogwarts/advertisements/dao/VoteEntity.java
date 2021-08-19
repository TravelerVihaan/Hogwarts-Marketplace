package com.github.travelervihaan.hogwarts.advertisements.dao;

import com.github.travelervihaan.hogwarts.users.dao.UserEntity;

import javax.persistence.*;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "votes")
class VoteEntity {

    @Id
    @Column(name = "id_vote")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Integer value;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private UserEntity user;
    @ManyToMany(mappedBy = "votes")
    private Set<AdvertisementEntity> advertisements;

    // relation with user who casted vote - many to many(?)

    public VoteEntity() {}

    public VoteEntity(Long id, Integer value, UserEntity user) {
        this.id = id;
        this.value = value;
        this.user = user;
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

    public UserEntity getUser() {
        return user;
    }

    public void setUser(UserEntity user) {
        this.user = user;
    }

    public Set<AdvertisementEntity> getAdvertisements() {
        return advertisements;
    }

    public void setAdvertisements(Set<AdvertisementEntity> advertisements) {
        this.advertisements = advertisements;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VoteEntity that = (VoteEntity) o;
        return Objects.equals(id, that.id) && Objects.equals(value, that.value) && Objects.equals(user, that.user);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, value, user);
    }

    @Override
    public String toString() {
        return "VoteEntity{" +
                "id=" + id +
                ", value=" + value +
                ", user=" + user +
                '}';
    }
}
