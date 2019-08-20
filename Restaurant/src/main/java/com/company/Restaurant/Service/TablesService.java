package com.company.Restaurant.Service;

import com.company.Restaurant.Dao.TablesRepository;
import com.company.Restaurant.Dto.Tables;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class TablesService {
    @Autowired
    TablesRepository tableRepo;

    public List<Tables> getTablesByIsAvailable(Boolean isAvailable){
        return tableRepo.findByIsAvailable(isAvailable);
    }
}
