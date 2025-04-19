package com.oliveiralia.client_registration.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.oliveiralia.client_registration.entities.Client;

public interface ClientRepository extends JpaRepository<Client, Long>{

}
