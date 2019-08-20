package com.company.Restaurant.Dao;

import com.company.Restaurant.Dto.Tables;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TablesRepository extends JpaRepository<Tables, Integer> {
    List<Tables>findByIsAvailable(Boolean isAvailable);
}
