/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paradigmas_Progra;

/**
 *
 * @author Guillermo Saldaña Camacho
 */
public class Perso_SobrCnst {
   public static void main(String[] args) {
        Persona p1 = new Persona();
        Persona p2 = new Persona("Ale");
        Persona p3 = new Persona(20);
        Persona p4 = new Persona("Alex", 20);

        System.out.println("Nombre: " + p1.nombre + ", edad: " + p1.edad);
        System.out.println("Nombre: " + p2.nombre + ", edad: " + p2.edad);
        System.out.println("Nombre: " + p3.nombre + ", edad: " + p3.edad);
        System.out.println("Nombre: " + p4.nombre + ", edad: " + p4.edad);
    }

    private static class Persona {
        
    public String nombre;
    public int edad;

    public Persona() {}
    public Persona(String nombre) {
        this.nombre = nombre;
    }
    public Persona(int edad) {
        this.edad = edad;
    }

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
 
    }
}
