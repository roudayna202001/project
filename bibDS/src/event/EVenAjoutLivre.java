package event;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import dao.crudlivree;
import fenetre.livre;

public class EVenAjoutLivre implements ActionListener {
	private nvlivre nv;

	public EVenAjoutLivre(nvlivre nv) {
		super();
		this.nv = nv;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		/*cours c =new cours(ac.getId().getText(),ac.getTnom().getText(),ac.getTcoef().getText(),ac.getTdept().getText(),ac.getToption().getText());
			m.addCours(c);
			ac.getAllcour();*/
		crudlivree cl =new crudlivree();
		try{
			int id=Integer.parseInt(nv.getIdtext().getText());
			int nb=Integer.parseInt(nv.getNbptext().getText());
			livre l =new livre(id,nv.getTitretext().getText(),nv.getLngtext().getText(),nb);
			cl.addLivre(l);
			//nv. getAllLivres();
			nv.getAllLivres();
			

		}catch(Exception e) {
			 JOptionPane.showMessageDialog(null,e.getMessage(),"erreur",JOptionPane.ERROR_MESSAGE);
		   		   	//nv.getAlllivre();
	}
	}
}


