package ale.proyecto1.weba;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author T107
 */
public class ContadorVisitas {
    
private static int contador;

    public static int getContador() {
contador++;
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }




}
