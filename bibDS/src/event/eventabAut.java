package event;

import java.awt.event.MouseEvent;

import java.awt.event.MouseListener;

public class eventabAut implements MouseListener {
	private nvauteur nva;
	

	public eventabAut(nvauteur nva) {
		super();
		this.nva = nva;
	}


	@Override
	public void mouseClicked(MouseEvent arg0) {
		
		try{
			int i=nva.getTable().getSelectedRow();
			int id= (int) nva.getTable().getModel().getValueAt(i, 0);
			String nom=(String) nva.getTable().getModel().getValueAt(i, 1);
			String prenom=(String) nva.getTable().getModel().getValueAt(i, 2);
			String natio= (String) nva.getTable().getModel().getValueAt(i, 3);
			nva.getIdtext().setText(String.valueOf(id));
			//nl.getIdtext().setText(id);
			nva.getNomtext().setText(nom);
			nva.getPrenomtext().setText(prenom);
			nva.getNatiotext().setText(natio);
			//nl.getNbptext().setText(nbpage);
			nva.getAllAuteurs();
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
		
		
		
		
		// TODO Auto-generated method stub

	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

}
