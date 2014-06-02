/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.registro.model;

/**
 *
 * @author socom_000
 */
public class Probarregistro {    
    public static void main(String[] args) {
        Perro p=new Perro();
        p.setNombre("wisky");
       Persona a=new Persona();
       a.setPerro(p);
       //El siguiente es lo que resivira el cliente en el paso 4
       System.out.println(a.getPerro().getNombre());
    }
    
}
