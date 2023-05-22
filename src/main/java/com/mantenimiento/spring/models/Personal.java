package com.mantenimiento.spring.models;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.NamedQueries;
import javax.persistence.Table;

@Entity
@Table(name = "personal")
@NamedQueries({
        @NamedQuery(name = "Personal.findAll", query = "SELECT p FROM  Personal p"),
        @NamedQuery(name = "Personal.findByIdPersonal", query = "SELECT p FROM Personal p WHERE p.id_personal = :id_personal"),
        @NamedQuery(name = "Personal.findByNombre", query = "SELECT p FROM Personal p WHERE p.nombre = :nombre"),
        @NamedQuery(name = "Personal.findByIdSede", query = "SELECT p FROM Personal p WHERE p.id_sede= :id_sede"),
        @NamedQuery(name = "Personal.findByApellido", query = "SELECT p FROM Personal p WHERE p.apellido= :apellido"),
        @NamedQuery(name = "Personal.findByCargo", query = "SELECT p FROM Personal p WHERE p.cargo = :cargo"),
        @NamedQuery(name = "Personal.findByTurno", query = "SELECT p FROM Personal p WHERE p.turno = :turno")
})

public class Personal implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = true)
    private Integer id_personal;

    @Basic(optional = false)
    @Column(name = "nombre")
    private String nombre;

    @Column(name = "id_sede")
    private Integer id_sede;

    @Column(name = "apellido")
    private String apellido;

    @Column(name = "cargo")
    private String cargo;

    @Column(name = "turno")
    private String turno;

    public Personal() {

    }

    public Personal(String nombre, Integer id_sede, String apellido, String cargo, String turno) {
        this.nombre = nombre;
        this.id_sede = id_sede;
        this.apellido = apellido;
        this.cargo = cargo;
        this.turno = turno;
    }

    public Integer getId_personal() {
        return id_personal;
    }

    public void setId_personal(Integer id_personal) {
        this.id_personal = id_personal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getId_sede() {
        return id_sede;
    }

    public void setId_sede(Integer id_sede) {
        this.id_sede = id_sede;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    @Override
    public String toString() {
        return "Personal [id_personal=" + id_personal + "]";
    }

    // funciones y listas
}
