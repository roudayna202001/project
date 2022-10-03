package dao;

import java.sql.*;

import javax.swing.JOptionPane;

public class connect {
	
		private static Connection connexion;
		static{
			try{
				Class.forName("com.mysql.jdbc.Driver");
				
				connexion=DriverManager.getConnection("jdbc:mysql://localhost:3306/gestion_de_bib","root","");
				
				JOptionPane.showMessageDialog(null, "connexion établie", "connexion",JOptionPane.INFORMATION_MESSAGE );
				
				
			}catch(Exception e){
				JOptionPane.showMessageDialog(null, e.getMessage(), "erreur de connexion",JOptionPane.ERROR_MESSAGE);
				
			}
			
		
		}
		public static Connection getConnexion() {
			return connexion;
		}
		
		
		
	

}
