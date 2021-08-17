package com.github.travelervihaan.hogwarts.advertisements.dao;

import com.github.travelervihaan.hogwarts.users.dao.UserEntity;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "advertisements")
public class AdvertisementEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_advertisement")
    private Long id;

    private LocalDateTime createdDate;
    @Column(name = "advertisement_text", nullable = false)
    private String text;
    @ManyToOne
    @JoinColumn(name = "advertisement_type_id")
    private AdvertisementTypeEntity advertisementType;
    @ManyToOne
    @JoinColumn(name = "advertisement_status_id")
    private AdvertisementStatusEntity advertisementStatus;
    @OneToMany(mappedBy = "advertisement", cascade = CascadeType.REMOVE)
    private List<CommentEntity> comments;
    @ManyToOne
    private UserEntity author;

    private Set<VoteEntity> votes;

    public AdvertisementEntity() { }

    public AdvertisementEntity(Long id, LocalDateTime createdDate,
                               String text, AdvertisementTypeEntity advertisementTypeEntity,
                               AdvertisementStatusEntity advertisementStatusEntity,
                               List<CommentEntity> comments, UserEntity author,
                               Set<VoteEntity> votes) {
        this.id = id;
        this.createdDate = createdDate;
        this.text = text;
        this.advertisementTypeEntity = advertisementTypeEntity;
        this.advertisementStatusEntity = advertisementStatusEntity;
        this.comments = comments;
        this.author = author;
        this.votes = votes;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDateTime createdDate) {
        this.createdDate = createdDate;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public AdvertisementTypeEntity getAdvertisementTypeEntity() {
        return advertisementTypeEntity;
    }

    public void setAdvertisementTypeEntity(AdvertisementTypeEntity advertisementTypeEntity) {
        this.advertisementTypeEntity = advertisementTypeEntity;
    }

    public AdvertisementStatusEntity getAdvertisementStatusEntity() {
        return advertisementStatusEntity;
    }

    public void setAdvertisementStatusEntity(AdvertisementStatusEntity advertisementStatusEntity) {
        this.advertisementStatusEntity = advertisementStatusEntity;
    }

    public List<CommentEntity> getComments() {
        return comments;
    }

    public void setComments(List<CommentEntity> comments) {
        this.comments = comments;
    }

    public UserEntity getAuthor() {
        return author;
    }

    public void setAuthor(UserEntity author) {
        this.author = author;
    }

    public Set<VoteEntity> getVotes() {
        return votes;
    }

    public void setVotes(Set<VoteEntity> votes) {
        this.votes = votes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AdvertisementEntity that = (AdvertisementEntity) o;
        return Objects.equals(createdDate, that.createdDate) && Objects.equals(text, that.text) && Objects.equals(advertisementTypeEntity, that.advertisementTypeEntity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(createdDate, text, advertisementTypeEntity);
    }
}
