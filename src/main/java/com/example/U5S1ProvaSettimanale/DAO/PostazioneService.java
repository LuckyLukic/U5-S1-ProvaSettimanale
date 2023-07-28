package com.example.U5S1ProvaSettimanale.DAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.U5S1ProvaSettimanale.Entities.Postazione;


@Service
public class PostazioneService implements PostazioneDao {
		
		@Autowired
		private PostazioneRepo postazioneRepo;

		@Override
		public void savePostazione(Postazione postazione) {
			
			postazioneRepo.save(postazione);
			System.out.println((postazione.getEdificio() + " " + postazione.getDescrizione() + " " + postazione.getNumeroOccupanti() + " " + "salvato!"));
		}


	}


