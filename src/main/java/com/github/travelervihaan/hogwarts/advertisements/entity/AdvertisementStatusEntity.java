package com.github.travelervihaan.hogwarts.advertisements.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import java.util.Objects;

@Entity
@Table(name = "advertisement_statuses")
public class AdvertisementStatusEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_adv_status")
    private Long id;

    @NotEmpty
    @Column(name = "adv_status", nullable = false, unique = true)
    private String advertisementStatus;

    public AdvertisementStatusEntity() { }
    public AdvertisementStatusEntity(String advertisementStatus) {
        this.advertisementStatus = advertisementStatus;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAdvertisementStatus() {
        return advertisementStatus;
    }

    public void setAdvertisementStatus(String advertisementStatus) {
        this.advertisementStatus = advertisementStatus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AdvertisementStatusEntity that = (AdvertisementStatusEntity) o;
        return Objects.equals(id, that.id) && Objects.equals(advertisementStatus, that.advertisementStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, advertisementStatus);
    }

    @Override
    public String toString() {
        return "AdvertisementStatusEntity{" +
                "id=" + id +
                ", advertisementStatus='" + advertisementStatus + '\'' +
                '}';
    }
}
