package Myguitar.Dao;

import java.util.List;

import Myguitar.Model.Guitar;

public interface IGuitarDaoFactory {
	
	public List<Guitar> searchGuitar(String type);
	public void addGuitar(Guitar guitar);
	public void delGuitar(String SerialNumber);
	public List<Guitar> searchallGuitar();
	
	
}
