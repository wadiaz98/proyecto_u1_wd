package com.example.demo.ejercicio1.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.demo.ejercicio1.modelo.Matricula;
import com.example.demo.ejercicio1.modelo.Propietario;
import com.example.demo.ejercicio1.modelo.Vehiculo;
import com.example.demo.ejercicio1.repository.IMatriculaRepository;
import com.example.demo.ejercicio1.repository.IPropietarioRepository;
import com.example.demo.ejercicio1.repository.IVehiculoRepository;

@Service
public class GestorMatriculaServiceImpl implements IGestorMatriculaService {
	@Autowired
	@Qualifier("Liviano")
	private IMatriculaNuevaService matriculaNuevaLivianoService;

	@Autowired
	@Qualifier("Pesado")
	private IMatriculaNuevaService matriculaNuevaService;

	@Autowired
	private IVehiculoRepository vehiculoRepository;

	@Autowired
	private IMatriculaRepository matriculaRepository;

	@Autowired
	private IPropietarioRepository propietarioRepository;

	@Override
	public void matricular(String cedula, String placa) {
		// TODO Auto-generated method stub
		Matricula matricula = new Matricula();
		matricula.setFecha(LocalDateTime.now());
		Propietario propietario = this.propietarioRepository.buscar(cedula);
		matricula.setPropietario(propietario);
		Vehiculo vehiculo = this.vehiculoRepository.buscar(placa);
		matricula.setVehiculo(vehiculo);

		BigDecimal valor = null;
		if (vehiculo.getTipo().equals("P")) {
			valor = this.matriculaNuevaService.matricular(vehiculo.getPrecio());
			System.out.println("Su vehiculo es : PESADO");
		} else {
			valor = this.matriculaNuevaLivianoService.matricular(vehiculo.getPrecio());
			System.out.println("Su vehiculo es: LIVIANO");
		}
		// Programo descuento
		if (valor.compareTo(new BigDecimal(2000)) > 1) {
			BigDecimal descuento = valor.multiply(new BigDecimal(0.07));

			valor = valor.subtract(descuento);
		}
		matricula.setValor(valor);

		this.matriculaRepository.insertar(matricula);
		System.out.println("Se matriculo el vehiculo: " + matricula);
		System.out.println("El valor fue: " + valor);
	}

}
