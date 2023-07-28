package com.example.U5S1ProvaSettimanale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.U5S1ProvaSettimanale.DAO.EdificioDao;
import com.example.U5S1ProvaSettimanale.DAO.UserDAO;
import com.example.U5S1ProvaSettimanale.Entities.Edificio;
import com.example.U5S1ProvaSettimanale.Entities.User;

@Component
public class Runner implements CommandLineRunner {
	
	@Autowired
	private UserDAO userDao;
	
	@Autowired
	private EdificioDao edificioDao;

	@Override
	public void run(String... args) throws Exception {
		
		User utente01 = new User("Luca", "Iannice", "luca@gmail.com");
		
		Edificio edificio01 = new Edificio("Ciccio", "Via delle Vie 15", "Bologna");
		
		userDao.saveUser(utente01);
		edificioDao.saveEdificio(edificio01);
		
	}

}
