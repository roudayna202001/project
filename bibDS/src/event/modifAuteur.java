package event;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import dao.crudAuteur;
//import dao.crudlivree;

public class modifAuteur implements ActionListener {
private	nvauteur auteur;


	public modifAuteur(nvauteur auteur) {
	super();
	this.auteur = auteur;
}


	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		crudAuteur cl =new crudAuteur();
		if(JOptionPane.showConfirmDialog(auteur, "voulez vous confirmer la modification?","Modification",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION)

{			
			int ida=Integer.parseInt(auteur.getIdtext().getText());
				//int nb=Integer.parseInt(auteur.getNbptext().getText());
					//livre l =new livre(id,nv.getTitretext().getText(),nv.getLngtext().getText(),nb);
			
							cl.UpdateAuteur(ida,auteur.getNomtext().getText(),auteur.getPrenomtext().getText(),auteur.getNatiotext().getText());
		
			auteur.getAllAuteurs();
			
	
	

}

	}

}
