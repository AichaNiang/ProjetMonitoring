/**
 * 
 */
package sn.tnt.gestionmonitoring.utils;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author diawara
 *
 */
public class CrypterPassword {
	
	/*
	 * StringBuffer qui représente également une chaine de caractères mais
	 * les objets de type StringBuffer sont mutables. Dès lors, les
	 * opérations dessus seront plus rapides.
	 *
	 */
	private static StringBuilder stringbuilder = null;
	
	
	public static String chiffrage(String chaineClaire){
		
		try {
			stringbuilder = new StringBuilder();
			Logger.getLogger(chaineClaire);

			/*
			 * Etape1: Obtention d'une l'implementation de l'agorithme de
			 * crypatge SHA-256 avec la mehode statique getInstance();
			 */
			MessageDigest messagedigest = MessageDigest.getInstance("SHA-256");
			
			/*
			 * Etape2: Recuperation de la valeur de hachage avec la methode
			 * digest() qui prend en parametre un tableau de byte
			 */
			byte[] hachage = messagedigest.digest(chaineClaire.getBytes("UTF-8"));
			
			
			/*Etape3: Parcour du tableau et convertion  de chaque  byte en  format hexadecimal*/
			for (int i = 0; i < hachage.length; i++) {
				
			stringbuilder.append(Integer.toString((hachage[i] & 0xff) + 0x100, 16).substring(1));
			
				
			}
			
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			Logger.getLogger(CrypterPassword.class.getName(), null).log(Level.SEVERE, null, e);;
			
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			Logger.getLogger(CrypterPassword.class.getName(), null).log(Level.SEVERE, null, e);;
			
		}
		
		

		
		return stringbuilder.toString();
		
	}

}
