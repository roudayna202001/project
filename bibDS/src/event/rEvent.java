package event;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class rEvent implements ActionListener {
		private nvauteur nvaut;
		
	public rEvent(nvauteur nvaut) {
			super();
			this.nvaut = nvaut;
		}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		nvaut.dispose();

	}

}
