package com.example.U5S1ProvaSettimanale.DAO;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.U5S1ProvaSettimanale.Entities.Postazione;
import com.example.U5S1ProvaSettimanale.Entities.Prenotazione;
import com.example.U5S1ProvaSettimanale.Entities.User;

@Service
public class PrenotazioneService implements PrenotazioneDAO{
	
	@Autowired
	private PrenotazioneRepo prenotazioneRepo;

	@Override
	public void savePrenotazione(Prenotazione prenotazione) {
		
		   prenotazioneRepo.save(prenotazione);
	       System.out.println((prenotazione.getUtente() + " " + prenotazione.getPostazione() + " " + prenotazione.getDataPrenotazione() +  " " + "salvato!"));
	
    }
	

	@Override
	public boolean controlloDataUtente(User utente, LocalDate dataPrenotazione) {
		  return prenotazioneRepo.existsByUtenteAndDataPrenotazione(utente, dataPrenotazione);
    }
	
	@Override
	public boolean controlloDataPostazione(Postazione postazione, LocalDate dataPrenotazione) {
        return prenotazioneRepo.existsByPostazioneAndDataPrenotazione(postazione, dataPrenotazione);
    }
	
	}



