import java.util.HashMap;
import java.util.Map;

import javax.swing.JOptionPane;

import util.ExcepcionCancel;

public abstract class CuadroDialogo {

	protected Object seleccion = null;
	protected Map<String, Object> map = new HashMap<>();
	protected double valorAconvertir;
	
	public CuadroDialogo() {           
	}
	
	public abstract void MostrarDialogo() throws ExcepcionCancel;
	
	public void MostrarInput() {
		// TODO Auto-generated method stub
		try {
			valorAconvertir  = Double.parseDouble(JOptionPane.showInputDialog("Introduce valor a convertir:"));
			
		} catch (Exception ex) {
            JOptionPane.showMessageDialog(null,  "Error valor ingresado");
            MostrarInput();
		} 
		
	}

	public String getSeleccion() {
		return seleccion.toString();
	}
	
	public Object getElemento(String clave) {
		return map.get(clave);
	}
	
	
	public abstract double getConversion();
	
	public void mostrarResultado() {
		JOptionPane.showMessageDialog(null, "La conversion de "+getSeleccion()+" da: "+getConversion());
	}

	
	
	
	
}
