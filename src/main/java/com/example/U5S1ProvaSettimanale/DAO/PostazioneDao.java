package com.example.U5S1ProvaSettimanale.DAO;

import com.example.U5S1ProvaSettimanale.Entities.Postazione;
import com.example.U5S1ProvaSettimanale.Services.TipoPostazione;

public interface PostazioneDao {
	
	public void savePostazione (Postazione postazione);
	
	public void findPostazioneByTipoAndCitta(TipoPostazione tipo ,String citta);

}
