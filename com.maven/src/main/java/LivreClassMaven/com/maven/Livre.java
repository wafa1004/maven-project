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
	
	/*//Methode main pour tester la classe Livre
	public static void main(String[] args) 
	{
		Livre livre1 = new Livre("Harry Potter " , "J.K. Rolling " , "Bloomsbury Publishing " , 26 , "roman");
		Livre livre2 = new Livre("Le Robert Micro " , "Alain Rey " , "Divers Interforum " , 17 , "dictionnaire");
		System.out.println(livre1);
		System.out.println(livre2);
		livre1.setPrix(33);
		System.out.println(livre1);
		System.out.println(livre2.getAuteur());
	}*/

}
