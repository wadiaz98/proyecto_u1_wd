package com.example.demo;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner; //ejecuta en consola
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.cita.Service.ICitaMedicaService;
import com.example.demo.cita.Service.IMedicoService;
import com.example.demo.cita.Service.IPacienteService;
import com.example.demo.cita.modelo.Medico;
import com.example.demo.cita.modelo.Paciente;

@SpringBootApplication
public class ProyectoU1ScApplication implements CommandLineRunner {

	@Autowired
	private IPacienteService pacienteService;
	@Autowired
	private IMedicoService medicoService;
	@Autowired
	private ICitaMedicaService citaMedicaService;

	public static void main(String[] args) {
		SpringApplication.run(ProyectoU1ScApplication.class, args);

	}

	@Override
	public void run(String... args) throws Exception {

		// Cita medica

		// Opcion 1: Crear y actualizar paciente

		Paciente paciente = new Paciente();
		paciente.setApellido("Diaz");
		paciente.setCedula("17258819");
		paciente.setNombre("Willan");
		paciente.setTipo("N"); // N de ninio

		pacienteService.guardar(paciente);

		paciente.setTipo("TE"); // TE de tercera edad
		paciente.setApellido("Cordova");

		pacienteService.modificar(paciente);

		// Opcion 2: crear medico
		Medico medico = new Medico();
		medico.setApellido("Torres");
		medico.setCedula("18245879");
		medico.setEspecialidad("Odontologia");
		medico.setNombre("Miguel");

		medicoService.agregar(medico);

		// Opcion 3: Agendar cita
		this.citaMedicaService.agendar("17258819", "18245879", LocalDateTime.of(2022, 12, 17, 18, 05));
	}

}
