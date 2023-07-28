package com.example.U5S1ProvaSettimanale.DAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.U5S1ProvaSettimanale.Entities.Edificio;


@Service
public class EdificioService implements EdificioDao {

		@Autowired
		private EdificioRepo edificioRepo;

		@Override
		public void saveEdificio(Edificio edificio) {
			
			   edificioRepo.save(edificio);
		       System.out.println((edificio.getNome() + " " + edificio.getIndirizzo() + " " + "salvato!"));
		
	}

}
