package com.example.demo.ejercicio1.service;

import org.springframework.stereotype.Service;

@Service("Liviano")
public class MatriculaNuevaLivianoServiceImpl implements IMatriculaNuevaService {

	@Override
	public void matricular(String cedula, String placa) {
		// TODO Auto-generated method stub
		System.out.println("Matriculado liviano");
		System.out.println("Calculo del descuento de 2000");
	}

}
