package com.example.U5S1ProvaSettimanale.Entities;

import com.example.U5S1ProvaSettimanale.Services.TipoPostazione;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor

public class Postazione {
	
	@Id
	@GeneratedValue
	private int id;
	private String descrizione;
	
	@Enumerated(EnumType.STRING)
	private TipoPostazione tipoPostazione;
	
	private int numeroOccupanti;
	private Boolean disponibilita;
	
	@ManyToOne
	private Edificio edificio;
	@OneToOne (mappedBy = "postazione")
	private Prenotazione prenotazione;
	
	public Postazione(String descrizione, TipoPostazione tipoPostazione, int numeroOccupanti,
			Edificio edificio) {
		
		this.descrizione = descrizione;
		this.tipoPostazione = tipoPostazione;
		this.numeroOccupanti = numeroOccupanti;
		this.edificio = edificio;
	}

	@Override
	public String toString() {
		return "Postazione [descrizione=" + descrizione + ", tipoPostazione=" + tipoPostazione + ", numeroOccupanti="
				+ numeroOccupanti + ", edificio=" + edificio + ", prenotazione="
				+ prenotazione + "]";
	}
	
	
	
	
	
	

}
