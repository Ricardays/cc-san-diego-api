package com.zenithdev.ccsandiegoapi.services;

import com.zenithdev.ccsandiegoapi.models.Store;
import com.zenithdev.ccsandiegoapi.models.User;
import com.zenithdev.ccsandiegoapi.models.repositories.StoreRepository;
import com.zenithdev.ccsandiegoapi.models.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public List<User> findAll(){
        return userRepository.findAll();
    }

    public User create(User user){
        Optional<User> ou = userRepository.findFirstByUsername(user.getUsername());
        if(ou.isPresent()){
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Username already on use");
        }

        return userRepository.save(user);
    }

    public User authenticate(String username, String password){
        Optional<User> ou = userRepository.findFirstByUsernameAndPassword(username, password);

        if(ou.isPresent()){
            return ou.get();
        } else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Invalid Credentials");
        }
    }

    public User exists(String username){
        Optional<User> ou = userRepository.findFirstByUsername(username);

        if(ou.isPresent()){
            return ou.get();
        } else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Invalid Credentials");
        }
    }
}
