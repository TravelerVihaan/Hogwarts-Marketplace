package com.github.travelervihaan.hogwarts.advertisements;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class AdvertisementsCleaner {

    //private final AdvertisementRepository advertisementRepository;

//    @Autowired
//    public AdvertisementsCleaner(AdvertisementRepository advertisementRepository) {
//        this.advertisementRepository = advertisementRepository;
//    }

    @Scheduled(cron = "0 0 1 * * *")
    public void cleanInactiveAdvertisements(){
//        advertisementRepository
    }
}
