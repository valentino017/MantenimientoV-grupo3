package com.mantenimiento.spring.models;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "vehiculo")
@NamedQueries({ 
	    @NamedQuery(name = "Vehiculo.findAll", query = "SELECT p FROM  Vehiculo p"),
		@NamedQuery(name = "Vehiculo.findById_vehiculo", query = "SELECT p FROM  Vehiculo p WHERE p.id_vehiculo = :id_vehiculo"),
		@NamedQuery(name = "Vehiculo.findByModelo", query = "SELECT p FROM  Vehiculo p WHERE p.modelo = :modelo"),
		@NamedQuery(name = "Vehiculo.findByEstado", query = "SELECT p FROM  Vehiculo p WHERE p.estado = :estado"),
		@NamedQuery(name = "Vehiculo.findByNromatricula", query = "SELECT p FROM  Vehiculo p WHERE p.nroMatricula = :nroMatricula"),
		@NamedQuery(name = "Vehiculo.findById_cliente", query = "SELECT p FROM  Vehiculo p WHERE p.id_cliente = :id_cliente"),
		@NamedQuery(name = "Vehiculo.findByColor", query = "SELECT p FROM  Vehiculo p WHERE p.color = :color") })

public class Vehiculo implements Serializable{
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = true)
	private Integer id_vehiculo;

	@Basic(optional = false)
	@Column(name = "modelo")
	private String modelo;

	@Column(name = "estado")
	private String estado;
	
	@Column(name = "nroMatricula")
	private String nroMatricula;

	@Column(name = "id_cliente")
	private Integer id_cliente;
	
	@Column(name = "color")
	private String color;
	
	// @OneToMany(cascade=CascadeType.ALL,mappedBy = "pelicula",fetch =
		// FetchType.LAZY)
		// @JsonBackReference(value = "pelicu_fun")
		// private List<Funciones> funcionesList;
		
		public Vehiculo() {

		}
		
		public Vehiculo(String modelo, String estado, String nroMatricula, Integer id_cliente, String color) {
			this.modelo = modelo;
			this.estado = estado;
			this.nroMatricula = nroMatricula;
			this.id_cliente = id_cliente;
			this.color = color;
		}

		public Integer getId_vehiculo() {
			return id_vehiculo;
		}

		public void setId_vehiculo(Integer id_vehiculo) {
			this.id_vehiculo = id_vehiculo;
		}

		public String getModelo() {
			return modelo;
		}

		public void setModelo(String modelo) {
			this.modelo = modelo;
		}

		public String getEstado() {
			return estado;
		}

		public void setEstado(String estado) {
			this.estado = estado;
		}

		public String getNroMatricula() {
			return nroMatricula;
		}

		public void setNroMatricula(String nroMatricula) {
			this.nroMatricula = nroMatricula;
		}

		public Integer getId_cliente() {
			return id_cliente;
		}

		public void setId_cliente(Integer id_cliente) {
			this.id_cliente = id_cliente;
		}

		public String getColor() {
			return color;
		}

		public void setColor(String color) {
			this.color = color;
		}
		
		@Override
		public String toString() {
			return "Vehiculo [id_vehiculo=" + id_vehiculo + "]";
		}


		
		


}
