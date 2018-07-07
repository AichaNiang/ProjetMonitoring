package sn.tnt.gestionmonitoring.domaine;

public class Compte_user {
	private int id;
	private boolean etat_compte;
	private String login;
	private String password;
	public int getId() {
		return id;
	}
	public Compte_user() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void setId(int id) {
		this.id = id;
	}
	public boolean isEtat_compte() {
		return etat_compte;
	}
	public void setEtat_compte(boolean etat_compte) {
		this.etat_compte = etat_compte;
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
	
	
	
	@Override
	public String toString() {
		return "Compte_user [id=" + id + ", etat_compte=" + etat_compte + ", login=" + login + ", password=" + password
				+ "]";
	}
	public Compte_user(boolean etat_compte, String login, String password) {
		super();
		this.etat_compte = etat_compte;
		this.login = login;
		this.password = password;
	}
	

}
