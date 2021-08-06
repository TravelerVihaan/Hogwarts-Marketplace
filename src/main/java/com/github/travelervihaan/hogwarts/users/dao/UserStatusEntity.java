package com.github.travelervihaan.hogwarts.users.dao;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "user_statuses")
public class UserStatusEntity {

    @Id
    @Column(name = "id_status")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false, unique = true)
    private String status;

    public UserStatusEntity() {
    }

    public UserStatusEntity(Long id, String status) {
        this.id = id;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserStatusEntity that = (UserStatusEntity) o;
        return Objects.equals(status, that.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(status);
    }

    @Override
    public String toString() {
        return "UserStatusEntity{" +
                "id=" + id +
                ", status='" + status + '\'' +
                '}';
    }
}
