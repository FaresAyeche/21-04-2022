

import java.util.ArrayList;

public class User {
	private int ID ;
	private String prenom;
	private String nom;
    private int numTel;
    private String mail;
    ArrayList<Rent> list1  = new ArrayList<Rent>();
	public User(int iD, String prenom, String nom, int numTel, String mail, ArrayList<Rent> list1) {
		super();
		this.ID = iD;
		this.prenom = prenom;
		this.nom = nom;
		this.numTel = numTel;
		this.mail = mail;
		this.list1 = list1;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getNumTel() {
		return numTel;
	}
	public void setNumTel(int numTel) {
		this.numTel = numTel;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public ArrayList<Rent> getList1() {
		return list1;
	}
	public void setList1(ArrayList<Rent> list1) {
		this.list1 = list1;
	}
	@Override
	public String toString() {
		return "User [ID=" + ID + ", prenom=" + prenom + ", nom=" + nom + ", numTel=" + numTel + ", mail=" + mail
				+ ", list1=" + list1 + "]";
	}

	public void AfficherUser() {
		System.out.println(toString());}

	public Boolean VerifierUser(User user1,User user2) {
		Boolean verif = false;
		if (user1.getNumTel()==(user2.getNumTel()) );

		verif = true;
		System.out.println("les deux utilisateur sont similaire");
		return verif;}
	
}
