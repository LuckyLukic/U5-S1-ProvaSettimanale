package com.example.U5S1ProvaSettimanale.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.U5S1ProvaSettimanale.Entities.Prenotazione;

@Repository
public interface PrenotazioneRepo extends JpaRepository <Prenotazione, Integer>{

}
