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
@Table(name = "sede")
@NamedQueries({ 
	    @NamedQuery(name = "Sede.findAll", query = "SELECT p FROM  Sede p"),
		@NamedQuery(name = "Sede.findById_sede", query = "SELECT p FROM  Sede p WHERE p.id_sede = :id_sede"),
		@NamedQuery(name = "Sede.findByNombre", query = "SELECT p FROM  Sede p WHERE p.nombre = :nombre"),
		@NamedQuery(name = "Sede.findByDireccion", query = "SELECT p FROM  Sede p WHERE p.direccion = :direccion"),
		@NamedQuery(name = "Sede.findById_personal", query = "SELECT p FROM  Sede p WHERE p.id_personal = :id_personal") })
public class Sede implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = true)
	private Integer id_sede;

	@Basic(optional = false)
	@Column(name = "nombre")
	private String nombre;

	@Column(name = "direccion")
	private String direccion;

	@Column(name = "id_personal")
	private Integer id_personal;

	// @OneToMany(cascade=CascadeType.ALL,mappedBy = "pelicula",fetch =
	// FetchType.LAZY)
	// @JsonBackReference(value = "pelicu_fun")
	// private List<Funciones> funcionesList;
	
	public Sede() {

	}

	public Sede(String nombre, String direccion, Integer id_personal) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.id_personal = id_personal;
	}
	
	public Integer getId_sede() {
		return id_sede;
	}

	public void setId_sede(Integer id_sede) {
		this.id_sede = id_sede;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public Integer getId_personal() {
		return id_personal;
	}

	public void setId_personal(Integer id_personal) {
		this.id_personal = id_personal;
	}

	/*public static long getSerialversionuid() {
		return serialVersionUID;
	}*/

	

	// public List<Funciones> getFuncionesList() {
	// return funcionesList;
	// }

	// public void setFuncionesList(List<Funciones> funcionesList) {
	// this.funcionesList = funcionesList;
	// }

	@Override
	public String toString() {
		return "Sede [id_sede=" + id_sede + "]";
	}

}
