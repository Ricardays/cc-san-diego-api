package com.zenithdev.ccsandiegoapi.controllers;

import com.zenithdev.ccsandiegoapi.models.Contact;
import com.zenithdev.ccsandiegoapi.models.User;
import com.zenithdev.ccsandiegoapi.services.ContactService;
import com.zenithdev.ccsandiegoapi.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/contact")
public class ContactController {

    @Autowired
    ContactService contactService;

    @GetMapping("/list")
    public List<Contact> listContact(){
        return contactService.listContacts();
    }

    @PostMapping
    public Contact createContact(@RequestBody Contact contact){
        return contactService.create(contact);
    }


}
