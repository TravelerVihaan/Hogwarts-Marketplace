package com.github.travelervihaan.hogwarts.advertisements.dao;

import com.github.travelervihaan.hogwarts.advertisements.domain.AdvertisementStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
interface AdvertisementStatusRepository extends JpaRepository<AdvertisementStatus, Long> {
}
