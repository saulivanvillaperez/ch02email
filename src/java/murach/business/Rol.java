/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package murach.business;

import java.io.Serializable;

/**
 *
 * @author GoLdE
 */
public class Rol implements Serializable{
    private int id;
    private String nombre;
    private String descripcion;

    //constructor vacío
    public Rol() {
    }

    // constructor con 3 parámetros
    public Rol(int id, String nombre, String descripcion) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    // descriptores de acceso
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    /**
     * Devuelve una representación de cadena (nombre)
     * de este objeto
     * @return el nombre que representa el objeto.
     */
    @Override
    public String toString(){
        return this.nombre;
    }
}