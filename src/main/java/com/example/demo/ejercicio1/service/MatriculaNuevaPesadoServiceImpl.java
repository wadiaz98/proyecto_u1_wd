package com.example.demo.ejercicio1.service;

import org.springframework.stereotype.Service;

@Service("Pesado")
public class MatriculaNuevaPesadoServiceImpl implements IMatriculaNuevaService {

	@Override
	public void matricular(String cedula, String placa) {
		// TODO Auto-generated method stub
		System.out.println("Matriculado pesado");
	}

}
