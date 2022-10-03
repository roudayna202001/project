package fenetre;

import java.util.ArrayList;
import java.util.List;

public class livre {
private int id;
private String titre;
private String langue;
private int nbpage;
private List<livre> livres=new ArrayList<livre>();
public livre (){
	super();
}

public livre(int id, String titre, String langue, int nbpage) {
	
	this.id = id;
	this.titre = titre;
	this.langue = langue;
	this.nbpage = nbpage;
}
public int getId() {
	return id;
}
public String getTitre() {
	return titre;
}
public String getLangue() {
	return langue;
}
public int getNbpage() {
	return nbpage;
}
public void setId(int id) {
	this.id = id;
}
public void setTitre(String titre) {
	this.titre = titre;
}
public void setLangue(String langue) {
	this.langue = langue;
}
public void setNbpage(int nbpage) {
	this.nbpage = nbpage;
}
public List<livre> getLivres() {
	return livres;
}
public void setLivres(List<livre> livres) {
	this.livres = livres;
}

}
