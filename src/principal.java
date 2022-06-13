
import java.util.HashMap;
import java.util.Map;
import javax.swing.*;

import util.ExcepcionCancel;

public class principal {

	public static void main(String args[]) {

		boolean estado = true;
		while(estado) {
			CuadroPrincipal cp = new CuadroPrincipal();
			try {
				cp.MostrarDialogo();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.exit(0);
			}
	
			CuadroDialogo cm = (CuadroDialogo) cp.getElemento(cp.getSeleccion());
			try {
				cm.MostrarDialogo();
			} catch (ExcepcionCancel e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.exit(0);
			}
			cm.MostrarInput();
			cm.mostrarResultado();
			
	        int input = JOptionPane.showConfirmDialog(null, "Desea continuar?");
	        if(!(input==0)) {
	        	estado = false;
	        }

			
		}

	}

}
