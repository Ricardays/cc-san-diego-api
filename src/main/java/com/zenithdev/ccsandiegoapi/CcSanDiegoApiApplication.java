package com.zenithdev.ccsandiegoapi;

import com.zenithdev.ccsandiegoapi.models.repositories.StoreRepository;
import com.zenithdev.ccsandiegoapi.models.repositories.UserRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication()
@EnableJpaRepositories(basePackageClasses = {
		StoreRepository.class,
		UserRepository.class
})
public class CcSanDiegoApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(CcSanDiegoApiApplication.class, args);
	}

}
