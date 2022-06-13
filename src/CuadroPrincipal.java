
import javax.swing.JOptionPane;

import util.ExcepcionCancel;

public class CuadroPrincipal extends CuadroDialogo {
	
	
	public CuadroPrincipal() {
		super();
	    map.put("Conversor de moneda", new CuadroMoneda());
	    map.put("Conversor de temperatura", new CuadroTemperatura());	    
	}

	@Override
	public void MostrarDialogo() throws ExcepcionCancel{
			seleccion = JOptionPane.showInputDialog(null,"Seleccione una opcion de conversion", "Menu", JOptionPane.QUESTION_MESSAGE, null, map.keySet().toArray(),"Seleccione");	
			if (seleccion == null) {
				throw new ExcepcionCancel();
			}
			
	}

	@Override
	public double getConversion() {
		// TODO Auto-generated method stub
		return 0;
	}


}
