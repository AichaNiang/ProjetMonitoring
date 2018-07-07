package sn.tnt.gestionmonitoring.domaine;

import java.util.Date;
import java.time.*;

public class Monitore {
	private int id_monitore;
	private String incident;
	private int id_acteur;
	private Date heure_deb;
	private Date heure_fin;
	private Date duree;
	private String source;
	private String alarme;
	private String description;
	private String observation;
	private int id_chaine;
	public Monitore() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Monitore(String incident,int id_acteur, Date heure_deb, Date heure_fin, Date duree, String source, String alarme,
			String description, String observation,int id_chaine) {
		super();
		this.incident = incident;
		this.id_acteur = id_acteur;
		this.heure_deb = heure_deb;
		this.heure_fin = heure_fin;
		this.duree = duree;
		this.source = source;
		this.alarme = alarme;
		this.description = description;
		this.observation = observation;
		this.id_chaine = id_chaine;
	}

	public int getId_monotore() {
		return id_monitore;
	}
	public void setId_monitore(int id_monitore) {
		this.id_monitore = id_monitore;
	}
	public String getIncident() {
		return incident;
	}
	public void setIncident(String incident) {
		this.incident = incident;
	}
	public int getid_acteur() {
		return id_acteur;
	}
	public void setid_acteur(int id_acteur) {
		this.id_acteur = id_acteur;
	}
	public Date getHeure_deb() {
		return heure_deb;
	}
	public void setHeure_deb(Date heure_deb) {
		this.heure_deb = heure_deb;
	}
	public Date getHeure_fin() {
		return heure_fin;
	}
	public void setHeure_fin(Date heure_fin) {
		this.heure_fin = heure_fin;
	}
	public Date getDuree() {
		return duree;
	}
	public void setDuree(Date duree) {
		this.duree = duree;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getAlarme() {
		return alarme;
	}
	public void setAlarme(String alarme) {
		this.alarme = alarme;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getObservation() {
		return observation;
	}
	public void setObservation(String observation) {
		this.observation = observation;
	}
	public int getid_chaine() {
		return id_chaine;
	}
	public void setid_chaine(int id_chaine) {
		this.id_chaine = id_chaine;
	}
	@Override
	public String toString() {
		return "Monitore [id_monitore=" + id_monitore + ", incident=" + incident + ", id_acteur=" +heure_deb
				+ ", heure_fin=" + heure_fin + ", duree=" + duree + ", source=" + source + ", alarme=" + alarme
				+ ", description=" + description + ", observation=" + observation + "]";
	}
	

}
