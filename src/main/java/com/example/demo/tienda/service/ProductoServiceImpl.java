package com.example.demo.tienda.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.tienda.modelo.Producto;

@Service
public class ProductoServiceImpl implements IProductoService{
	
	@Autowired
	private IProductoService iProductoService;
	@Override
	public void insertar(Producto producto) {
		// TODO Auto-generated method stub
		this.iProductoService.insertar(producto);
	}

}
