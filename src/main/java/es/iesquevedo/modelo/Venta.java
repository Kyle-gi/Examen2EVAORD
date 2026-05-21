package es.iesquevedo.modelo;

import java.time.LocalDate;
import java.util.Objects;

public class Venta {
    private String numeroVenta;
    private String codigoVideojuego;
    private String codigoCliente;
    private int cantidadUnidades;
    private double precioTotal;
    private LocalDate fechaVenta;

    public Venta() {
    }

    public Venta(String numeroVenta, String codigoVideojuego, String codigoCliente, int cantidadUnidades, double precioTotal, LocalDate fechaVenta) {
        this.numeroVenta = numeroVenta;
        this.codigoVideojuego = codigoVideojuego;
        this.codigoCliente = codigoCliente;
        this.cantidadUnidades = cantidadUnidades;
        this.precioTotal = precioTotal;
        this.fechaVenta = fechaVenta;
    }

    public String getNumeroVenta() {
        return numeroVenta;
    }

    public void setNumeroVenta(String numeroVenta) {
        this.numeroVenta = numeroVenta;
    }

    public String getCodigoVideojuego() {
        return codigoVideojuego;
    }

    public void setCodigoVideojuego(String codigoVideojuego) {
        this.codigoVideojuego = codigoVideojuego;
    }

    public String getCodigoCliente() {
        return codigoCliente;
    }

    public void setCodigoCliente(String codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

    public int getCantidadUnidades() {
        return cantidadUnidades;
    }

    public void setCantidadUnidades(int cantidadUnidades) {
        this.cantidadUnidades = cantidadUnidades;
    }

    public double getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(double precioTotal) {
        this.precioTotal = precioTotal;
    }

    public LocalDate getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(LocalDate fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Venta)) return false;
        Venta otraVenta = (Venta) obj;
        return Objects.equals(numeroVenta, otraVenta.numeroVenta);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numeroVenta);
    }

    @Override
    public String toString() {
        return "Venta{" +
                "numeroVenta='" + numeroVenta + '\'' +
                ", codigoVideojuego='" + codigoVideojuego + '\'' +
                ", codigoCliente='" + codigoCliente + '\'' +
                ", cantidadUnidades=" + cantidadUnidades +
                ", precioTotal=" + precioTotal +
                ", fechaVenta=" + fechaVenta +
                '}';
    }
}

