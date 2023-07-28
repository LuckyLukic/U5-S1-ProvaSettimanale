package com.example.U5S1ProvaSettimanale.Entities;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class User {
	
	@Id
	@GeneratedValue
	private int id;
	private String nome;
	private String cognome;
	private String email;
	
	public User(String nome, String cognome, String email) {
	
		this.nome = nome;
		this.cognome = cognome;
		this.email = email;
	}
	
	
	

}
