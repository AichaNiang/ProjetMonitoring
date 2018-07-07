/**
 * 
 */
package sn.tnt.gestionmonitoring.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;

/**
 * @author diawara
 * Cette classe implemente le pattern Singleton.
 * Elle permet la création de l'unique instance de connexion avec la BD 
 *
 */
public class ConnectionBD {
	
	//Les parametres de la BD
	
	private static String driver =null;
	private static String url =null;
	private static String user=null;
	private static String password =null;
	private static Connection con = null;; // Cette popriéte permet de stocker l'unique instance de Connection avec la BD
	
	private static ResourceBundle rs= null;
	private static String bundleName = null;
	//Constructeur avec une vibilité private : Pour interdir les classes utilisatrices de créer
	// des instances via le constructeur
	
	private ConnectionBD() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @return con
	 * Cette méthode retourne l'unique instance de Connexion avec la BD 
	 */
	public static Connection getConnection(){
		
		
		
		if (con== null){
			
			try {
				//Chargement des donnees du fichier properties
				bundleName ="resources.configBD";
				
				rs= ResourceBundle.getBundle(bundleName);
				
				//Accees au données du fichier properties
				
				driver = rs.getString("driver");
				url = rs.getString("url");
				user = rs.getString("user");
				password = rs.getString("password");
				
				//Etape 1 : chargement du driver
				Class.forName(driver);
				
				System.out.println("Je certifie que je passe ici qu'une seule fois");
				
				//Etape 2: Etablissement de la connexion
				con = DriverManager.getConnection(url, user, password);
				System.out.println("Connection avec la BD réussie !!");
				
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				System.out.println("Probléme de connection  !!");
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return con;
		
	}
	
	

}
