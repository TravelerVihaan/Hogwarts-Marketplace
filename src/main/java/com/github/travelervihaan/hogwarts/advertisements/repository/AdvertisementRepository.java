package com.github.travelervihaan.hogwarts.advertisements.repository;

import com.github.travelervihaan.hogwarts.advertisements.domain.Advertisement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdvertisementRepository extends JpaRepository<Advertisement, Long> {
}
