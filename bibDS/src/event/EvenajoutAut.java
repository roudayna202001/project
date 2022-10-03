package event;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import dao.crudAuteur;
import dao.crudlivree;
import fenetre.auteur;
import fenetre.livre;

public class EvenajoutAut implements ActionListener {
  private nvauteur na;
  
	public EvenajoutAut(nvauteur na) {
	super();
	this.na = na;
}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		crudAuteur ca =new crudAuteur();
		try{
			int id=Integer.parseInt(na.getIdtext().getText());
	//int nb=Integer.parseInt(nv.getNbptext().getText());
			auteur a =new auteur(id,na.getNomtext().getText(),na.getPrenomtext().getText(),na.getNatiotext().getText());
			
			//cl.addLivre(l);
			ca.addAuteur(a);
			//nv. getAllLivres();
			//nv.getAllLivres();
			na.getAllAuteurs();
			

		}catch(Exception e) {
			 JOptionPane.showMessageDialog(null,e.getMessage(),"erreur",JOptionPane.ERROR_MESSAGE);
		   		   	//nv.getAlllivre();
	}
	}

	}


