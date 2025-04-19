package com.oliveiralia.client_registration.dto;

import java.time.LocalDate;

import org.hibernate.validator.constraints.br.CPF;
import org.springframework.format.annotation.DateTimeFormat;

import com.oliveiralia.client_registration.entities.Client;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;

public class ClientDTO {
	
	@Size(min = 3, max = 120, message = "Minimum of 3 and maximum of 120 characters.")
	@NotBlank(message = "Required field.")
	private String name;
	
	@CPF(message = "Invalid CPF.")
	private String cpf;
	
	@Positive(message = "The value must be positive.")
	private Double income;
	
	@DateTimeFormat(pattern = "yyyy/MM/dd")
	private LocalDate birthDate;
	
	@Size(max = 2, message="Values ​​of maximum 2 digits.")
	@Positive(message = "Positive values only")
	private Integer children;

	public ClientDTO(Client entity) {
		name = entity.getName();
		cpf = entity.getCpf();
		income = entity.getIncome();
		birthDate = entity.getBirthDate();
		children = entity.getChildren();
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
