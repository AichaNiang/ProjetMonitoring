package sn.tnt.gestionmonitoring.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import sn.tnt.gestionmonitoring.domaine.Chaine;
import sn.tnt.gestionmonitoring.domaine.Compte_user;
import sn.tnt.gestionmonitoring.utils.ConnectionBD;

public class IDaoCompte_userImpl implements IDAOCompte_user{

	private static Connection con=ConnectionBD.getConnection();
	@Override
	public void ajouter(Compte_user t) {
		// TODO Auto-generated method stub
		
			try {
				 //preparation de la requete
				String sql="INSERT into compte_user (etat_compte,login,password) values( ?,?,?)";
				PreparedStatement pst=con.prepareStatement(sql);
				//transmission des valeurs aux parametres de la requete
				pst.setBoolean(1,t.isEtat_compte());
				pst.setString(2, t.getLogin());
				pst.setString(3, t.getPassword());
				//execussion de la requete
				pst.executeUpdate();
				System.out.println("users ajoutees  ");
				
			} catch (Exception e) {
				// TODO: handle exception
			System.out.println("Probleme de driver ou connection avec la BD");
			e.printStackTrace();
			}
			
		}

		
	

	@Override
	public List<Compte_user> getAll() {
		// TODO Auto-generated method stub
		List<Compte_user> listuser=new ArrayList<>();
		//preparation de la requete
		
		try {
			String sql="Select * from compte_user";
			//PreparedStatement pst=con.prepareStatement(sql);
			Statement stm=con.createStatement();
		  //Execution de la requete
			ResultSet rs=stm.executeQuery(sql);
		  //traitement des donnees du resultat de la requete
			while (rs.next()) 
			{
			boolean etat_compteRecuperer=rs.getBoolean("etat_compte");
			String loginRecupere=rs.getString("login");
			String passwordRecuperer=rs.getString("password");
			Compte_user compte_user=new Compte_user(etat_compteRecuperer,loginRecupere,passwordRecuperer);
			listuser.add(compte_user);
			}
	    
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return listuser;
	}
	

	public void delete(Compte_user t) {
		// TODO Auto-generated method stub
		try {
			 //preparation de la requete
			String sql="Delete from compte_user where id_user=?";
			PreparedStatement pst=con.prepareStatement(sql);
			//transmission aux valeurs de la requete
		pst.setInt(1, t.getId());
		//execution de la requete
		pst.executeUpdate();
		System.out.println("Suppression reussie");	
		} catch (Exception e) {
			// TODO: handle exception
			
		}
		
	}

	public void update(Compte_user t) {
		// TODO Auto-generated method stub
		//preparation de la requete
		try {
			String sql="UPDATE compte_user set etat_compte=?,login=?,password=?";
			PreparedStatement pst=con.prepareStatement(sql);
			//transmission des valeurs aux parametres de la requete
			pst.setBoolean(1, t.isEtat_compte());
			pst.setString(2, t.getLogin());
			pst.setString(2, t.getPassword());
			//execussion de la requete
			pst.executeUpdate();
			System.out.println("modification effectuee avec succes");
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
	}

	@Override
	public void editer(Compte_user t) {
		// TODO Auto-generated method stub
		
	}

}
