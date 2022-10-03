package fenetre;

public class film {
	private int id;
	private String  nom;
	private String genre;
	private int annee;
	public film() {
		super();
	}
	public film(String nom, String genre, int annee) {
		super();
		this.nom = nom;
		this.genre = genre;
		this.annee = annee;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public int getAnnee() {
		return annee;
	}
	public void setAnnee(int annee) {
		this.annee = annee;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
	

}
