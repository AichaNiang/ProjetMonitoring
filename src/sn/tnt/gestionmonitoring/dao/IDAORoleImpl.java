package sn.tnt.gestionmonitoring.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import sn.tnt.gestionmonitoring.domaine.Acteur;
import sn.tnt.gestionmonitoring.domaine.Monitore;
import sn.tnt.gestionmonitoring.domaine.Role;
import sn.tnt.gestionmonitoring.utils.ConnectionBD;

public class IDAORoleImpl implements IDAORole{
	private static Connection Con=ConnectionBD.getConnection();
	@Override
	public void ajouter(Role t) {
		// TODO Auto-generated method stub
		try {
			//preparation de la requete
			String sql="INSERT INTO  role(nom)values(?) ";
			PreparedStatement pst=Con.prepareStatement(sql);
			// Etape 4 : Transmission des valeur aux parametres de la requete
			pst.setString(1,t.getNom());
			
			// Etape 5 : Execution de la requete
			pst.executeUpdate();

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Probleme de driver ou connection avec la BD");
			e.printStackTrace();
		}
	}

	@Override
	public List<Role> getAll() {
		// TODO Auto-generated method stub
		List<Role> listRole =new ArrayList<>();
		try {
			//Preparation de la requete
			String sql="select * from role";
			Statement stm=Con.createStatement();
			//Excecussion de la requete
			ResultSet rs=stm.executeQuery(sql);
			//traitement des données du resultat de la requete
			while(rs.next())
			{
				String nomRecuperer=rs.getString("nom");
				
				Role role=new Role(nomRecuperer);
				listRole.add(role);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return listRole;
	}

	@Override
	public void delete(Role t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Role t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void editer(Role t) {
		// TODO Auto-generated method stub
		
	}

	

}
