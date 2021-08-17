package com.github.travelervihaan.hogwarts.users.domain;

import java.util.Objects;
import java.util.Set;

public class User {

    private final String login;
    private final String password;
    private final String email;
    private final String nickname;
    private UserStatus userStatus;
    private Set<UserRole> userRole;

    public User(String login, String password, String email, String nickname) {
        this.login = login;
        this.password = password;
        this.email = email;
        this.nickname = nickname;
        this.userStatus = UserStatus.UNCONFIRMED;
    }

    public User(String login, String password, String email, String nickname, UserStatus userStatus, Set<UserRole> userRole) {
        this.login = login;
        this.password = password;
        this.email = email;
        this.nickname = nickname;
        this.userStatus = userStatus;
        this.userRole = userRole;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public String getNickname() {
        return nickname;
    }

    public UserStatus getUserStatus() {
        return userStatus;
    }

    public Set<UserRole> getUserRole() {
        return userRole;
    }

    public void setUserStatus(UserStatus userStatus) {
        this.userStatus = userStatus;
    }

    public void setUserRole(Set<UserRole> userRole) {
        this.userRole = userRole;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(login, user.login) && Objects.equals(email, user.email) && Objects.equals(nickname, user.nickname) && userStatus == user.userStatus && Objects.equals(userRole, user.userRole);
    }

    @Override
    public int hashCode() {
        return Objects.hash(login, email, nickname, userStatus, userRole);
    }

    @Override
    public String toString() {
        return "User{" +
                "login='" + login + '\'' +
                ", email='" + email + '\'' +
                ", nickname='" + nickname + '\'' +
                ", userStatus=" + userStatus +
                ", userRole=" + userRole +
                '}';
    }
}
