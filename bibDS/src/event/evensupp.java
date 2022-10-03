package event;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import dao.crudlivree;
//import event.Eventab;

public class evensupp implements ActionListener {
	private nvlivre nv;
	public evensupp (nvlivre nv){
		super();
		this.nv=nv;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		//int l = nv.getTab().getSelectedRowCount();
		int i= nv.getTab().getSelectedRow();
		int id =Integer.valueOf(nv.getIdtext().getText()) ;
		
		
		if(JOptionPane.showConfirmDialog(nv, "voulez vous vraiment supprimer ce livre?","validation de supprission",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION)
				{
			
			

			crudlivree cc=new crudlivree();
			cc.deletLivre(id);
			nv.getAllLivres();
		}
		
		
			
		

	}

}
