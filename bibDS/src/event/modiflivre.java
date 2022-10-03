package event;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import dao.crudlivree;
import fenetre.livre;

public class modiflivre implements ActionListener {
	private nvlivre nv;
	

	public modiflivre(nvlivre nv) {
		super();
		this.nv = nv;
	}


	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		// TODO Auto-generated method stub
		
		crudlivree cl =new crudlivree();
		if(JOptionPane.showConfirmDialog(nv, "voulez vous confirmer la modification?","Modification",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION)

{			int id=Integer.parseInt(nv.getIdtext().getText());
				int nb=Integer.parseInt(nv.getNbptext().getText());
					//livre l =new livre(id,nv.getTitretext().getText(),nv.getLngtext().getText(),nb);
			
							cl.UpdateLivre(id,nv.getTitretext().getText(),nv.getLngtext().getText(),nb);
		
			nv.getAllLivres();
			
	
	
}
	}

}
