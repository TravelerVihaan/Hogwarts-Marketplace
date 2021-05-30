package com.github.travelervihaan.hogwarts.advertisements;

import com.github.travelervihaan.hogwarts.users.User;

import java.time.LocalDateTime;
import java.util.Objects;

public class Comment {

    private final User author;
    private final LocalDateTime sendDate;
    private final String text;

    public Comment(User author, LocalDateTime sendDate, String text) {
        this.author = author;
        this.sendDate = sendDate;
        this.text = text;
    }

    public User getAuthor() {
        return author;
    }

    public LocalDateTime getSendDate() {
        return sendDate;
    }

    public String getText() {
        return text;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Comment comment = (Comment) o;
        return Objects.equals(author, comment.author) && Objects.equals(sendDate, comment.sendDate) && Objects.equals(text, comment.text);
    }

    @Override
    public int hashCode() {
        return Objects.hash(author, sendDate, text);
    }

    @Override
    public String toString() {
        return "Comment{" +
                "author=" + author.getNickname() +
                ", sendDate=" + sendDate +
                ", text='" + text + '\'' +
                '}';
    }
}
