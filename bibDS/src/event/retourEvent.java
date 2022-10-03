package event;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class retourEvent implements ActionListener {
	private nvlivre livre;
	

	public retourEvent(nvlivre livre) {
		super();
		this.livre = livre;
	}


	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
		livre.dispose();
	}

}
