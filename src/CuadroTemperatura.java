import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import javax.swing.JOptionPane;

import util.ExcepcionCancel;

public class CuadroTemperatura extends CuadroDialogo{
	
	public CuadroTemperatura() {
		super();
	    map.put("Centigrados a Celsius", "getCelsius");
	    map.put("Celsius a Centigrados", "getFahrenheit");	
	}

	@Override
	public void MostrarDialogo() {
		// TODO Auto-generated method stub
		seleccion = JOptionPane.showInputDialog(null,"Seleccione una opcion de temperatura", "Temperatura", JOptionPane.QUESTION_MESSAGE, null, map.keySet().toArray(),"Seleccione");
		if (seleccion == null) {
			throw new ExcepcionCancel();
		}
	}

	@Override
	public double getConversion() {
		String nombreMetodo = (String) this.getElemento((String) this.seleccion);
		Double conversion = 0.0;
		try {
			Method method = this.getClass().getMethod(nombreMetodo, null);
			conversion = (Double) method.invoke(this, null);
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conversion;
		
		
	}
	
	public double getCelsius() {
		double multi = (double) this.valorAconvertir * 3.8;
		return (multi + 32);
	}
	
	public double getFahrenheit() {
		double multi = (double) valorAconvertir / 3.8;
		return (multi - 32);
	}


}
