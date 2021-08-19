package com.github.travelervihaan.hogwarts.users.domain;

import java.util.*;

public class User {

    private final String login;
    private final String password;
    private final String email;
    private final String nickname;
    private UserStatus userStatus;
    private final Set<UserRole> userRoles;
    private final List<Penalty> penalties;

    public User(String login, String password, String email, String nickname) {
        this.login = login;
        this.password = password;
        this.email = email;
        this.nickname = nickname;
        this.userStatus = UserStatus.UNCONFIRMED;
        userRoles = new HashSet<>();
        userRoles.add(UserRole.NEW_USER);
        penalties = new ArrayList<>();
    }

    public User(String login, String password, String email, String nickname, UserStatus userStatus, Set<UserRole> userRole, List<Penalty> penalties) {
        this.login = login;
        this.password = password;
        this.email = email;
        this.nickname = nickname;
        this.userStatus = userStatus;
        this.userRoles = userRole;
        this.penalties = penalties;
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

    public Set<UserRole> getUserRoles() {
        return userRoles;
    }

    public void setUserStatus(UserStatus userStatus) {
        this.userStatus = userStatus;
    }

    public List<Penalty> getPenalties() {
        return penalties;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(login, user.login) && Objects.equals(email, user.email) && Objects.equals(nickname, user.nickname) && userStatus == user.userStatus && Objects.equals(userRoles, user.userRoles);
    }

    @Override
    public int hashCode() {
        return Objects.hash(login, email, nickname, userStatus, userRoles);
    }

    @Override
    public String toString() {
        return "User{" +
                "login='" + login + '\'' +
                ", email='" + email + '\'' +
                ", nickname='" + nickname + '\'' +
                ", userStatus=" + userStatus +
                ", userRole=" + userRoles +
                '}';
    }
}
