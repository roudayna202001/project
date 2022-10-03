package fenetre;

import java.util.ArrayList;
import java.util.List;

public class auteur {
 private int idA;
 private String nom;
 private String prenom;
 private String natio;
 private List<auteur> auteurs=new ArrayList<auteur>();
public auteur() {
	super();
	
}

public auteur(int idA, String nom, String prenom, String natio) {
	super();
	this.idA = idA;
	this.nom = nom;
	this.prenom = prenom;
	this.natio = natio;
	
}

public int getIdA() {
	return idA;
}
public void setIdA(int idA) {
	this.idA = idA;
}
public String getNom() {
	return nom;
}
public void setNom(String nom) {
	this.nom = nom;
}
public String getPrenom() {
	return prenom;
}
public void setPrenom(String prenom) {
	this.prenom = prenom;
}
public String getNatio() {
	return natio;
}
public void setNatio(String natio) {
	this.natio = natio;
}
public List<auteur> getAuteurs() {
	return auteurs;
}
public void setAuteurs(List<auteur> auteurs) {
	this.auteurs = auteurs;
}
 
}
