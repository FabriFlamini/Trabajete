package com.example.demo.model;

import jakarta.persistence.*;
import org.jetbrains.annotations.NotNull;

import java.time.Instant;

@Entity
@Table(name = "comprobante")
public class Comprobante {
    @Id
    @Column(name = "idcomprobante", nullable = false)
    private Integer id;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_cliente", nullable = false)
    private Cliente idCliente;

    @Column(name = "fecha")
    private Instant fecha;

    @Column(name = "cantidad")
    private Integer cantidad;

    @Column(name = "total")
    private Float total;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Cliente getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Cliente idCliente) {
        this.idCliente = idCliente;
    }

    public Instant getFecha() {
        return fecha;
    }

    public void setFecha(Instant fecha) {
        this.fecha = fecha;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Float getTotal() {
        return total;
    }

    public void setTotal(Float total) {
        this.total = total;
    }

}