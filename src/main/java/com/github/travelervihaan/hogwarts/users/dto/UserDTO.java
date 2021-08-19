package com.github.travelervihaan.hogwarts.users.dto;

import java.util.List;
import java.util.Objects;

public class UserDTO {

    private String login;
    private String password;
    private String email;
    private String nickname;
    private List<Integer> userRoles;

    public UserDTO(){}
    public UserDTO(String login, String password, String email, String nickname, long userDetailsId, List<Integer> userRoles) {
        this.login = login;
        this.password = password;
        this.email = email;
        this.nickname = nickname;
        this.userRoles = userRoles;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public List<Integer> getUserRoles() {
        return userRoles;
    }

    public void setUserRoles(List<Integer> userRoles) {
        this.userRoles = userRoles;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserDTO userDTO = (UserDTO) o;
        return Objects.equals(login, userDTO.login) && Objects.equals(nickname, userDTO.nickname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(login, nickname);
    }

    @Override
    public String toString() {
        return "UserDTO{" +
                "login='" + login + '\'' +
                ", email='" + email + '\'' +
                ", nickname='" + nickname + '\'' +
                ", userDetailsId=" + userDetailsId +
                ", userRoles=" + userRoles +
                '}';
    }
}
