package Modelo;

public class Horas extends Empleado {
	String cedComparar;
	int horas;
	int valorHora;
	int empleadosRegistrados;

	public String getCedComparar() {
		return cedComparar;
	}

	public void setCedComparar(String cedComparar) {
		this.cedComparar = cedComparar;
	}

	public int getHoras() {
		return horas;
	}

	public void setHoras(int horas) {
		this.horas = horas;
	}

	public int getValorHora() {
		return valorHora;
	}

	public void setValorHora(int valorHora) {
		this.valorHora = valorHora;
	}

	public int getEmpleadosRegistrados() {
		return empleadosRegistrados;
	}

	public void setEmpleadosRegistrados(int empleadosRegistrados) {
		this.empleadosRegistrados = empleadosRegistrados;
	}

}
