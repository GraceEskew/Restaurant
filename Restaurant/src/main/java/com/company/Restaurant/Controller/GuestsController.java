package com.company.Restaurant.Controller;

import com.company.Restaurant.Dao.GuestsRepository;
import com.company.Restaurant.Dto.Guests;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(value = "/guest")
public class GuestsController {

    @Autowired
    GuestsRepository guestsRepo;

    @GetMapping
    public List<Guests> getAllGuests(){
        return guestsRepo.findAll();
    }
    @PostMapping
    public Guests addGuest(@RequestBody@Valid Guests guest){
        return guestsRepo.save(guest);
    }
}
