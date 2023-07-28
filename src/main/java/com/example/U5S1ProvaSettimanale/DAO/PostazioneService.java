package com.example.U5S1ProvaSettimanale.DAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.U5S1ProvaSettimanale.Entities.Postazione;
import com.example.U5S1ProvaSettimanale.Services.TipoPostazione;


@Service
public class PostazioneService implements PostazioneDao {
		
		@Autowired
		private PostazioneRepo postazioneRepo;

		@Override
		public void savePostazione(Postazione postazione) {
			
			postazioneRepo.save(postazione);
			System.out.println((postazione.getEdificio() + " " + postazione.getDescrizione() + " " + postazione.getNumeroOccupanti() + " " + "salvato!"));
		}

		@Override
		public void findPostazioneByTipoAndCitta(TipoPostazione tipo, String citta) {
			
			List<Postazione> postazioni= postazioneRepo.findByTipoPostazioneAndEdificio_Citta(tipo, citta);
		    if (!postazioni.isEmpty()) {
		        for (Postazione postazioneInCitta : postazioni) { 
		            System.out.println("Postazione trovata: " + postazioneInCitta);
		        }
		    } else {
		        System.out.println("Nessuna postazione trovata per il tipo '" + tipo + "' nella città '" + citta);
		    } 
		}


	}


