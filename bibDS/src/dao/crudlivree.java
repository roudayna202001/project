package dao;

import java.sql.Connection;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import javax.swing.JOptionPane;

import com.mysql.jdbc.PreparedStatement;

import fenetre.livre;
import fenetre.livreModel;
import net.proteanit.sql.DbUtils;

public class crudlivree implements lCrud {

	@Override
	public void addLivre(livre l) {
		// TODO Auto-generated method stub
		Connection conn =connect.getConnexion();
		try{
			
			PreparedStatement ps= (PreparedStatement) conn.prepareStatement("insert into livre values(?,?,?,?);");
			
			ps.setInt(1, l.getId());
			ps.setString(2, l.getTitre());
			ps.setString(3, l.getLangue());
			ps.setInt(4, l.getNbpage());
			
			ps.executeUpdate();
			ps.close();
			JOptionPane.showMessageDialog(null, "insertion éffectuée avec succés");
			
		
		}
		catch(SQLException e){
			JOptionPane.showConfirmDialog(null, e.getMessage(), "erreur", JOptionPane.ERROR_MESSAGE);
		}

	}

	@Override
	public void UpdateLivre(int id, String titre,String langue,int nbpage) {
		// TODO Auto-generated method stub
		Connection conn =connect.getConnexion();
try{
	//table.setModel(DbUtils.resultSetToTableModel(rs));
	PreparedStatement ps= (PreparedStatement) conn.prepareStatement("update livre set   titre=?,langue=?, nbpage=? where id=?;");
	
	ps.setString(1, titre);
	ps.setString(2, langue);
	ps.setInt(3, nbpage);
	ps.setInt(4, id);
	ps.executeUpdate();
	JOptionPane.showMessageDialog(null, "modification effectuéee avec succés","Modification",JOptionPane.INFORMATION_MESSAGE);
	
}catch(SQLException e){
	JOptionPane.showMessageDialog(null, e.getMessage(), "errur", JOptionPane.ERROR_MESSAGE);
}
		

	}

	

	@Override
	public void deletLivre(int id) {
		// TODO Auto-generated method stub
		Connection conn =connect.getConnexion();
		try{
			PreparedStatement ps= (PreparedStatement) conn.prepareStatement(" DELETE from livre  where id=?;");
			ps.setInt(1, id);
			ps.executeUpdate();
			ps.close();
			JOptionPane.showMessageDialog(null, "suppression effectué avec succé");
		}catch(SQLException e){
			JOptionPane.showMessageDialog(null, e.getMessage());
		}

	}

	
	

	
}
