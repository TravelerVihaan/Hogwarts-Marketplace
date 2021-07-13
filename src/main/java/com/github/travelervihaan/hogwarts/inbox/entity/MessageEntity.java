package com.github.travelervihaan.hogwarts.inbox.entity;

import com.github.travelervihaan.hogwarts.users.entity.UserEntity;

import javax.persistence.*;
import javax.validation.constraints.PastOrPresent;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;
import java.util.Objects;

@Entity
@Table(name = "messages")
public class MessageEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_message")
    private Long id;
    @Column(nullable = false)
    private String title;
    @Column(nullable = false)
    @Size(min = 2, max = 250)
    private String text;
    @Column(name = "send_date", nullable = false)
    @PastOrPresent
    private LocalDateTime sendDate;
    @ManyToOne
    @Column(nullable = false)
    private UserEntity shipper;
    @ManyToOne
    @Column(nullable = false)
    private UserEntity receiver;

    public MessageEntity() {
    }

    public MessageEntity(Long id, String title, String text,
                         LocalDateTime sendDate, UserEntity shipper,
                         UserEntity receiver) {
        this.id = id;
        this.title = title;
        this.text = text;
        this.sendDate = sendDate;
        this.shipper = shipper;
        this.receiver = receiver;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public LocalDateTime getSendDate() {
        return sendDate;
    }

    public void setSendDate(LocalDateTime sendDate) {
        this.sendDate = sendDate;
    }

    public UserEntity getShipper() {
        return shipper;
    }

    public void setShipper(UserEntity shipper) {
        this.shipper = shipper;
    }

    public UserEntity getReceiver() {
        return receiver;
    }

    public void setReceiver(UserEntity receiver) {
        this.receiver = receiver;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MessageEntity that = (MessageEntity) o;
        return Objects.equals(id, that.id) && Objects.equals(title, that.title) && Objects.equals(text, that.text) && Objects.equals(sendDate, that.sendDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, text, sendDate);
    }

    @Override
    public String toString() {
        return "MessageEntity{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", text='" + text + '\'' +
                ", sendDate=" + sendDate +
                ", shipper=" + shipper +
                ", receiver=" + receiver +
                '}';
    }
}
