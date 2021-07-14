package com.github.travelervihaan.hogwarts.advertisements.domain;

import com.github.travelervihaan.hogwarts.users.domain.User;

import java.time.LocalDateTime;
import java.util.*;

public class Advertisement {

    private final User author;
    private final LocalDateTime createdDate;
    private final AdvertisementType advertisementType;
    private final String text;
    private final Set<Vote> votes;
    private LocalDateTime lastActivityDate;
    private final List<Comment> comments;
    // TODO Edit history storage


    public Advertisement(User author, LocalDateTime createdDate,
                         AdvertisementType advertisementType, String text) {
        this.author = author;
        this.createdDate = createdDate;
        this.advertisementType = advertisementType;
        this.text = text;
        this.lastActivityDate = createdDate;
        this.comments = new ArrayList<>();
        this.votes = new HashSet<>();
    }

    public Advertisement(User author, LocalDateTime createdDate,
                         AdvertisementType advertisementType, String text, LocalDateTime lastActivityDate, List<Comment> comments, Set<Vote> votes) {
        this.author = author;
        this.createdDate = createdDate;
        this.advertisementType = advertisementType;
        this.text = text;
        this.lastActivityDate = lastActivityDate;
        this.comments = comments;
        this.votes = votes;
    }

    public User getAuthor() {
        return author;
    }

    public LocalDateTime getCreatedDate() {
        return createdDate;
    }

    public AdvertisementType getAdvertisementType() {
        return advertisementType;
    }

    public String getText() {
        return text;
    }

    public LocalDateTime getLastActivityDate() {
        return lastActivityDate;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setLastActivityDate(LocalDateTime lastActivityDate) {
        this.lastActivityDate = lastActivityDate;
    }

    public Set<Vote> getVotes() {
        return votes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Advertisement that = (Advertisement) o;
        return Objects.equals(createdDate, that.createdDate) && advertisementType == that.advertisementType && Objects.equals(text, that.text) && Objects.equals(votes, that.votes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(createdDate, advertisementType, text, votes);
    }

    @Override
    public String toString() {
        return "Advertisement{" +
                "author=" + author +
                ", sendDate=" + createdDate +
                ", advertisementType=" + advertisementType +
                ", text='" + text + '\'' +
                ", votes=" + votes +
                ", lastActivityDate=" + lastActivityDate +
                ", comments=" + comments +
                '}';
    }
}
