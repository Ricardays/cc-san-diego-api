package com.zenithdev.ccsandiegoapi.models.repositories;

import com.zenithdev.ccsandiegoapi.models.Contact;
import com.zenithdev.ccsandiegoapi.models.Store;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface ContactRepository extends JpaRepository<Contact,Long>, PagingAndSortingRepository<Contact,Long> {

    List<Contact> findAllByIdNotNullOrderByIdAsc();
}
