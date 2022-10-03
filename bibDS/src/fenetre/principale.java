package fenetre;
import java.awt.BorderLayout;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import event.EvenLivre;
import event.Evenprincauteur;
import javax.swing.ImageIcon;

public class principale extends JFrame  {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					principale frame = new principale();
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
	public principale() {
		setTitle("BIBfsegn");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setForeground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lab = new JLabel("  BIBFsegn");
		lab.setForeground(new Color(244, 164, 96));
		lab.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lab.setBounds(132, 11, 133, 33);
		contentPane.add(lab);
		
		JButton btnauteur = new JButton("Auteur");
		btnauteur.setForeground(new Color(184, 134, 11));
		btnauteur.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnauteur.setBounds(314, 80, 89, 23);
		contentPane.add(btnauteur);
		
		Evenprincauteur ev=new Evenprincauteur(); 
		btnauteur.addActionListener(ev);
		
			
		
		JButton btnlivre = new JButton("  Livre");
		btnlivre.setForeground(new Color(184, 134, 11));
		btnlivre.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnlivre.setBounds(314, 164, 89, 23);
		contentPane.add(btnlivre);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\DELL\\Downloads\\img.jpg"));
		lblNewLabel.setBounds(10, 67, 294, 183);
		contentPane.add(lblNewLabel);
		EvenLivre liv=new EvenLivre();
		btnlivre.addActionListener(liv);
	}
}
