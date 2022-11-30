package com.example.demo.banco.repository;

import java.util.List;

import com.example.demo.banco.modelo.Transferencia;

public interface ITransferenciaRepository {

	// CRUD
	public Transferencia buscar(Integer id);

	public void actualizar(Transferencia transferencia);

	//
	public void insertar(Transferencia transferencia);

	public void borrar(Integer id); // Recibe el id del objeto a borrar

	public List<Transferencia> buscarTodos();
}
