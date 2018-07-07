package sn.tnt.gestionmonitoring.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;

import sn.tnt.gestionmonitoring.domaine.Acteur;
import sn.tnt.gestionmonitoring.domaine.Monitore;
import sn.tnt.gestionmonitoring.utils.ConnectionBD;

import java.util.ArrayList;
import java.util.Date;
import java.time.*;

public class IdaoMonitoreImpl implements IDAOMonitore{
	private static Connection Con=ConnectionBD.getConnection();

	@Override
	public void ajouter(Monitore t) {
		// TODO Auto-generated method stub
		try {
			//preparation de la requete
			String sql="INSERT INTO  acteur(incident,id_acteur,heure_deb,heure_fin,duree,source,alarme,description,observation,id_chaine)values(?,?,?,?,?,?,?,?,?,?) ";
			PreparedStatement pst=Con.prepareStatement(sql);
			// Etape 4 : Transmission des valeur aux parametres de la requete
			//ps.setDate(2, new java.sql.Date(endDate.getTime());
			pst.setString(1,t.getIncident());
			pst.setInt(2, t.getid_acteur());
			pst.setDate(3, (java.sql.Date) t.getHeure_deb());
			
			pst.setDate(4, (java.sql.Date) t.getHeure_fin());
			pst.setDate(5, (java.sql.Date) t.getDuree());
			pst.setString(6, t.getSource());
			pst.setString(7,t.getAlarme());
			pst.setString(8, t.getDescription());
			pst.setString(9, t.getObservation());
		    pst.setInt(10, t.getid_chaine());
			// Etape 5 : Execution de la requete
			pst.executeUpdate();

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Probleme de driver ou connection avec la BD");
			e.printStackTrace();
		}
	}

	@Override
	public List<Monitore> getAll() {
		// TODO Auto-generated method stub
		List<Monitore> listMonitore =new ArrayList<>();
		try {
			//Preparation de la requete
			String sql="select * from monitore";
			Statement stm=Con.createStatement();
			//Excecussion de la requete
			ResultSet rs=stm.executeQuery(sql);
			//traitement des données du resultat de la requete
			while(rs.next())
			{
				String incidentRecuperer=rs.getString("incident");
				int id_acteurRecuperer=rs.getInt("id_acteur");
				Date heure_debRecuper=rs.getDate("heure_deb");
				Date heure_finRecuperer=rs.getDate("heure_fin");
				Date dureeRecuper=rs.getDate("duree");
				String sourceRecuperer=rs.getString("source");
				String alarmeRecuper=rs.getString("alarme");
				String descriptionRecuperer=rs.getString("description");
				String observationRecuper=rs.getString("observation");
				int id_chaineRecuperer=rs.getInt("id_chaine");
				Monitore monitore=new Monitore(incidentRecuperer,id_acteurRecuperer,heure_debRecuper,heure_finRecuperer,dureeRecuper,
						sourceRecuperer,alarmeRecuper,descriptionRecuperer,observationRecuper,id_chaineRecuperer	);
				listMonitore.add(monitore);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return listMonitore;
	}

	@Override
	public void delete(Monitore t) {
		try {
			// TODO Auto-generated method stub
			String sql="Delete from monitore where id_monitore=?";
			PreparedStatement pst=Con.prepareStatement(sql);  
			//transmission sdes valeurs aux parametres de la requete
			pst.setInt(1, t.getId_monotore());
			//excution de la requete
			pst.executeUpdate();
			System.out.println("Supression reussie");
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

	@Override
	public void update(Monitore t) {
		// TODO Auto-generated method stub
		try {
			 //preparation de la requete
			String sql="update monitore set incident=?,id_acteur,heure_deb=?,heure_fin=?,duree=?,source=?,alarme=?,description=?,observation=?,id_chaine "
					+ "where id_monitore=?";
			PreparedStatement pst=Con.prepareStatement(sql);
			//transmission des valeurs a la requete
			pst.setString(1, t.getIncident());
			pst.setInt(2, t.getid_acteur());
			pst.setDate(3, (java.sql.Date) t.getHeure_deb());
			pst.setDate(4, (java.sql.Date) t.getHeure_fin());
			pst.setDate(5, (java.sql.Date) t.getDuree());
			pst.setString(6, t.getSource());
			pst.setString(7,t.getAlarme());
			pst.setString(8, t.getDescription());
			pst.setString(9, t.getObservation());
			pst.setInt(10, t.getid_chaine());
			System.out.println("Modification effectuee avec succes");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	@Override
	public void editer(Monitore t) {
		// TODO Auto-generated method stub
		
	}

}
