package LivreClassMaven.com.maven;

enum typeLivre {roman, biographie , dictionnaire};
public class Livre {

	private String titre;
	private String auteur;
	private String editeur;
	private int prix;
	private typeLivre type;

	//constructeur
	public Livre(String titre , String auteur , String editeur , int prix , String type)
	{
		this.titre = titre;
		this.auteur = auteur;
		this.editeur = editeur;
		this.prix = prix;
		this.type = typeLivre.valueOf(type);
	}
	
	//Muttateur pour le prix
	public void setPrix(int prixLivre) 
	{
		this.prix = prixLivre;
	}
	
	//Accesseur pour l'auteur
	public String getAuteur() 
	{
		return auteur;
	}
	
	//La methode toString
	public String toString() 
	{
		return "Titre du livre:  " + titre + ", Auteur: " + auteur + ", Editeur: " + editeur + ", Prix: " + prix + ", Type: "
				+ type + "." ;
	}
	
	public boolean equals(Object livre){
		boolean test = this.auteur.equals(((Livre) livre).getAuteur());
		return test;
	}
}
