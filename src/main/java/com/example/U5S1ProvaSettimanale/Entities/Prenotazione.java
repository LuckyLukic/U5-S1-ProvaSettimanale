package com.example.U5S1ProvaSettimanale.Entities;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString

public class Prenotazione {
	
	@Id
	@GeneratedValue
	private int id;
	
	private LocalDate dataPrenotazione;
	
	@OneToOne
	private Postazione postazione;
	
	@ManyToOne
	private User utente;
	
	public Prenotazione(LocalDate dataPrenotazione, Postazione postazione, User utente) {
	
		this.dataPrenotazione = dataPrenotazione;
		this.postazione = postazione;
		this.utente = utente;
	}	

}
