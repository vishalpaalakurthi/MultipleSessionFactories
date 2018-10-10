package com.example.demo.Service;

import com.example.demo.Repository.DataRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class DataService {
    @Autowired
    DataRepo repo;
    public boolean getDataFrom(){
        repo.s();
        repo.s2();
        return true;
    }
}
