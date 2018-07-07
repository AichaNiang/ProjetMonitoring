package sn.tnt.gestionmonitoring.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import sn.tnt.gestionmonitoring.domaine.Acteur;
import sn.tnt.gestionmonitoring.utils.ConnectionBD;

public class IDaoAuteurImpl implements IDAOActeur{
 private static Connection Con=ConnectionBD.getConnection();
	@Override
	public void ajouter(Acteur t) {
		// TODO Auto-generated method stub
		try {
			//preparation de la requete
			String sql="INSERT INTO  acteur(nom,prenom,email,num)values(?,?,?,?) ";
			PreparedStatement pst=Con.prepareStatement(sql);
			// Etape 4 : Transmission des valeur aux parametres de la requete
			pst.setString(1,t.getNom());
			pst.setString(2, t.getPrenom());
			pst.setString(3, t.getEmail());
			pst.setString(4, t.getNum());
			// Etape 5 : Execution de la requete
			pst.executeUpdate();

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Probleme de driver ou connection avec la BD");
			e.printStackTrace();
		}
		
	}
	public boolean authentification(String login, String password) {
		
		Acteur acteurFind;
		List<Acteur> listeActeur = new ArrayList<>();
		
		boolean canConnect = false;
		
		
		try {
			String sql ="SELECT * FROM acteur WHERE login=? AND password =?";
			PreparedStatement pst =Con.prepareStatement(sql);
			//Transmission de la valeur
			pst.setString(1, login);
			pst.setString(2, password);
			//Execussion de la requette 
			ResultSet rs = pst.executeQuery();
			
			//Traitement des valeurs
			while (rs.next()) {
				
				String log = rs.getString("login");
				String pass = rs.getString("password");
				
				acteurFind = new Acteur(log,pass);
				
				listeActeur.add(acteurFind);
					
			}
			
			for (Acteur acteur : listeActeur) {
				
				if (login.equalsIgnoreCase(acteur.getLogin()) && password.equals(acteur.getPassword())) {
					
					canConnect = true;
				}
			}
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
				
		return canConnect;
	}
	@Override
	public List<Acteur> getAll() {
		// TODO Auto-generated method stub
		List<Acteur> listActeur =new ArrayList<>();
		try {
			//Preparation de la requete
			String sql="select * from acteur";
			Statement stm=Con.createStatement();
			//Excecussion de la requete
			ResultSet rs=stm.executeQuery(sql);
			//traitement des données du resultat de la requete
			while(rs.next())
			{
				String nomRecuperer=rs.getString("nom");
				String prenomRecuper=rs.getString("prenom");
				String emailRecuperer=rs.getString("email");
				String numRecuper=rs.getString("num");
				Acteur acteur=new Acteur(nomRecuperer,prenomRecuper,emailRecuperer,numRecuper);
				listActeur.add(acteur);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return listActeur;
	}

	@Override
	public void delete(Acteur t) {
		// TODO Auto-generated method stub
	try {
		//preparation de la requete
		String sql="delete  from acteur where id_acteur=?";
		PreparedStatement pst=Con.prepareStatement(sql);
		//transmission aux valeurs de la requete
		pst.setInt(1,t.getId_acteur());
		//excecution de la requete
		pst.executeUpdate();
		System.out.println("Supression reussie");
				
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}
	}

	@Override
	public void update(Acteur t) {
		// TODO Auto-generated method stub
		try {
			 //preparation de la requete
			String sql="update auteur set nom=?,prenom=?,email=?,num=? where id_acteur=?";
			PreparedStatement pst=Con.prepareStatement(sql);
			//transmission des valeurs a la requete
			pst.setString(1, t.getNom());
			pst.setString(2,t.getPrenom());
			pst.setString(3, t.getEmail());
			pst.setString(4, t.getNum());
			System.out.println("Modification effectuee avec succes");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
 
	@Override
	public void editer(Acteur t) {
		// TODO Auto-generated method stub
		
	}

}
