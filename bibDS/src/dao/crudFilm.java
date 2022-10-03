package dao;

import java.sql.Connection;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import com.mysql.jdbc.PreparedStatement;

import fenetre.film;
import dao.connect;
public class crudFilm {

	public void addLivre( film f) {
		// TODO Auto-generated method stub
		Connection conn =connect.getConnexion();
		try{
			
			PreparedStatement ps= (PreparedStatement) conn.prepareStatement("insert into film values(?,?,?);");
			
			
			ps.setString(1, f.getNom());
			ps.setString(2, f.getGenre());
			ps.setInt(3, f.getAnnee());
			//ps.setInt(1, f.getId());
			
			ps.executeUpdate();
			ps.close();
			JOptionPane.showMessageDialog(null, "insertion éffectuée avec succés");
			
		
		}
		catch(SQLException e){
			JOptionPane.showConfirmDialog(null, e.getMessage(), "erreur", JOptionPane.ERROR_MESSAGE);
		}

	}
}
