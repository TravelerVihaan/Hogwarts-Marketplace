package com.github.travelervihaan.hogwarts.inbox.domain;

import com.github.travelervihaan.hogwarts.advertisements.domain.Vote;
import com.github.travelervihaan.hogwarts.users.domain.User;

import java.time.LocalDateTime;
import java.util.Objects;
import java.util.Set;

public class Message {

    private final LocalDateTime sentDate;
    private final User from;
    private final User to;
    private final String text;
    private final Set<Vote> votes;

    public Message(LocalDateTime sentDate, User from, User to, String text, Set<Vote> votes) {
        this.sentDate = sentDate;
        this.from = from;
        this.to = to;
        this.text = text;
        this.votes = votes;
    }

    public LocalDateTime getSentDate() {
        return sentDate;
    }

    public User getFrom() {
        return from;
    }

    public User getTo() {
        return to;
    }

    public String getText() {
        return text;
    }

    public Set<Vote> getVotes() {
        return votes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Message message = (Message) o;
        return Objects.equals(sentDate, message.sentDate) && Objects.equals(text, message.text);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sentDate, text);
    }

    @Override
    public String toString() {
        return "Message{" +
                "sentDate=" + sentDate +
                ", from=" + from.getNickname() +
                ", to=" + to.getNickname() +
                ", text='" + text + '\'' +
                '}';
    }
}
