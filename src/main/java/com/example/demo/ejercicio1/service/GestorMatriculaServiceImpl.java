package com.example.demo.ejercicio1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.demo.ejercicio1.modelo.Vehiculo;

@Service
public class GestorMatriculaServiceImpl implements IGestorMatriculaService {
	@Autowired
	@Qualifier("Liviano")
	private IMatriculaNuevaService matriculaNuevaLivianoService;

	@Autowired
	@Qualifier("Pesado")
	private IMatriculaNuevaService matriculaNuevaService;

	@Override
	public void matricular(String cedula, String placa) {
		// TODO Auto-generated method stub
		Vehiculo vehi = null;
		if (vehi.getTipo().equals("P")) {
			this.matriculaNuevaService.matricular("1241241241", "PSGD2312");
		} else {
			this.matriculaNuevaLivianoService.matricular("1241241241", "PSGD2312");
		}
		// Programo descuento
	}

}
