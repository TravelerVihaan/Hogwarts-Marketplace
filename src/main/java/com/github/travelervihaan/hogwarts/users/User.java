package com.github.travelervihaan.hogwarts.users;

import java.util.Objects;
import java.util.Set;

public class User {

    private final String login;
    private final String password;
    private final String email;
    private final String nickname;
    private final UserDetails userDetails;
    private UserStatus userStatus;
    private Set<UserRole> userRole;

    public User(String login, String password, String email, String nickname, UserDetails userDetails) {
        this.login = login;
        this.password = password;
        this.email = email;
        this.nickname = nickname;
        this.userDetails = userDetails;
        this.userStatus = UserStatus.UNCONFIRMED;
    }

    public User(String login, String password, String email, String nickname, UserDetails userDetails, UserStatus userStatus, Set<UserRole> userRole) {
        this.login = login;
        this.password = password;
        this.email = email;
        this.nickname = nickname;
        this.userDetails = userDetails;
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

    public UserDetails getUserDetails() {
        return userDetails;
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
        return Objects.equals(login, user.login) && Objects.equals(email, user.email) && Objects.equals(nickname, user.nickname) && Objects.equals(userDetails, user.userDetails) && userStatus == user.userStatus && Objects.equals(userRole, user.userRole);
    }

    @Override
    public int hashCode() {
        return Objects.hash(login, email, nickname, userDetails, userStatus, userRole);
    }

    @Override
    public String toString() {
        return "User{" +
                "login='" + login + '\'' +
                ", email='" + email + '\'' +
                ", nickname='" + nickname + '\'' +
                ", userDetails=" + userDetails +
                ", userStatus=" + userStatus +
                ", userRole=" + userRole +
                '}';
    }
}
