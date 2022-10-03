package event;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import dao.crudFilm;
import fenetre.film;



public class ajoutFilm implements ActionListener {
private nvfilm nf ;


	public ajoutFilm(nvfilm nf) {
	super();
	this.nf = nf;
}


	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
			// TODO Auto-generated method stub
			crudFilm cf=new crudFilm();
			try{
				
		
				int annee=Integer.parseInt(nf.getAnnetext().getText());
				
				film f=new film(nf.getNomText().getText(),nf.getComboBox().getSelectedItem().toString(),annee);
				
				//cl.addLivre(l);
				cf.addLivre(f);
				
				

			}catch(Exception e) {
				 JOptionPane.showMessageDialog(null,e.getMessage(),"erreur",JOptionPane.ERROR_MESSAGE);
			   		   	//nv.getAlllivre();
		}
		}
	}


