package com.github.travelervihaan.hogwarts.advertisements;

import com.github.travelervihaan.hogwarts.users.User;

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
