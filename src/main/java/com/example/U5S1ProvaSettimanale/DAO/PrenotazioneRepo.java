package com.example.U5S1ProvaSettimanale.DAO;

import java.time.LocalDate;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.U5S1ProvaSettimanale.Entities.Postazione;
import com.example.U5S1ProvaSettimanale.Entities.Prenotazione;
import com.example.U5S1ProvaSettimanale.Entities.User;

@Repository
public interface PrenotazioneRepo extends JpaRepository <Prenotazione, Integer>{

	boolean existsByPostazioneAndDataPrenotazione(Postazione postazione, LocalDate dataPrenotazione);
    boolean existsByUtenteAndDataPrenotazione(User utente, LocalDate dataPrenotazione);
    
}
