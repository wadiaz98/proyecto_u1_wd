package com.example.demo;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.springboot.CitaMedicaSB;
import com.example.demo.springboot.MedicoSB;
import com.example.demo.springboot.PacienteCancerSB;
import com.example.demo.springboot.PacienteTerceraEdadSB;


@SpringBootApplication
public class ProyectoU1ScApplication implements CommandLineRunner {

	@Autowired
	private PacienteTerceraEdadSB pacienteTE;
	
	@Autowired
	private CitaMedicaSB citaMedicaSB;
	
	@Autowired
	private MedicoSB medicoSB;
	public static void main(String[] args) {
		SpringApplication.run(ProyectoU1ScApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Spring Boot");
		
		this.pacienteTE.setCodigoIESS("asadsdfss");
		this.pacienteTE.setNombre("Willan");
		this.pacienteTE.setTipo("TE");
		this.pacienteTE.setCedula("14234255");
		System.out.println(pacienteTE);
		
		citaMedicaSB.agendar("123123", LocalDateTime.of(2022, 12, 2, 8, 30), pacienteTE, medicoSB);
	}

}
