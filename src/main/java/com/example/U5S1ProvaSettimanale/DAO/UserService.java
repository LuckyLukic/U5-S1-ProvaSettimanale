package com.example.U5S1ProvaSettimanale.DAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.U5S1ProvaSettimanale.Entities.User;

@Service
public class UserService implements UserDAO {
	
	@Autowired
	private UserRepo userRepo;

	@Override
	public void saveUser(User utente) {
		
		   userRepo.save(utente);
	        System.out.println((utente.getNome() + " " + utente.getCognome() + " " + "salvato!"));
		
	}

}
