package event;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import dao.connect;

public class Evenprincauteur implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		nvauteur aut=new nvauteur();
		aut.setVisible(true);
		connect.getConnexion();
	

	}

}
