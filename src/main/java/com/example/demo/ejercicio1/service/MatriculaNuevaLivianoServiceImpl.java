package com.example.demo.ejercicio1.service;

import java.math.BigDecimal;

import org.springframework.stereotype.Service;


@Service("Liviano")
public class MatriculaNuevaLivianoServiceImpl implements IMatriculaNuevaService {

	@Override
	public BigDecimal matricular(BigDecimal precio) {
		// TODO Auto-generated method stub;
		System.out.println("Matriculado liviano");
		System.out.println("Calculo del descuento de 2000");
		BigDecimal valor = null;
		valor = precio.multiply(new BigDecimal(0.15));
		return valor;
	}

}
