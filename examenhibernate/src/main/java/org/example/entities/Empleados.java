package org.example.entities;


import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "Empleados")
public class Empleados implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nombre;
    private String email;
    private String departamento;

    public Empleados() {
    }

    public Empleados(Integer id, String nombre, String email, String departamento) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
        this.departamento = departamento;
    }

    //Getters y Setters

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getDepartamento() {
        return departamento;
    }
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    //To String
    @Override
    public String toString() {
        return "Empleados{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", email='" + email + '\'' +
                ", departamento='" + departamento + '\'' +
                '}';
    }

}
