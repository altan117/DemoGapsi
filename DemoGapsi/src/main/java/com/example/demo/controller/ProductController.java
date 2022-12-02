package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.DemoProducto;
import com.example.demo.repository.ProductRepository;

@RestController
@RequestMapping("/api")
public class ProductController {
	
	@Autowired
	private ProductRepository repository;
	
	@GetMapping("/product")
	public List<DemoProducto> allProducts(){
		return repository.findAll();
	}
	
	@GetMapping("/product/{id}")
	public Optional<DemoProducto> findById(@PathVariable("id") String id){
		return repository.findById(id);
	}
	
	@PutMapping("/product/{id}")
	public Optional<DemoProducto> updatePerson(@PathVariable("id") String id, @RequestBody DemoProducto producto) {	
		DemoProducto dp = repository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Employee not exist with id: " + id));
		
		dp.setDescripcionProducto(producto.getDescripcionProducto());
		dp.setModeloProducto(producto.getModeloProducto());
		
		repository.save(dp);
		
		return repository.findById(id);
	}

}
