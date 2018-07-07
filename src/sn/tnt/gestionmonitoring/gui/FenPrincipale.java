package sn.tnt.gestionmonitoring.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import java.awt.GridBagConstraints;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.ImageIcon;

public class FenPrincipale extends JFrame {

	private JPanel contentPane;
	private JPanel panelCentre;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FenPrincipale frame = new FenPrincipale();
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
	public FenPrincipale() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 655, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		
		JPanel panelNord = new JPanel();
		panelNord.setBorder(new LineBorder(new Color(119, 136, 153)));
		panelNord.setBounds(12, 23, 778, 22);
		contentPane.add(panelNord);
		panelNord.setLayout(null);
		
		JLabel lblLogo = new JLabel("LOGO");
		lblLogo.setBounds(0, 0, 40, 22);
		panelNord.add(lblLogo);
		
		JLabel lblBienvenueANotre = new JLabel("BIENVENUE A NOTRE APPLICATION BANCAIRE");
		lblBienvenueANotre.setBounds(222, 4, 326, 15);
		panelNord.add(lblBienvenueANotre);
		
		JPanel panelEst = new JPanel();
		panelEst.setBorder(new LineBorder(new Color(119, 136, 153)));
		panelEst.setBounds(12, 45, 98, 326);
		contentPane.add(panelEst);
		panelEst.setLayout(new GridLayout(0, 1, 7, 0));
		
		JButton btnVirement = new JButton("Virement");
		btnVirement.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		
		JButton btnAcceuil = new JButton("Acceuil");
		btnAcceuil.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				panelCentre.removeAll();
				FenPrincipale fenPrincipale = new FenPrincipale();
				panelCentre.add(fenPrincipale.panelCentre);
				contentPane.validate();
	
				
				
			}
		});
		panelEst.add(btnAcceuil);
		
		panelCentre = new JPanel();
		
		JButton btnEmploye = new JButton("Employe");
		btnEmploye.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// Suppression du contenu du panel centre
				panelCentre.removeAll();
				PanelMonitChainatinal panelEmploye = new PanelMonitChainatinal();
				panelCentre.add(panelEmploye, BorderLayout.CENTER);
				contentPane.validate();
				
			}
		});
		panelEst.add(btnEmploye);
		
		JButton btnClient = new JButton("Client");
		panelEst.add(btnClient);
		
		JButton btnCompte = new JButton("Compte");
		btnCompte.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
			}
		});
		panelEst.add(btnCompte);
		
		JButton btnRetrait = new JButton("Retrait");
		panelEst.add(btnRetrait);
		
		JButton btnDepot = new JButton("Depot");
		panelEst.add(btnDepot);
		panelEst.add(btnVirement);
		
		JPanel panelSud = new JPanel();
		panelSud.setBorder(new LineBorder(new Color(119, 136, 153)));
		panelSud.setBounds(12, 371, 778, 17);
		contentPane.add(panelSud);
		panelSud.setLayout(null);
		
		JLabel lblCopyrightObjis = new JLabel("Copyright @ Objis Promo 3 2017");
		lblCopyrightObjis.setBounds(283, 0, 251, 15);
		panelSud.add(lblCopyrightObjis);
		
		
		panelCentre.setBorder(new LineBorder(new Color(119, 136, 153)));
		panelCentre.setBounds(110, 45, 596, 326);
		contentPane.add(panelCentre);
		panelCentre.setLayout(new BorderLayout(0, 0));
		
		JLabel labelimage = new JLabel("");
		labelimage.setIcon(new ImageIcon("/home/diawara/Formation_Objis/GestionBanque/photos/WALLPA47.JPG"));
		labelimage.setBounds(1, 0, 439, 326);
		panelCentre.add(labelimage);
	}
}
