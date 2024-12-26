
package com.promedionotas.promedionotas.model;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Basquetbolistas {
    private Long id;
    private String dni;
    private String nombre;
    private String apellido;
    private int edad;
    private double peso;
    private double estatura;

    public Basquetbolistas() {
    }
    
    public Basquetbolistas(Long id, String dni, String nombre, String apellido, int edad, double peso, double estatura) {
        this.id = id;
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.peso = peso;
        this.estatura = estatura;
    }

    @Override
    public String toString() {
        return "Basquetbolistas{" + "nombre=" + nombre + ", apellido=" + apellido + ", estatura=" + estatura + '}';
    }
    
    

}
