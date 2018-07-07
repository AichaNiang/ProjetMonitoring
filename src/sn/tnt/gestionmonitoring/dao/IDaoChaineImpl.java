package sn.tnt.gestionmonitoring.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import sn.tnt.gestionmonitoring.domaine.Chaine;
import sn.tnt.gestionmonitoring.utils.ConnectionBD;

public class IDaoChaineImpl implements IDAOChaine{
private static Connection con=ConnectionBD.getConnection();
	@Override
	public void ajouter(Chaine t) {
		// TODO Auto-generated method stub
		try {
			 //preparation de la requete
			String sql="INSERT into Chaine (LCN,nom_chaine) values( ?,?)";
			PreparedStatement pst=con.prepareStatement(sql);
			//transmission des valeurs aux parametres de la requete
			pst.setString(1,t.getLCN());
			pst.setString(2, t.getNom());
			//execussion de la requete
			pst.executeUpdate();
			System.out.println("chaines ajoutees ");
		} catch (Exception e) {
			// TODO: handle exception
		System.out.println("Probleme de driver ou connection avec la BD");
		e.printStackTrace();
		}
		
	}

	@Override
	public List<Chaine> getAll() {
		// TODO Auto-generated method stub
		List<Chaine> listchaine=new ArrayList<>();
		//preparation de la requete
		
		try {
			String sql="Select * from chaine";
			//PreparedStatement pst=con.prepareStatement(sql);
			Statement stm=con.createStatement();
		  //Execution de la requete
			ResultSet rs=stm.executeQuery(sql);
		  //traitement des donnees du resultat de la requete
			while (rs.next()) 
			{
			String LCNRecuperer=rs.getString("LCN");
			String NomChaineRecuper=rs.getString("nom_chaine");
			Chaine chaine=new Chaine(LCNRecuperer,NomChaineRecuper)	;
			listchaine.add(chaine);
			}
	    
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return listchaine;
	}

	@Override
	public void delete(Chaine t) {
		// TODO Auto-generated method stub
		try {
			 //preparation de la requete
			String sql="Delete from chaine where id_chaine=?";
			PreparedStatement pst=con.prepareStatement(sql);
			//transmission aux valeurs de la requete
		pst.setInt(1, t.getId_chaine());
		//execution de la requete
		pst.executeUpdate();
		System.out.println("Suppression reussie");	
		} catch (Exception e) {
			// TODO: handle exception
			
		}
		
	}

	@Override
	public void update(Chaine t) {
		// TODO Auto-generated method stub
		//preparation de la requete
		try {
			String sql="UPDATE chaine set LCN=?,nom_chaine=?";
			PreparedStatement pst=con.prepareStatement(sql);
			//transmission des valeurs aux parametres de la requete
			pst.setString(1,t.getLCN());
			pst.setString(2, t.getNom());
			//execussion de la requete
			pst.executeUpdate();
			System.out.println("modification effectuee avec succes");
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
	}

	@Override
	public void editer(Chaine t) {
		// TODO Auto-generated method stub
		
	}

}
