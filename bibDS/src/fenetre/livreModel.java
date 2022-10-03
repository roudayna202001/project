package fenetre;

import java.util.List;

import java.util.Vector;

import javax.swing.table.AbstractTableModel;

public class livreModel extends AbstractTableModel {
private String[] col =new String[]{"id","titre ","langue","nbpage"};
private Vector <String[]> ligne=new Vector<String[]>();
	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return col.length;
	}

	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		return ligne.size();
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		// TODO Auto-generated method stub
		return ligne.get(rowIndex)[columnIndex];
	}
	public String getColumnName(int columnIndex){
		return col[columnIndex];
	}
	public void loadData(List<livre> liv){
		ligne=new Vector<String[]>();
		for(livre l:liv)
			ligne.add(new String[]{String.valueOf(l.getId()),String.valueOf(l.getNbpage()),l.getLangue(),l.getTitre() });
			fireTableChanged(null);
		
	}

}
