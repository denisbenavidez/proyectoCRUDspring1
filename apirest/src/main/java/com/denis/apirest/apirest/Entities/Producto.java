package com.denis.apirest.apirest.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity //Con esto java ya sabra que esta clase sera de tipo entidad
public class Producto {
    @Id //atributo de clase id que sera el identificador unico PK de nuestros productos
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Con esto hacemos que nuestro ID sea autoincremental

    private Long id;
    private String nombreP;
    private double precioP;


    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getNombreP() {
        return nombreP;
    }
    public void setNombreP(String nombreP) {
        this.nombreP = nombreP;
    }

    public double getPrecioP() {
        return precioP;
    }
    public void setPrecioP(double precioP) {
        this.precioP = precioP;
    }

    
}
