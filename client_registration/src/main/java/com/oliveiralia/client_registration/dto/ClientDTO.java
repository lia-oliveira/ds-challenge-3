package com.oliveiralia.client_registration.dto;

import java.io.Serializable;
import java.time.LocalDate;

import org.hibernate.validator.constraints.br.CPF;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.oliveiralia.client_registration.entities.Client;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.PastOrPresent;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;

public class ClientDTO implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private Long id;
	
	@Size(min = 3, max = 120, message = "Minimum of 3 and maximum of 120 characters.")
	@NotBlank(message = "Required field.")
	private String name;
		
	@CPF(message = "Invalid CPF.")
	@NotBlank(message = "Required field.")
	private String cpf;
	
	@Positive(message = "The value must be positive.")
	private Double income;
	
	@JsonFormat(pattern = "yyyy-MM-dd")
	@PastOrPresent(message = "Birthdate must be in the past or present.")
	private LocalDate birthDate;
	
	@Positive(message = "Blank or positive values only")
	private Integer children;
	
	public ClientDTO() {}

	public ClientDTO(Client entity) {
		id = entity.getId();
		name = entity.getName();
		cpf = entity.getCpf();
		income = entity.getIncome();
		birthDate = entity.getBirthDate();
		children = entity.getChildren();
	}
	
	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getCpf() {
		return cpf;
	}

	public Double getIncome() {
		return income;
	}

	public LocalDate getBirthDate() {
		return birthDate;
	}

	public Integer getChildren() {
		return children;
	}
}
