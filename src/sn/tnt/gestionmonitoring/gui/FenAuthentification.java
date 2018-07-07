package sn.tnt.gestionmonitoring.gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import sn.tnt.gestionmonitoring.service.IServiceActeurImpl;
import sn.tnt.gestionmonitoring.utils.CrypterPassword;

import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JPasswordField;
public class FenAuthentification extends JFrame{

	private JPanel contentPane;
	private JTextField txtVeuillezVousAuthentifier;
	private JTextField textLogin;
	private JPasswordField textPassword;
	private String passwordCrypter;
	
	private IServiceActeurImpl iserviceActeur ;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FenAuthentification frame = new FenAuthentification();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public FenAuthentification() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(contentPane);
		
		txtVeuillezVousAuthentifier = new JTextField();
		txtVeuillezVousAuthentifier.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 12));
		txtVeuillezVousAuthentifier.setHorizontalAlignment(SwingConstants.CENTER);
		txtVeuillezVousAuthentifier.setText("Veuillez vous authentifier SVP !!!");
		txtVeuillezVousAuthentifier.setBounds(65, 30, 309, 29);
		contentPane.add(txtVeuillezVousAuthentifier);
		txtVeuillezVousAuthentifier.setColumns(10);
		
		JLabel labelLogin = new JLabel("Login");
		labelLogin.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 12));
		labelLogin.setBounds(27, 104, 73, 15);
		contentPane.add(labelLogin);
		
		iserviceActeur = new IServiceActeurImpl();
		
		textLogin = new JTextField();
		textLogin.setBounds(182, 102, 114, 19);
		contentPane.add(textLogin);
		textLogin.setColumns(10);
		
		
		JLabel labelPassword = new JLabel("Password");
		labelPassword.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 12));
		labelPassword.setBounds(27, 175, 70, 15);
		contentPane.add(labelPassword);
		
		JButton boutonConnecter = new JButton("Connecter");
		boutonConnecter.setForeground(Color.BLUE);
		boutonConnecter.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 12));
		boutonConnecter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				String textecrit = textLogin.getText();
//				textPassword.setText(textecrit);
//				textLogin.setText("");
				
				if (e.getSource()==boutonConnecter) {
					
					boolean isconnect = false;
					String loginSaisie = textLogin.getText();
					String passwordSaisie = textPassword.getText();
					passwordCrypter = CrypterPassword.chiffrage(passwordSaisie);
					isconnect = iserviceActeur.connect(loginSaisie, passwordCrypter);
					
					if (isconnect==true) {
						
						//JOptionPane.showMessageDialog(null, "Authentification reussie !!!");
						
						
						FenPrincipale principal = new FenPrincipale();
						principal.setVisible(true);
						dispose();
						 
					}else{
						JOptionPane.showMessageDialog(txtVeuillezVousAuthentifier, "Login ou mot de passe incorrecte !!!");
					}
					
					
					
					
				} 
					
				
					
					

				
				
				
			}
		});
		boutonConnecter.setBounds(12, 241, 117, 25);
		contentPane.add(boutonConnecter);
		
		JButton boutonQuitter = new JButton("Quitter");
		boutonQuitter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		boutonQuitter.setForeground(Color.BLUE);
		boutonQuitter.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 12));
		boutonQuitter.setBounds(165, 241, 117, 25);
		contentPane.add(boutonQuitter);
		
		textPassword = new JPasswordField();
		textPassword.setBounds(182, 173, 118, 19);
		contentPane.add(textPassword);
		
		JButton btnAnnuler = new JButton("Annuler");
		btnAnnuler.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textLogin.setText("");
				textPassword.setText("");
			}
		});
		btnAnnuler.setForeground(Color.BLUE);
		btnAnnuler.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 12));
		btnAnnuler.setBounds(321, 241, 117, 25);
		contentPane.add(btnAnnuler);
		
		textPassword.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode()==KeyEvent.VK_ENTER) {
					boolean isconnect = false;
					String loginSaisie = textLogin.getText();
					String passwordSaisie = textPassword.getText();
					passwordCrypter = CrypterPassword.chiffrage(passwordSaisie);
					isconnect = iserviceActeur.connect(loginSaisie, passwordCrypter);
					
					if (isconnect==true) {
						
						//JOptionPane.showMessageDialog(null, "Authentification reussie !!!");
						
						
						FenPrincipale principal = new FenPrincipale();
						principal.setVisible(true);
						dispose();
						 
					}else{
						JOptionPane.showMessageDialog(txtVeuillezVousAuthentifier, "Login ou mot de passe incorrecte !!!");
					}
					
					
					
					
				}
				
			}
		});
	}

	
		
		
	
}
