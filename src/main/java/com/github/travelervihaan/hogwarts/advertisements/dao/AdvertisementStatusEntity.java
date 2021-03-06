package com.github.travelervihaan.hogwarts.advertisements.dao;

import javax.persistence.*;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "advertisement_statuses")
public class AdvertisementStatusEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_adv_status")
    private Long id;

    @Column(name = "adv_status", nullable = false, unique = true)
    private String advertisementStatus;

    @OneToMany(mappedBy = "advertisementStatus")
    private Set<AdvertisementEntity> advertisements;

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
