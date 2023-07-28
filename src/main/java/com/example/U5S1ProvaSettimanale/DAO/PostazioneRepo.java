package com.example.U5S1ProvaSettimanale.DAO;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.U5S1ProvaSettimanale.Entities.Postazione;
import com.example.U5S1ProvaSettimanale.Services.TipoPostazione;

@Repository
public interface PostazioneRepo extends JpaRepository <Postazione, Integer> {
	
	List<Postazione> findByTipoPostazioneAndEdificio_Citta(TipoPostazione tipo, String citta);

}
