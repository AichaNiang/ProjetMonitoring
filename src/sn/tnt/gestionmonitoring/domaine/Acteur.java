package sn.tnt.gestionmonitoring.domaine;

public class Acteur {
private int id_acteur;
private String nom;
private String prenom;
private String email;
private String num;
private String login;
private String password;

public Acteur() {
	super();
	// TODO Auto-generated constructor stub
}



public Acteur(String login, String password) {
	super();
	this.login = login;
	this.password = password;
}



public String getLogin() {
	return login;
}



public void setLogin(String login) {
	this.login = login;
}



public String getPassword() {
	return password;
}



public void setPassword(String password) {
	this.password = password;
}



public Acteur(String nom, String prenom, String email, String num) {
	super();
	this.nom = nom;
	this.prenom = prenom;
	this.email = email;
	this.num = num;
}

public Acteur(int id_acteur, String nom, String prenom, String email, String num) {
	super();
	this.id_acteur = id_acteur;
	this.nom = nom;
	this.prenom = prenom;
	this.email = email;
	this.num = num;
}

public int getId_acteur() {
	return id_acteur;
}
public void setId_acteur(int id_acteur) {
	this.id_acteur = id_acteur;
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
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getNum() {
	return num;
}
public void setNum(String num) {
	this.num = num;
}
@Override
public String toString() {
	return "Acteur [id_acteur=" + id_acteur + ", nom=" + nom + ", prenom=" + prenom + ", email=" + email + ", num="
			+ num + "]";
}


}
