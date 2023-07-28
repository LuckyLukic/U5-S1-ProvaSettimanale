package com.example.U5S1ProvaSettimanale;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.U5S1ProvaSettimanale.DAO.EdificioDao;
import com.example.U5S1ProvaSettimanale.DAO.PostazioneDao;
import com.example.U5S1ProvaSettimanale.DAO.PrenotazioneDAO;
import com.example.U5S1ProvaSettimanale.DAO.UserDAO;
import com.example.U5S1ProvaSettimanale.Entities.Edificio;
import com.example.U5S1ProvaSettimanale.Entities.Postazione;
import com.example.U5S1ProvaSettimanale.Entities.Prenotazione;
import com.example.U5S1ProvaSettimanale.Entities.User;
import com.example.U5S1ProvaSettimanale.Services.TipoPostazione;

@Component
public class Runner implements CommandLineRunner {
	
	@Autowired
	private UserDAO userDao;
	
	@Autowired
	private EdificioDao edificioDao;
	
	@Autowired
	private PostazioneDao postazioneDao;
	
	@Autowired
	private PrenotazioneDAO prenotazioneDao;

	@Override
	public void run(String... args) throws Exception {
		
		User utente01 = new User("Luca", "Iannice", "luca@gmail.com");
		
		Edificio edificio01 = new Edificio("Ciccio", "Via delle Vie 15", "Bologna");
		
		Postazione postazione01 = new Postazione("Adatto per corporate meeting", TipoPostazione.OPENSPACE, 10, edificio01 );
		
		Prenotazione prenotazione01 = new Prenotazione(LocalDate.of(2023, 8, 02), postazione01, utente01);
		
		userDao.saveUser(utente01);
		edificioDao.saveEdificio(edificio01);
		postazioneDao.savePostazione(postazione01);
		prenotazioneDao.savePrenotazione(prenotazione01);
		
	}

}
