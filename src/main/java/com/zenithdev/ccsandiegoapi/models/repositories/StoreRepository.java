package com.zenithdev.ccsandiegoapi.models.repositories;

import com.zenithdev.ccsandiegoapi.models.Store;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface StoreRepository extends JpaRepository<Store,Long>, PagingAndSortingRepository<Store,Long> {

    List<Store> findAllByIdNotNullOrderByName();
}
