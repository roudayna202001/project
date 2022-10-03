package event;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import dao.connect;

public class EvenLivre implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent arg0) {
		nvlivre liv=new nvlivre();
		liv.setVisible(true);
		//connect.getConnexion();
		// TODO Auto-generated method stub

	}

}
