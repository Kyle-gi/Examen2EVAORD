package es.iesquevedo.modelo;

import java.util.Objects;

public class Videojuego {
    private String codigo;
    private String titulo;
    private String desarrolladora;
    private String plataforma;
    private double precioUnitario;
    private int stock;

    public Videojuego() {
    }

    public Videojuego(String codigo, String titulo, String desarrolladora, String plataforma, double precioUnitario, int stock) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.desarrolladora = desarrolladora;
        this.plataforma = plataforma;
        this.precioUnitario = precioUnitario;
        this.stock = stock;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDesarrolladora() {
        return desarrolladora;
    }

    public void setDesarrolladora(String desarrolladora) {
        this.desarrolladora = desarrolladora;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public boolean tieneStock() {
        return stock > 0;
    }

    @Override
    public String toString() {
        return "Videojuego{" +
                "codigo='" + codigo + '\'' +
                ", titulo='" + titulo + '\'' +
                ", desarrolladora='" + desarrolladora + '\'' +
                ", plataforma='" + plataforma + '\'' +
                ", precioUnitario=" + precioUnitario +
                ", stock=" + stock +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Videojuego)) return false;
        Videojuego otro = (Videojuego) obj;
        return Objects.equals(codigo, otro.codigo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo);
    }
}
