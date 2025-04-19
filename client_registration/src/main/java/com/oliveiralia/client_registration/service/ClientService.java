package com.oliveiralia.client_registration.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.oliveiralia.client_registration.dto.ClientDTO;
import com.oliveiralia.client_registration.entities.Client;
import com.oliveiralia.client_registration.repositories.ClientRepository;



@Service
public class ClientService {
	
	@Autowired
	private ClientRepository repository;
	
	@Transactional(readOnly = true)
	public Page<ClientDTO> findAll(Pageable pageable) {
		Page<Client> clients = repository.findAll(pageable);
		return clients.map(x -> new ClientDTO(x));
	} 
	
	@Transactional(readOnly = true)
	public ClientDTO findById(Long id) {
		Optional<Client> repo = repository.findById(id);
		Client client = repo.get();
		ClientDTO dto = new ClientDTO(client);
		return dto;
	}
	
	
	
	

}
