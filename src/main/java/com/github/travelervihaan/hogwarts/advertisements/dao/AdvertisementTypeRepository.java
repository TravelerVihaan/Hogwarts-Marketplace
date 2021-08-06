package com.github.travelervihaan.hogwarts.advertisements.dao;

import com.github.travelervihaan.hogwarts.advertisements.domain.AdvertisementType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
interface AdvertisementTypeRepository extends JpaRepository<AdvertisementType, Long> {
}
