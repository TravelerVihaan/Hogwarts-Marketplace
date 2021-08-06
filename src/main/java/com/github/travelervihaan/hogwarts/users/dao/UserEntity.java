package com.github.travelervihaan.hogwarts.users.dao;

import javax.persistence.*;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "users")
public class UserEntity {

    @Id
    @Column(name = "id_user")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(nullable = false, unique = true)
    private String login;
    @Column(nullable = false)
    private String password;
    @Column(unique = true)
    private String email;
    @Column(nullable = false, unique = true)
    private String nickname;
    @ManyToOne
    private UserStatusEntity userStatus;
    @ManyToMany
    private Set<UserRoleEntity> roles;

    public UserEntity() { }
    public UserEntity(Long id, String login, String password,
                      String email, String nickname,
                      UserStatusEntity userStatus,
                      Set<UserRoleEntity> roles) {
        this.id = id;
        this.login = login;
        this.password = password;
        this.email = email;
        this.nickname = nickname;
        this.userStatus = userStatus;
        this.roles = roles;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public UserStatusEntity getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(UserStatusEntity userStatus) {
        this.userStatus = userStatus;
    }

    public Set<UserRoleEntity> getRoles() {
        return roles;
    }

    public void setRoles(Set<UserRoleEntity> roles) {
        this.roles = roles;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserEntity that = (UserEntity) o;
        return Objects.equals(login, that.login) && Objects.equals(email, that.email) && Objects.equals(nickname, that.nickname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(login, email, nickname);
    }

    @Override
    public String toString() {
        return "UserEntity{" +
                "id=" + id +
                ", login='" + login + '\'' +
                ", email='" + email + '\'' +
                ", nickname='" + nickname + '\'' +
                ", userStatus=" + userStatus +
                ", roles=" + roles +
                '}';
    }
}
