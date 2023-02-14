package com.zenithdev.ccsandiegoapi.models.repositories;

import com.zenithdev.ccsandiegoapi.models.Store;
import com.zenithdev.ccsandiegoapi.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User,Long>, PagingAndSortingRepository<User,Long> {

    Optional<User> findFirstByUsername(String username);

    Optional<User> findFirstByUsernameAndPassword(String username, String encodedPassword);
}
