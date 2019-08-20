package com.company.Restaurant.Dao;

import com.company.Restaurant.Dto.Guests;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface GuestsRepository extends JpaRepository<Guests, Integer> {
    List<Guests> findByLastName(String lastName);
    List<Guests> findByNumInParty(Integer numInParty);
}
