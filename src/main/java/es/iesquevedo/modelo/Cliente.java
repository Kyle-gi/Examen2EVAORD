package es.iesquevedo.modelo;

import java.util.Objects;

public class Cliente {
    private String codigo;
    private String nombreCompleto;
    private String email;
    private String telefono;

    public Cliente() {
    }

    public Cliente(String codigo, String nombreCompleto, String email, String telefono) {
        this.codigo = codigo;
        this.nombreCompleto = nombreCompleto;
        this.email = email;
        this.telefono = telefono;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Cliente)) return false;
        Cliente otroCliente = (Cliente) obj;
        return Objects.equals(codigo, otroCliente.codigo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo);
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "codigo='" + codigo + '\'' +
                ", nombreCompleto='" + nombreCompleto + '\'' +
                ", email='" + email + '\'' +
                ", telefono='" + telefono + '\'' +
                '}';
    }
}

