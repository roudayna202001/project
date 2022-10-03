package dao;

import java.awt.List;

//import fenetre.auteur;
import fenetre.livre;

public interface lCrud {
	public void addLivre(livre l);
	//public void UpdateLivre(int id,String titre );
	public void deletLivre(int id);
	//public java.util.List<livre> getAllLivres();
	void UpdateLivre(int id, String titre, String langue, int nbpage);
	
	/*public void addAuteur(auteur a);
	public void UpdateAuteur(int id ,String nom);
	public void deleteAuteur(int id);*/
	
	
	/*public void addEmp(emprunt e);
	public void Updatemp(int id ,String nom);
	public void deletemp(int id);*/
	

}
