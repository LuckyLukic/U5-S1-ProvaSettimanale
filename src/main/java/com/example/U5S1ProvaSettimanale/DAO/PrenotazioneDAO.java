package com.example.U5S1ProvaSettimanale.DAO;

import java.time.LocalDate;

import com.example.U5S1ProvaSettimanale.Entities.Postazione;
import com.example.U5S1ProvaSettimanale.Entities.Prenotazione;
import com.example.U5S1ProvaSettimanale.Entities.User;

public interface PrenotazioneDAO {
	
	public void savePrenotazione (Prenotazione prenotazione);
	
	public boolean controlloDataPostazione(Postazione postazione, LocalDate dataPrenotazione);
    public boolean controlloDataUtente(User utente, LocalDate dataPrenotazione);

}
