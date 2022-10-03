package event;
import dao.connect;


import dao.crudlivree;

import fenetre.livre;
//import fenetre.livreModel;
//import fenetre.livreModel;
import net.proteanit.sql.DbUtils;

import java.awt.BorderLayout;
import fenetre.livreModel;
import java.awt.EventQueue;
import event.Eventab;


import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;

//import event.EvenAjoutLivre;

import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.util.ArrayList;
import java.util.List;
import java.util.ArrayList;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;

import com.mysql.jdbc.PreparedStatement;

import java.awt.ScrollPane;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.border.TitledBorder;

public class nvlivre extends JFrame {
	private List<livre> livres=new ArrayList<livre>();
	private JPanel contentPane;
	private JTextField idtext;
	private JTextField titretext;
	private JTextField lngtext;
	private JTextField nbptext;
	//private JTable tabe;
	private livreModel lm;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					nvlivre frame = new nvlivre();
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
	
	public nvlivre() {
		super();
		setTitle("livre");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		//setVisible(true);
		
		JLabel lblNewLabel = new JLabel("Gestion de Livre");
		lblNewLabel.setForeground(Color.MAGENTA);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(126, 11, 132, 31);
		contentPane.add(lblNewLabel);
		
		JLabel idlab = new JLabel("id");
		idlab.setForeground(Color.MAGENTA);
		idlab.setFont(new Font("Tahoma", Font.PLAIN, 16));
		idlab.setBounds(22, 56, 46, 14);
		contentPane.add(idlab);
		
		JLabel titrelabel = new JLabel("titre");
		titrelabel.setForeground(Color.MAGENTA);
		titrelabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		titrelabel.setBounds(10, 81, 46, 14);
		contentPane.add(titrelabel);
		
		JLabel lnglabel = new JLabel("Langue");
		lnglabel.setForeground(Color.MAGENTA);
		lnglabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lnglabel.setBounds(10, 106, 67, 32);
		contentPane.add(lnglabel);
		
		JLabel nbplabel = new JLabel("Nombre de page");
		nbplabel.setForeground(Color.MAGENTA);
		nbplabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		nbplabel.setBounds(0, 140, 132, 14);
		contentPane.add(nbplabel);
		
		idtext = new JTextField();
		idtext.setBounds(78, 53, 86, 20);
		contentPane.add(idtext);
		idtext.setColumns(10);
		
		titretext = new JTextField();
		titretext.setBounds(66, 80, 86, 20);
		contentPane.add(titretext);
		titretext.setColumns(10);
		
		lngtext = new JTextField();
		lngtext.setBounds(87, 114, 86, 20);
		contentPane.add(lngtext);
		lngtext.setColumns(10);
		
		nbptext = new JTextField();
		nbptext.setBounds(126, 139, 86, 20);
		contentPane.add(nbptext);
		nbptext.setColumns(10);
		
		JButton ajbtn = new JButton("Ajout");
		ajbtn.setForeground(Color.MAGENTA);
		ajbtn.setFont(new Font("Tahoma", Font.PLAIN, 14));
		ajbtn.setBounds(250, 53, 89, 23);
		contentPane.add(ajbtn);
		//EvenAjoutLivre aj=new EvenAjoutLivre(this);
		//ajbtn.addActionListener(aj);
		EVenAjoutLivre aj=new EVenAjoutLivre(this);
		ajbtn.addActionListener(aj);
		
		
		
		JButton modfbtn = new JButton("Modifier");
		modfbtn.setForeground(Color.MAGENTA);
		modfbtn.setFont(new Font("Tahoma", Font.PLAIN, 14));
		modfbtn.setBounds(250, 87, 89, 23);
		contentPane.add(modfbtn);
		modiflivre m =new modiflivre(this);
		modfbtn.addActionListener(m);
		JButton suppbtn = new JButton("Supprimer");
		suppbtn.setForeground(Color.MAGENTA);
		suppbtn.setFont(new Font("Tahoma", Font.PLAIN, 14));
		suppbtn.setBounds(250, 114, 118, 23);
		contentPane.add(suppbtn);
		evensupp ev=new evensupp(this);
		suppbtn.addActionListener(ev);
		
	
		
		
		
		
		//table=new JTable(lm);
		
		
		
		//lm=new livreModel();
		JScrollPane scroll = new JScrollPane();
		scroll.setViewportBorder(new LineBorder(new Color(0, 0, 0)));
		scroll.setBounds(10, 167, 414, 83);
		contentPane.add(scroll);
		
		table = new JTable();
		scroll.setViewportView(table);
		
		JButton rtourbtn = new JButton("Retour");
		rtourbtn.setBounds(345, 17, 89, 23);
		contentPane.add(rtourbtn);
		retourEvent rv=new retourEvent(this);
		rtourbtn.addActionListener(rv);
		
		
		
		this.getAllLivres();
		crudlivree cl =new crudlivree();
		//List<livre>liv=cl.getAllLivres();
		
			//lm.loadData(cl.getAllLivres());
			
		//JScrollPane scrollPane=new JScrollPane();
		Eventab et =new Eventab(this);
		table.addMouseListener(et);
		
	}

	public List<livre> getLivres() {
		return livres;
	}

	public void setLivres(List<livre> livres) {
		this.livres = livres;
	}

	public JTextField getIdtext() {
		return idtext;
	}

	public void setIdtext(JTextField idtext) {
		this.idtext = idtext;
	}

	public JTextField getTitretext() {
		return titretext;
	}

	public void setTitretext(JTextField titretext) {
		this.titretext = titretext;
	}

	public JTextField getLngtext() {
		return lngtext;
	}

	public void setLngtext(JTextField lngtext) {
		this.lngtext = lngtext;
	}

	public JTextField getNbptext() {
		return nbptext;
	}

	public void setNbptext(JTextField nbptext) {
		this.nbptext = nbptext;
	}

	

	public livreModel getLm() {
		return lm;
	}

	public void setLm(livreModel lm) {
		this.lm = lm;
	}

	public JTable getTab() {
		return table;
	}

	public void setTab(JTable table) {
		this.table = table;
	}
	public List<livre> getAllLivres() {
		// TODO Auto-generated method stub
		Connection conn =connect.getConnexion();
		List<livre> liv=new ArrayList<livre>();
		try{
			PreparedStatement ps= (PreparedStatement) conn.prepareStatement("select id,titre,langue,nbpage from livre;");
			ResultSet rs=ps.executeQuery();
			
			table.setModel(DbUtils.resultSetToTableModel(rs));
			/*while(rs.next()){
				livre l =new livre();
				l.setId(rs.getInt("id"));
				l.setTitre(rs.getString("titre"));
				l.setLangue(rs.getString("langue"));
				l.setNbpage(rs.getInt(rs.getInt("nbpage")));
				
				liv.add(l);
				
			}*/
			
		}catch(SQLException e) {
			JOptionPane.showMessageDialog(null, e.getMessage(),"Erreur",JOptionPane.ERROR_MESSAGE);
			
		}
		return liv;
		
		
	}
}


