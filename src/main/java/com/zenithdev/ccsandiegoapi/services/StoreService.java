package com.zenithdev.ccsandiegoapi.services;

import com.zenithdev.ccsandiegoapi.models.Store;
import com.zenithdev.ccsandiegoapi.models.repositories.StoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StoreService {

    @Autowired
    StoreRepository storeRepository;

    public List<Store> findAll(){
        return storeRepository.findAll();
    }

    public Store create(Store store){
        return storeRepository.save(store);
    }
}
