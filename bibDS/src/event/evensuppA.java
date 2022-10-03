package event;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import dao.crudAuteur;
import dao.crudlivree;

public class evensuppA implements ActionListener {
	private nvauteur n;
	

	public evensuppA(nvauteur n) {
		super();
		this.n = n;
	}


	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
		int i= n.getTable().getSelectedRow();
		int ida =Integer.valueOf(n.getIdtext().getText());
		
		
		if(JOptionPane.showConfirmDialog(n, "voulez vous vraiment supprimer cet auteur?","validation de supprission",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION)
				{
			
			

			crudAuteur cc=new crudAuteur();
			cc.deleAuteur(ida);
			n.getAllAuteurs();
		}
		

	}

}
