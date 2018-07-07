package sn.tnt.gestionmonitoring.domaine;

public class Role {
	private int id_role;
	private String nom;
	public Role() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Role(String nom) {
		super();
		this.nom = nom;
	}

	public int getId_role() {
		return id_role;
	}
	public void setId_role(int id_role) {
		this.id_role = id_role;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	@Override
	public String toString() {
		return "Role [id_role=" + id_role + ", nom=" + nom + "]";
	}
   
}
