package com.github.travelervihaan.hogwarts.advertisements;

import com.github.travelervihaan.hogwarts.advertisements.domain.Advertisement;
import com.github.travelervihaan.hogwarts.advertisements.domain.AdvertisementType;
import com.github.travelervihaan.hogwarts.users.domain.User;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class AdvertisementManager {

    public Advertisement createNewAdvertisement(User author, LocalDateTime sendDate, AdvertisementType advertisementType, String text){
        Advertisement advertisement = new Advertisement(author, sendDate, advertisementType, text);
        return advertisement;
    }


}
