package com.zenithdev.ccsandiegoapi.controllers;

import com.zenithdev.ccsandiegoapi.models.Store;
import com.zenithdev.ccsandiegoapi.services.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/store")
public class StoreController {

    @Autowired
    StoreService storeService;

    @GetMapping("/list")
    public List<Store> listStores(){
        return storeService.findAll();
    }

    @PostMapping()
    public Store createStore(@RequestBody Store store){
        return storeService.create(store);
    }
}
