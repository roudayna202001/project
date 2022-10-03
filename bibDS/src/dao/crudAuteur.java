package dao;
import java.sql.Connection;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import com.mysql.jdbc.PreparedStatement;

import dao.connect;
import fenetre.auteur;
import fenetre.livre;

public class crudAuteur {
	
	
	
	public void addAuteur(auteur a) {
		// TODO Auto-generated method stub
		Connection conn =connect.getConnexion();
		try{
			
			PreparedStatement ps= (PreparedStatement) conn.prepareStatement("insert into auteur values(?,?,?,?);");
			
			ps.setInt(1, a.getIdA());
			ps.setString(2,a.getNom());
			ps.setString(3,a.getPrenom());
			ps.setString(4, a.getNatio());
			
			ps.executeUpdate();
			ps.close();
			JOptionPane.showMessageDialog(null, "insertion éffectuée avec succés");
			
		
		}
		catch(SQLException e){
			JOptionPane.showConfirmDialog(null, e.getMessage(), "erreur", JOptionPane.ERROR_MESSAGE);
		}

	}

	
	
	public void deleAuteur(int id) {
		// TODO Auto-generated method stub
		Connection conn =connect.getConnexion();
		try{
			PreparedStatement ps= (PreparedStatement) conn.prepareStatement(" DELETE from auteur  where id=?;");
			ps.setInt(1, id);
			ps.executeUpdate();
			ps.close();
			JOptionPane.showMessageDialog(null, "suppression effectué avec succé");
		}catch(SQLException e){
			JOptionPane.showMessageDialog(null, e.getMessage());
		}

	}
	public void UpdateAuteur(int id, String nom,String prenom,String natio) {
		// TODO Auto-generated method stub
		Connection conn =connect.getConnexion();
try{
	//table.setModel(DbUtils.resultSetToTableModel(rs));
	PreparedStatement ps= (PreparedStatement) conn.prepareStatement("update auteur set nom=?, prenom=?, natio=? where id=?;");
	
	ps.setString(1, nom);
	ps.setString(2, prenom);
	ps.setString(3, natio);
	ps.setInt(4, id);
	ps.executeUpdate();
	JOptionPane.showMessageDialog(null, "modification effectuéee avec succés","Modification",JOptionPane.INFORMATION_MESSAGE);
	
}catch(SQLException e){
	JOptionPane.showMessageDialog(null, e.getMessage(), "errur", JOptionPane.ERROR_MESSAGE);
}
		

	}

	
	

}
