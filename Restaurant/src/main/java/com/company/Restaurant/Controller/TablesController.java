package com.company.Restaurant.Controller;

import com.company.Restaurant.Dao.TablesRepository;
import com.company.Restaurant.Dto.Tables;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/tables")
public class TablesController {

    @Autowired
    TablesRepository tablesRepo;

    @GetMapping
    public List<Tables> getAllTables(){
        return tablesRepo.findAll();
    }}
