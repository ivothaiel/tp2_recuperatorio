package ar.edu.unju.fi.ejercicio1.model;

public class Producto {

    public enum OrigenFabricacion {
        ARGENTINA, CHINA, BRASIL, URUGUAY
    }

    public enum Categoria {
        TELEFONIA, INFORMATICA, ELECTROHOGAR, HERRAMIENTAS
    }
    
    private String Codigo;
    private String Descripcion;
    private Double PrecioUnitario;
    private OrigenFabricacion origenFabricacion; // Cambiado a enum
    private Categoria categoria; // Cambiado a enum

    // Constructor
    public Producto(String codigo, String descripcion, Double precioUnitario, OrigenFabricacion origenFabricacion, Categoria categoria) {
        this.Codigo = codigo;
        this.Descripcion = descripcion;
        this.PrecioUnitario = precioUnitario;
        this.origenFabricacion = origenFabricacion;
        this.categoria = categoria;
    }

    // Getters y Setters
    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String codigo) {
        Codigo = codigo;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }

    public Double getPrecioUnitario() {
        return PrecioUnitario;
    }

    public void setPrecioUnitario(Double precioUnitario) {
        PrecioUnitario = precioUnitario;
    }

    public OrigenFabricacion getOrigenFabricacion() {
        return origenFabricacion;
    }

    public void setOrigenFabricacion(OrigenFabricacion origenFabricacion) {
        this.origenFabricacion = origenFabricacion;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
}

