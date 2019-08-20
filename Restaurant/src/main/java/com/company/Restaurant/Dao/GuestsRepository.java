package com.company.Restaurant.Dao;

import com.company.Restaurant.Dto.Guests;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GuestsRepository extends JpaRepository<Guests, Integer> {
}
