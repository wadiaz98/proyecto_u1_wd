package com.example.demo.tradicional;

public class PacienteNinio extends Paciente{
	
	private int pesoNacimiento;

	public int getPesoNacimiento() {
		return pesoNacimiento;
	}

	public void setPesoNacimiento(int pesoNacimiento) {
		this.pesoNacimiento = pesoNacimiento;
	}

	@Override
	public String toString() {
		return super.toString() + " PacienteNinio [pesoNacimiento=" + pesoNacimiento + "]";
	}

	
}
