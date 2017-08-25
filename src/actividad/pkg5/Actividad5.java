/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad.pkg5;

import java.util.LinkedList;

/**
 *
 * @author Miguel A. Ardon E
 */
public class Actividad5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LinkedList<Proceso> lista = new LinkedList();
        new HiloProceso(lista).start();
        new CPU(lista).start();
    }
    
}
