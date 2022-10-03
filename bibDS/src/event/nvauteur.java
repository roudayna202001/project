package event;

import java.awt.BorderLayout;


import java.awt.EventQueue;
import net.proteanit.sql.DbUtils;

import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import com.mysql.jdbc.PreparedStatement;

import dao.connect;
import dao.crudAuteur;
import dao.crudlivree;
import fenetre.auteur;
import fenetre.livre;
import net.proteanit.sql.DbUtils;

import java.awt.Window.Type;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class nvauteur extends JFrame {
	private List<auteur> auteurs=new ArrayList<auteur>();

	private JPanel contentPane;
	private JTextField idtexte;
	private JTextField nomtext;
	private JTextField prenomtext;
	private JTextField natiotext;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					nvauteur frame = new nvauteur();
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
	public nvauteur() {
		//setType(Type.UTILITY);
		setTitle("Auteur");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		this.setVisible(true);
		
		JLabel labetaut = new JLabel("Gestion d'auteur");
		labetaut.setForeground(Color.MAGENTA);
		labetaut.setFont(new Font("Tahoma", Font.PLAIN, 17));
		labetaut.setBounds(179, 11, 159, 21);
		contentPane.add(labetaut);
		
		JLabel lblNewLabel = new JLabel("id");
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(10, 63, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel(" Nom");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_1.setBounds(10, 88, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Pr\u00E9nom");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_2.setBounds(10, 113, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_4 = new JLabel("Nationalit\u00E9");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_4.setBounds(10, 138, 66, 14);
		contentPane.add(lblNewLabel_4);
		
		idtexte= new JTextField();
		idtexte.setBounds(66, 62, 86, 20);
		contentPane.add(idtexte);
		idtexte.setColumns(10);
		
		nomtext = new JTextField();
		nomtext.setBounds(66, 86, 86, 20);
		contentPane.add(nomtext);
		nomtext.setColumns(10);
		
		prenomtext = new JTextField();
		prenomtext.setBounds(66, 111, 86, 20);
		contentPane.add(prenomtext);
		prenomtext.setColumns(10);
		
		natiotext = new JTextField();
		natiotext.setBounds(76, 136, 86, 20);
		contentPane.add(natiotext);
		natiotext.setColumns(10);
		
		JButton ajoutbtn = new JButton("Ajout");
		ajoutbtn.setForeground(Color.MAGENTA);
		ajoutbtn.setFont(new Font("Tahoma", Font.PLAIN, 14));
		ajoutbtn.setBounds(272, 78, 89, 23);
		contentPane.add(ajoutbtn);
		EvenajoutAut e = new EvenajoutAut (this);
		ajoutbtn.addActionListener(e);
		
		
		JButton modifbtn = new JButton("Modifier");
		modifbtn.setFont(new Font("Tahoma", Font.PLAIN, 14));
		modifbtn.setForeground(Color.MAGENTA);
		modifbtn.setBounds(282, 108, 89, 23);
		contentPane.add(modifbtn);
		modifAuteur ma=new modifAuteur(this);
		modifbtn.addActionListener(ma);
		
		JButton suppbtn = new JButton("Supprimer");
		suppbtn.setFont(new Font("Tahoma", Font.PLAIN, 14));
		suppbtn.setForeground(Color.MAGENTA);
		suppbtn.setBounds(274, 138, 122, 23);
		contentPane.add(suppbtn);
		evensuppA sa =new evensuppA(this);
		suppbtn.addActionListener(sa);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 167, 414, 83);
		contentPane.add(scrollPane);
		crudAuteur a =new crudAuteur();
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		JButton rbtn = new JButton("Retour");
		rbtn.setFont(new Font("Trebuchet MS", Font.BOLD, 11));
		rbtn.setForeground(Color.RED);
		rEvent r=new rEvent(this);
		rbtn.addActionListener(r);
		rbtn.setBounds(345, 44, 89, 23);
		contentPane.add(rbtn);
		eventabAut av =new eventabAut(this);
		table.addMouseListener(av);
		this.getAllAuteurs();
		
		
	}

	public JTextField getIdtext() {
		return idtexte;
	}

	public void setIdtext(JTextField idtext) {
		this.idtexte = idtext;
	}

	public JTextField getNomtext() {
		return nomtext;
	}

	public void setNomtext(JTextField nomtext) {
		this.nomtext = nomtext;
	}

	public JTextField getPrenomtext() {
		return prenomtext;
	}

	public void setPrenomtext(JTextField prenomtext) {
		this.prenomtext = prenomtext;
	}

	public JTextField getNatiotext() {
		return natiotext;
	}

	public void setNatiotext(JTextField natiotext) {
		this.natiotext = natiotext;
	}
	
	public List<auteur> getAuteurs() {
		return auteurs;
	}

	public void setAuteurs(List<auteur> auteurs) {
		this.auteurs = auteurs;
	}

	public JTable getTable() {
		return table;
	}

	public void setTable(JTable table) {
		this.table = table;
	}

	public  List<auteur> getAllAuteurs() {
		// TODO Auto-generated method stub
		Connection conn =connect.getConnexion();
		List<auteur> aut=new ArrayList<auteur>();
		try{
			PreparedStatement ps= (PreparedStatement) conn.prepareStatement("select * from auteur;");
			ResultSet r=ps.executeQuery();
			
			//table.setModel(DbUtils.resultSetToTableModel(rs));
			table.setModel(DbUtils.resultSetToTableModel(r));
			
			
		}catch(SQLException e) {
			JOptionPane.showMessageDialog(null, e.getMessage(),"Erreur",JOptionPane.ERROR_MESSAGE);
			
		}
		return aut;
		
		
	}


}
