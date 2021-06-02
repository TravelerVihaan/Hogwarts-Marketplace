package com.github.travelervihaan.hogwarts.advertisements.domain;

import com.github.travelervihaan.hogwarts.users.domain.User;

import java.time.LocalDateTime;
import java.util.List;

public class Advertisement {

    private final User author;
    private final LocalDateTime sendDate;
    private final AdvertisementType advertisementType;
    private final String text;
    private LocalDateTime lastActivityDate;
    private List<Comment> comments;
    // TODO Edit history storage


    public Advertisement(User author, LocalDateTime sendDate, AdvertisementType advertisementType, String text) {
        this.author = author;
        this.sendDate = sendDate;
        this.advertisementType = advertisementType;
        this.text = text;
        this.lastActivityDate = sendDate;
    }

    public Advertisement(User author, LocalDateTime sendDate, AdvertisementType advertisementType, String text, LocalDateTime lastActivityDate, List<Comment> comments) {
        this.author = author;
        this.sendDate = sendDate;
        this.advertisementType = advertisementType;
        this.text = text;
        this.lastActivityDate = lastActivityDate;
        this.comments = comments;
    }

    public User getAuthor() {
        return author;
    }

    public LocalDateTime getSendDate() {
        return sendDate;
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

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    @Override
    public String toString() {
        return "Advertisement{" +
                "author=" + author +
                ", sendDate=" + sendDate +
                ", advertisementType=" + advertisementType +
                ", text='" + text + '\'' +
                ", lastActivityDate=" + lastActivityDate +
                ", comments=" + comments +
                '}';
    }
}
