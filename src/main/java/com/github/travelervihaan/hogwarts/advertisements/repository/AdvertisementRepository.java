package com.github.travelervihaan.hogwarts.advertisements.repository;

import com.github.travelervihaan.hogwarts.advertisements.domain.Advertisement;
import com.github.travelervihaan.hogwarts.advertisements.entity.AdvertisementEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.Set;

@Repository
public interface AdvertisementRepository extends JpaRepository<Advertisement, Long> {

    Set<AdvertisementEntity> findAdvertisementByLastActivityDateBefore(LocalDateTime before);
}
