package com.github.travelervihaan.hogwarts.users.domain;

import java.time.LocalDateTime;
import java.util.Objects;

public record Penalty(UserStatus penaltyType,
                      LocalDateTime penaltyStartDate, LocalDateTime penaltyEndDate,
                      String description, User punishedUser,
                      User executor) {

    public UserStatus getPenaltyType() {
        return penaltyType;
    }

    public LocalDateTime getPenaltyStartDate() {
        return penaltyStartDate;
    }

    public LocalDateTime getPenaltyEndDate() {
        return penaltyEndDate;
    }

    public String getDescription() {
        return description;
    }

    public User getPunishedUser() {
        return punishedUser;
    }

    public User getExecutor() {
        return executor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Penalty penalty = (Penalty) o;
        return Objects.equals(penaltyType, penalty.penaltyType) && Objects.equals(penaltyStartDate, penalty.penaltyStartDate) && Objects.equals(penaltyEndDate, penalty.penaltyEndDate) && Objects.equals(punishedUser, penalty.punishedUser) && Objects.equals(executor, penalty.executor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(penaltyType, penaltyStartDate, penaltyEndDate, punishedUser, executor);
    }

    @Override
    public String toString() {
        return "Penalty{" +
                "penaltyType=" + penaltyType +
                ", penaltyStartDate=" + penaltyStartDate +
                ", penaltyEndDate=" + penaltyEndDate +
                ", description='" + description + '\'' +
                ", punishedUser=" + punishedUser.getNickname() +
                ", executor=" + executor.getNickname() +
                '}';
    }
}
