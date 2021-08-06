package com.github.travelervihaan.hogwarts.advertisements.dao;

import com.github.travelervihaan.hogwarts.advertisements.domain.Advertisement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.Set;

@Repository
interface AdvertisementRepository extends JpaRepository<Advertisement, Long> {

    Set<AdvertisementEntity> findAdvertisementByLastActivityDateBefore(LocalDateTime before);
}
