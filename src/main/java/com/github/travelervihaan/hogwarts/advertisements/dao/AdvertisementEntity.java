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
    @ManyToMany(fetch=FetchType.LAZY)
    @JoinTable(
            name = "advertisement_vote",
            joinColumns = @JoinColumn(name = "advertisement_id"),
            inverseJoinColumns = @JoinColumn(name = "vote_id"))
    private Set<VoteEntity> votes;

    public AdvertisementEntity() { }
    public AdvertisementEntity(Long id, LocalDateTime createdDate,
                               String text, AdvertisementTypeEntity advertisementType,
                               AdvertisementStatusEntity advertisementStatus,
                               List<CommentEntity> comments, UserEntity author,
                               Set<VoteEntity> votes) {
        this.id = id;
        this.createdDate = createdDate;
        this.text = text;
        this.advertisementType = advertisementType;
        this.advertisementStatus = advertisementStatus;
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

    public AdvertisementTypeEntity getAdvertisementType() {
        return advertisementType;
    }

    public void setAdvertisementType(AdvertisementTypeEntity advertisementType) {
        this.advertisementType = advertisementType;
    }

    public AdvertisementStatusEntity getAdvertisementStatus() {
        return advertisementStatus;
    }

    public void setAdvertisementStatus(AdvertisementStatusEntity advertisementStatus) {
        this.advertisementStatus = advertisementStatus;
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



}
