/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad.pkg5;

import java.util.LinkedList;
import java.util.Random;

/**
 *
 * @author Miguel A. Ardon E
 */
public class HiloProceso extends Thread {

    LinkedList<Proceso> lista = null;

    public HiloProceso() {
    }

    public HiloProceso(LinkedList<Proceso> lista) {
        this.lista = lista;
    }

    public void agregar(Proceso proceso) {
        lista.add(proceso);
    }

    @Override
    public void run() {
        Proceso proces;
        Random r = new Random();
        int i = 0;
        int x = 0;
        while (true) {
            x = r.nextInt(60000) + 1000;
            proces = new Proceso(i, x, 0);
            i++;
            System.out.println("PROCES CREATION:\n" + "id: " + proces.id + "\n" + "Rafaga: " + proces.getRafaga() + "\n" + "Estado: " + proces.getEstado() + "\n");
            agregar(proces);
            try {
                Thread.sleep(1000);//1000
            } catch (InterruptedException ex) {

            }

        }
    }
}
