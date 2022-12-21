package com.example.demo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner; //ejecuta en consola
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.ejercicio1.modelo.Propietario;
import com.example.demo.ejercicio1.modelo.Vehiculo;
import com.example.demo.ejercicio1.service.IGestorMatriculaService;
import com.example.demo.ejercicio1.service.IVehiculoService;
import com.example.demo.ejercicio1.service.IpropietarioService;

@SpringBootApplication
public class ProyectoU1ScApplication implements CommandLineRunner {

	@Autowired
	private IVehiculoService iVehiculoService;

	@Autowired
	private IpropietarioService iPropietarioService;

	@Autowired
	private IGestorMatriculaService iGestorMatriculaService;

	public static void main(String[] args) {
		SpringApplication.run(ProyectoU1ScApplication.class, args);

	}

	@Override
	public void run(String... args) throws Exception {
		Vehiculo vehi = new Vehiculo();
		vehi.setMarca("Tocyota");
		vehi.setPlaca("PSGD2312");
		vehi.setPrecio(new BigDecimal(20000));
		vehi.setTipo("L");
		this.iVehiculoService.crear(vehi);
		vehi.setPrecio(new BigDecimal(10000));
		vehi.setMarca("Toyota");
		this.iVehiculoService.modificar(vehi);
		Propietario propietario = new Propietario();
		propietario.setApellido("Diaz");
		propietario.setCedula("1241241241");
		propietario.setFechaNaciemiento(LocalDateTime.of(1999, 12, 12, 12, 12));
		propietario.setNombre("Willan");
		this.iPropietarioService.guardar(propietario);

		this.iGestorMatriculaService.matricular("1241241241", "PSGD2312");

	}

}
