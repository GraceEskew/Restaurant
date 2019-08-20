package com.company.Restaurant.Service;

import com.company.Restaurant.Dao.GuestsRepository;
import com.company.Restaurant.Dto.Guests;
import org.hibernate.validator.constraints.EAN;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class GuestsService {
    @Autowired
    GuestsRepository guestsRepo;

    public List<Guests>getGuestsByLastName(String lastName){
        return guestsRepo.findByLastName(lastName);
    }
    public List<Guests>getGuestsByNumInParty(Integer numInParty){
        return guestsRepo.findByNumInParty(numInParty);
    }
}
