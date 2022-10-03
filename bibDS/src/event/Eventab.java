package event;

import java.awt.event.MouseEvent;



import java.awt.event.MouseListener;

public class Eventab implements MouseListener {
	
	private nvlivre nl;
	

	public Eventab(nvlivre nl) {
		super();
		this.nl = nl;
	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
		try{
			int i=nl.getTab().getSelectedRow();
			int id= (int) nl.getTab().getModel().getValueAt(i, 0);
			String titre=(String) nl.getTab().getModel().getValueAt(i, 1);
			String langue=(String) nl.getTab().getModel().getValueAt(i, 2);
			int nbp= (int) nl.getTab().getModel().getValueAt(i, 3);
			nl.getIdtext().setText(String.valueOf(id));
			//nl.getIdtext().setText(id);
			nl.getTitretext().setText(titre);
			nl.getLngtext().setText(langue);
			nl.getNbptext().setText(String.valueOf(nbp));
			//nl.getNbptext().setText(nbpage);
			nl.getAllLivres();
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
		
		
		
		
		

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
