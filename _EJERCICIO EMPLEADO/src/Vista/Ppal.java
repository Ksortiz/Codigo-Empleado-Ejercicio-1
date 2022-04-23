  package Vista;

import javax.swing.JOptionPane;

import Modelo.Funciones;

public class Ppal {
	public static void main(String[] args) {
		Funciones emp = new Funciones();
		int opc, opco;

		do {
			opc = Integer.parseInt(
					JOptionPane.showInputDialog("		"
							+ "Ingrese una opcion		" + ""
							+ "\n1)Nuevo "
							+ "\n2)Editar "
							+ "\n3)Salir"));

			switch (opc) {
			case 1:
				emp.cargarArreglo();
				break;
			case 2:
				do {
					opco = Integer.parseInt(JOptionPane.showInputDialog(""
					+ "Ingrese una opcion		" 
					+ "\n1)Consultar 	"
					+ "\n2)Eliminar  "
					+ "\n3)Volver"));
					switch (opco) {
					case 1:
						emp.buscarEmp(JOptionPane.showInputDialog("Digite la cedula para buscar: "));
						break;
					case 2:
						emp.eliminarEmp(JOptionPane.showInputDialog("Digite la cedula para eliminar: "));
						break;

					default:
						break;
					}
				} while (opco != 3);
				break;

			default:
				break;
			}

		} while (opc != 3);
	}
}
