package ar.com.ada.creditos.entities;

import java.math.BigDecimal;

import javax.annotation.processing.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "Prestamo")

public class Prestamo {

    @Id
    @Column(name = "prestamo_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY) // autoincremental
    private int PrestamoId;
    private BigDecimal importe;

    @Column(name = "cuota")
    private int cuotas;
    @Column(name = "fecha_alta")
    private Date fechaAlta;

    @ManyToOne
    @JoinColumn(name = "cliente_id", referencedColumnName = "cliente_id")
    private Cliente cliente;
    private Date fecha;

    public BigDecimal getImporte() {
        return importe;
    }

    public void setImporte(BigDecimal importe) {
        this.importe = importe;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getCuotas() {
        return cuotas;
    }

    public void setCuotas(int cuotas) {
        this.cuotas = cuotas;
    }

    public Date getFechaAlta() {
        return fechaAlta;

    }

    public Date FechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(Date fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
        this.cliente.getPrestamos().add(this);
    }

    public Prestamo() {
    }
    public Prestamo(int prestamoId, BigDecimal importe, Date fecha, int cuotas, Date fechaAlta, Cliente cliente) {
        this.PrestamoId = prestamoId;
        this.importe = importe;
        this.fecha = fecha;
        this.cuotas = cuotas;
        this.fechaAlta = fechaAlta;
        this.cliente = cliente;
    }

	public String getPrestamoId() {
		return null;
	}



}