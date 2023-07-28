package com.example.U5S1ProvaSettimanale.DAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.U5S1ProvaSettimanale.Entities.Prenotazione;

@Service
public class PrenotazioneService implements PrenotazioneDAO{
	
	@Autowired
	private PrenotazioneRepo prenotazioneRepo;

	@Override
	public void savePrenotazione(Prenotazione prenotazione) {
		
		   prenotazioneRepo.save(prenotazione);
	       System.out.println((prenotazione.getUtente() + " " + prenotazione.getPostazione() + " " + prenotazione.getDataPrenotazione() +  " " + "salvato!"));
	
}


}
