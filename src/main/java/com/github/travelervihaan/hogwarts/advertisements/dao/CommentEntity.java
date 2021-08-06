package com.github.travelervihaan.hogwarts.advertisements.dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;
import java.util.Objects;

@Entity
@Table(name = "comments")
class CommentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_comment")
    private Long id;

    @NotNull
    @Column(name = "send_date", nullable = false)
    private LocalDateTime sendDate;

    @NotEmpty
    @Column(nullable = false)
    private String text;

    public CommentEntity(){}
    public CommentEntity(LocalDateTime sendDate, String text) {
        this.sendDate = sendDate;
        this.text = text;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getSendDate() {
        return sendDate;
    }

    public void setSendDate(LocalDateTime sendDate) {
        this.sendDate = sendDate;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CommentEntity that = (CommentEntity) o;
        return Objects.equals(id, that.id) && Objects.equals(sendDate, that.sendDate) && Objects.equals(text, that.text);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, sendDate, text);
    }

    @Override
    public String toString() {
        return "CommentEntity{" +
                "id=" + id +
                ", sendDate=" + sendDate +
                ", text='" + text + '\'' +
                '}';
    }
}
