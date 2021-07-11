package com.github.travelervihaan.hogwarts.users.domain;

public enum UserRole {
    ADMIN("Administrator"),
    MODERATOR("Moderator"),
    ADVANCED_USER("Advanced User"),
    NORMAL_USER("User"),
    NEW_USER("New User");

    private final String displayName;

    UserRole(String displayName) {
        this.displayName = displayName;
    }

    @Override
    public String toString() {
        return displayName;
    }
}
