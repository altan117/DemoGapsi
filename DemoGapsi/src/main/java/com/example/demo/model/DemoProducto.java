package com.example.demo.model;

import java.io.Serializable;

import org.hibernate.annotations.GenericGenerator;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;


/**
 * The persistent class for the demo_producto database table.
 * 
 */
@Entity
@Table(name="demo_producto")
@NamedQuery(name="DemoProducto.findAll", query="SELECT d FROM DemoProducto d")
public class DemoProducto implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID_PRODUCTO", length=10)
	private String idProducto;

	@Column(name="DESCRIPCION_PRODUCTO", length=200)
	private String descripcionProducto;

	@Column(name="MODELO_PRODUCTO", length=10)
	private String modeloProducto;

	@Column(name="NOMBRE_PRODUCTO", length=20)
	private String nombreProducto;

	@Column(name="PRECIO_PRODUCTO", precision=2)
	private float precioProducto;

	public DemoProducto() {
	}

	public String getIdProducto() {
		return this.idProducto;
	}

	public String getDescripcionProducto() {
		return this.descripcionProducto;
	}

	public void setDescripcionProducto(String descripcionProducto) {
		this.descripcionProducto = descripcionProducto;
	}

	public String getModeloProducto() {
		return this.modeloProducto;
	}

	public void setModeloProducto(String modeloProducto) {
		this.modeloProducto = modeloProducto;
	}

	public String getNombreProducto() {
		return this.nombreProducto;
	}

	public float getPrecioProducto() {
		return this.precioProducto;
	}

}