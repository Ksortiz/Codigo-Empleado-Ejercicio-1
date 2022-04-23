package Modelo;

import javax.swing.JOptionPane;

public class Funciones extends Horas {
	public void cargarArreglo() {
		try {
			Empleado empleado = new Empleado();
			arreglo[empleadosRegistrados] = empleado;
			empleado.setCedula(JOptionPane.showInputDialog((empleadosRegistrados + 1) + ". Ingrese su cedula: "));
			if (empleadosRegistrados != 0) {
				boolean validar = true;
				while (validar) {
					for (int j = 0; j <= empleadosRegistrados; j++) {
						if (empleadosRegistrados != j
								&& arreglo[empleadosRegistrados].getCedula().equals(arreglo[j].getCedula())) {
							arreglo[empleadosRegistrados]
									.setCedula(JOptionPane.showInputDialog("Ingrese una cedula valida: "));
							validar = true;
	
							break;
						} else {
							validar = false;
						}
					}
				}
			}
			
			empleado.setNombre(JOptionPane.showInputDialog("Ingrese el nombre: "));
			empleado.setApellido(JOptionPane.showInputDialog("Ingrese su apellido: "));
			empleado.setNumero(JOptionPane.showInputDialog("Ingrese su numero: "));
			horas =Integer.parseInt(JOptionPane.showInputDialog("Ingrese las horas trabajadas: "));
			valorHora =Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de la hora: "));
			empleado.setSueldo(valorHora());
			arreglo[empleadosRegistrados] = empleado;

		} catch (IndexOutOfBoundsException ex) {
			
			JOptionPane.showMessageDialog(null, "El arreglo esta lleno");
		}

		empleadosRegistrados += 1;
	}

	public void buscarEmp(String cedComparar) {

		String vista = "No fue posible encontrar el registro";
		for (int i = 0; i < empleadosRegistrados; i++) {
			if (arreglo[i] != null && cedComparar.equals(arreglo[i].getCedula())) {
				vista = "Nombre : " + arreglo[i].getNombre() + "\nApellido : " + arreglo[i].getApellido() + "\n"
						+ "Numero : " + arreglo[i].getNumero() + "\n" + "Cedula: " + arreglo[i].getCedula() + "\n"+"Sueldo: "+getSueldo();
			}
		}
		JOptionPane.showMessageDialog(null, vista);
	}

	public void eliminarEmp(String cedComparar) {
		for (int i = 0; i < arreglo.length; i++) {
			if (arreglo[i] != null && cedComparar.equals(arreglo[i].getCedula())) {
				arreglo[i] = null;
			}

		}
		for (int i = 0; i < arreglo.length; i++) {
			if (arreglo[i] != null) {
				arregloAux[i] = arreglo[i];
			}
		}
		arreglo = arregloAux;
		empleadosRegistrados -= 1;
	}

	
	public double valorHora() {
		
		double horasExtra = 0;

		if (horas > 48) {
			horasExtra = ((valorHora * (horas - 48)) * 1.4);
			horas = (horas - (horas - 48));
			
		}
		
		if (horas > 40 || horas <= 48) {
			horasExtra = +((valorHora * (horas - 40)) * 1.2);
			horas = (horas - (horas - 40));
		}

		return ((valorHora * horas) + horasExtra);

	}
}
