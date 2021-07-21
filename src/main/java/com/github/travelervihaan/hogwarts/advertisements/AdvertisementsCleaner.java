package com.github.travelervihaan.hogwarts.advertisements;

import com.github.travelervihaan.hogwarts.advertisements.repository.AdvertisementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class AdvertisementsCleaner {

    private final AdvertisementRepository advertisementRepository;

    @Autowired
    public AdvertisementsCleaner(AdvertisementRepository advertisementRepository) {
        this.advertisementRepository = advertisementRepository;
    }

    @Scheduled(cron = "0 0 1 * * *")
    public void cleanInactiveAdvertisements(){
//        advertisementRepository
    }
}
