package com.mantenimiento.spring.models;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@Entity
@Table(name = "cliente")
@NamedQueries({
    @NamedQuery(name = "Cliente.findAll", query = "SELECT p FROM  Cliente p"),
    @NamedQuery(name = "Cliente.findByIdCliente", query = "SELECT p FROM Cliente p WHERE p.id_cliente = :id_cliente"),
    @NamedQuery(name = "Cliente.findByNombre", query = "SELECT p FROM Cliente p WHERE p.nombre = :nombre"),
    @NamedQuery(name = "Cliente.findByApellido", query = "SELECT p FROM Cliente p WHERE p.apellido = :apellido"),
    @NamedQuery(name = "Cliente.findByTelefono", query = "SELECT p FROM Cliente p WHERE p.telefono = :telefono"),
    @NamedQuery(name = "Cliente.findByCorreo", query = "SELECT p FROM Cliente p WHERE p.correo = :correo"),
    @NamedQuery(name = "Cliente.findByDireccion", query = "SELECT p FROM Cliente p WHERE p.direccion = :direccion")})
public class Cliente implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = true)
    private Integer id_cliente;

    @Basic(optional = false)
    @Column(name = "nombre")
    private String nombre;

    @Column(name = "apellido")
    private String apellido;

    @Column(name = "telefono")
    private String telefono;

    @Column(name = "correo")
    private String correo;

    @Column(name = "direccion")
    private String direccion;

    public Cliente() {

    }

    public Cliente(String nombre, String apellido, String telefono, String correo, String direccion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.correo = correo;
        this.direccion = direccion;
    }

    public Integer getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(Integer id_cliente) {
        this.id_cliente = id_cliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Cliente [id_cliente=" + id_cliente + "]";
    }

}
