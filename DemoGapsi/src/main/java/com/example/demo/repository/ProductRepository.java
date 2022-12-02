package com.example.demo.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.model.DemoProducto;

@Repository
@Transactional
public interface ProductRepository extends JpaRepository<DemoProducto, String> {
	
	Optional<DemoProducto> findById(@Param("id") String id);
	
	@Modifying
	@Query("update DemoProducto u set u.descripcionProducto = :descripcion, u.modeloProducto = :modelo where u.idProducto = :id")
	void updateProduct(@Param("id") String id, @Param("descripcion") String descripcion, @Param("modelo") String modelo);

}
