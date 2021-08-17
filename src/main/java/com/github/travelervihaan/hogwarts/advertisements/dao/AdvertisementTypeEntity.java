package com.github.travelervihaan.hogwarts.advertisements.dao;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "advertisement_types")
public class AdvertisementTypeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_adv_type")
    private Long id;

    @NotEmpty
    @Column(name = "adv_type", nullable = false, unique = true)
    private String advertisementType;

    @OneToMany(mappedBy = "advertisementType")
    private Set<AdvertisementEntity> advertisements;

    public AdvertisementTypeEntity(){}
    public AdvertisementTypeEntity(String advertisementType) {
        this.advertisementType = advertisementType;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAdvertisementType() {
        return advertisementType;
    }

    public void setAdvertisementType(String advertisementType) {
        this.advertisementType = advertisementType;
    }

    public Set<AdvertisementEntity> getAdvertisements() {
        return advertisements;
    }

    public void setAdvertisements(Set<AdvertisementEntity> advertisements) {
        this.advertisements = advertisements;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AdvertisementTypeEntity that = (AdvertisementTypeEntity) o;
        return Objects.equals(id, that.id) && Objects.equals(advertisementType, that.advertisementType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, advertisementType);
    }

    @Override
    public String toString() {
        return "AdvertisementTypeEntity{" +
                "id=" + id +
                ", advertisementType='" + advertisementType + '\'' +
                '}';
    }

}
