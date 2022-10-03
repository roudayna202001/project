package event;

import java.awt.BorderLayout;
import dao.connect;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import dao.crudFilm;
public class nvfilm extends JFrame {

	private JPanel contentPane;
	private JTextField nomText;
	private JTextField annetext;
	private JComboBox comboBox;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					nvfilm frame = new nvfilm();
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
	public nvfilm() {
		setTitle("Gestion Film");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nom du film:");
		lblNewLabel.setBounds(46, 60, 77, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Genre de film:");
		lblNewLabel_1.setBounds(57, 106, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Ann\u00E9e de production:");
		lblNewLabel_2.setBounds(57, 184, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		nomText = new JTextField();
		nomText.setBounds(189, 57, 86, 20);
		contentPane.add(nomText);
		nomText.setColumns(10);
		
		annetext = new JTextField();
		annetext.setBounds(189, 181, 86, 20);
		contentPane.add(annetext);
		annetext.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"com\u00E9die ", "trag\u00E9die", "horreur", "romance"}));
		comboBox.setBounds(177, 103, 133, 20);
		contentPane.add(comboBox);
		
		JButton btnNewButton = new JButton("Ins\u00E9rer");
		btnNewButton.setBounds(121, 227, 89, 23);
		contentPane.add(btnNewButton);
		ajoutFilm aj=new ajoutFilm(this);
		btnNewButton.addActionListener(aj);
		
	}

	public JTextField getNomText() {
		return nomText;
	}

	public void setNomText(JTextField nomText) {
		this.nomText = nomText;
	}

	public JTextField getAnnetext() {
		return annetext;
	}

	public void setAnnetext(JTextField annetext) {
		this.annetext = annetext;
	}

	public JComboBox getComboBox() {
		return comboBox;
	}

	public void setComboBox(JComboBox comboBox) {
		this.comboBox = comboBox;
	}
	
	
}
