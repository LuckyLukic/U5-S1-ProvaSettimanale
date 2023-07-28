package com.example.U5S1ProvaSettimanale.Entities;



import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Edificio {
	
	@Id
	@GeneratedValue
	private int id;
	private String nome;
	private String indirizzo;
	private String citta;
	
	@OneToMany(mappedBy = "edificio")
	List <Postazione> postazione;
	
	public Edificio(String nome, String indirizzo, String citta) {
	
		this.nome = nome;
		this.indirizzo = indirizzo;
		this.citta = citta;
	}

	
	}
	
