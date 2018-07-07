package sn.tnt.gestionmonitoring.domaine;

public class Zone {
private int id_zone;
private String lieu;
private String frequence;
private  Chaine chaine;

public Zone() {
	super();
	// TODO Auto-generated constructor stub
}
public int getId_zone() {
	return id_zone;
}
public void setId_zone(int id_zone) {
	this.id_zone = id_zone;
}
public String getLieu() {
	return lieu;
}
public void setLieu(String lieu) {
	this.lieu = lieu;
}
public String getFrequence() {
	return frequence;
}
public void setFrequence(String frequence) {
	this.frequence = frequence;
}

@Override
public String toString() {
	return "Zone [id_zone=" + id_zone + ", lieu=" + lieu + ", frequence=" + frequence + "]";
}
public Chaine getChaine() {
	return chaine;
}
public void setChaine(Chaine chaine) {
	this.chaine = chaine;
}

}
