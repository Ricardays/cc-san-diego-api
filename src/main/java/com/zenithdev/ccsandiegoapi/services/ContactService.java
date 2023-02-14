package com.zenithdev.ccsandiegoapi.services;

import com.zenithdev.ccsandiegoapi.models.Contact;
import com.zenithdev.ccsandiegoapi.models.repositories.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContactService {

    @Autowired
    ContactRepository contactRepository;

    public List<Contact> listContacts(){
        return contactRepository.findAllByIdNotNullOrderByIdAsc();
    }

    public Contact create(Contact contact){
        return contactRepository.save(contact);
    }
}
