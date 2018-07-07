package sn.tnt.gestionmonitoring.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

import sn.tnt.gestionmonitoring.domaine.Zone;
import sn.tnt.gestionmonitoring.utils.ConnectionBD;

public class IDAOZoneImpl implements IDAOZone {
	private static Connection Con=ConnectionBD.getConnection();
	@Override
	public void ajouter(Zone t) {
		// TODO Auto-generated method stub
		try {
			 //preparation de la requete
			String sql="INSERT into zone (lieu,frequence,id_chaine) values(?, ?,?)";
			PreparedStatement pst=Con.prepareStatement(sql);
			//transmission des valeurs aux parametres de la requete
			pst.setString(1,t.getLieu());
			pst.setString(2,t.getFrequence());
			pst.setInt(3, t.getChaine().getId_chaine());
			//execussion de la requete
			pst.executeUpdate();
			System.out.println("zone ajoutees ");
		} catch (Exception e) {
			// TODO: handle exception
		System.out.println("Probleme de driver ou connection avec la BD");
		e.printStackTrace();
		}
		
	}

	@Override
	public List<Zone> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Zone t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Zone t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void editer(Zone t) {
		// TODO Auto-generated method stub
		
	}

}
