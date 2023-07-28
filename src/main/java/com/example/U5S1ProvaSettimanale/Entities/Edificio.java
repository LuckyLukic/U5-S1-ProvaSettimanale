package com.example.U5S1ProvaSettimanale.Entities;



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

public class Edificio {
	
	@Id
	@GeneratedValue
	private int id;
	private String nome;
	private String indirizzo;
	private String citta;
	
	public Edificio(String nome, String indirizzo, String citta) {
	
		this.nome = nome;
		this.indirizzo = indirizzo;
		this.citta = citta;
	}
	
	
	

}
