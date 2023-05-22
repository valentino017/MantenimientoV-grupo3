package com.mantenimiento.spring.models;

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
@Table(name = "reserva")
@NamedQueries({
        @NamedQuery(name = "Reserva.findAll", query = "SELECT p FROM  Reserva p"),
        @NamedQuery(name = "Reserva.findByIdReserva", query = "SELECT p FROM Reserva p WHERE p.id_reserva = :id_reserva"),
        @NamedQuery(name = "Reserva.findByIdCliente", query = "SELECT p FROM Reserva p WHERE p.id_cliente = :id_cliente"),
        @NamedQuery(name = "Reserva.findByIdSede", query = "SELECT p FROM Reserva p WHERE p.id_sede = :id_sede"),
        @NamedQuery(name = "Reserva.findByIdVehiculo", query = "SELECT p FROM Reserva p WHERE p.id_vehiculo = :id_vehiculo"),
        @NamedQuery(name = "Reserva.findByFechaIngreso", query = "SELECT p FROM Reserva p WHERE p.fechaIngreso = :fechaIngreso"),
        @NamedQuery(name = "Reserva.findByTurno", query = "SELECT p FROM Reserva p WHERE p.Turno = :Turno") })
public class Reserva {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = true)
    private Integer id_reserva;

    @Basic(optional = false)
    @Column(name = "id_cliente")
    private Integer id_cliente;

    @Column(name = "id_sede")
    private Integer id_sede;

    @Column(name = "id_vehiculo")
    private Integer id_vehiculo;

    @Column(name = "fechaIngreso")
    private String fechaIngreso;

    @Column(name = "Turno")
    private String Turno;

    public Reserva() {

    }

    public Reserva(Integer id_cliente, Integer id_sede, Integer id_vehiculo, String fechaIngreso, String turno) {
        this.id_cliente = id_cliente;
        this.id_sede = id_sede;
        this.id_vehiculo = id_vehiculo;
        this.fechaIngreso = fechaIngreso;
        Turno = turno;
    }

    public Integer getId_reserva() {
        return id_reserva;
    }

    public void setId_reserva(Integer id_reserva) {
        this.id_reserva = id_reserva;
    }

    public Integer getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(Integer id_cliente) {
        this.id_cliente = id_cliente;
    }

    public Integer getId_sede() {
        return id_sede;
    }

    public void setId_sede(Integer id_sede) {
        this.id_sede = id_sede;
    }

    public Integer getId_vehiculo() {
        return id_vehiculo;
    }

    public void setId_vehiculo(Integer id_vehiculo) {
        this.id_vehiculo = id_vehiculo;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String getTurno() {
        return Turno;
    }

    public void setTurno(String turno) {
        Turno = turno;
    }

    @Override
    public String toString() {
        return "Reserva [id_reserva=" + id_reserva + "]";
    }

}
