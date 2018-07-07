package sn.tnt.gestionmonitoring.domaine;

public class Chaine {
private int id_chaine;
private String LCN;
private String nom;
public Chaine() {
	super();
	// TODO Auto-generated constructor stub
}

public Chaine(String lCN, String nom) {
	super();
	LCN = lCN;
	this.nom = nom;
}

public int getId_chaine() {
	return id_chaine;
}
public void setId_chaine(int id_chaine) {
	this.id_chaine = id_chaine;
}
public String getLCN() {
	return LCN;
}
public void setLCN(String lCN) {
	LCN = lCN;
}
public String getNom() {
	return nom;
}
public void setNom(String nom) {
	this.nom = nom;
}
@Override
public String toString() {
	return "Chaine [id_chaine=" + id_chaine + ", LCN=" + LCN + ", nom=" + nom + "]";
}

}
