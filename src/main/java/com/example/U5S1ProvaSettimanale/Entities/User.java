package com.example.U5S1ProvaSettimanale.Entities;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
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
	
	@OneToMany (mappedBy ="utente")
	List<Prenotazione> prenotazione;
	
	public User(String nome, String cognome, String email) {
	
		this.nome = nome;
		this.cognome = cognome;
		this.email = email;
	}

	@Override
	public String toString() {
		return "User [nome=" + nome + ", cognome=" + cognome + ", email=" + email + ", prenotazione=" + prenotazione
				+ "]";
	}
	
	
	
	
	

}
