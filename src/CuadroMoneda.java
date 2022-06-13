import javax.swing.JOptionPane;

import util.ExcepcionCancel;

public class CuadroMoneda extends CuadroDialogo {

	public CuadroMoneda() {
		super();
	    map.put("Peso a Dolar", 2.8);
	    map.put("Peso a Euro", 3.8);
	    map.put("Peso a Libra", 3.8);
	}

	@Override
	public void MostrarDialogo() {
		// TODO Auto-generated method stub
		seleccion = JOptionPane.showInputDialog(null,"Elije la moneda a convertir", "Monedas", JOptionPane.QUESTION_MESSAGE, null, map.keySet().toArray(),"Seleccione");
		if (seleccion == null) {
			throw new ExcepcionCancel();
		}
	}

	public double getConversion() {
		return ((double) this.getElemento((String)this.seleccion))*(this.valorAconvertir);
	}

}
