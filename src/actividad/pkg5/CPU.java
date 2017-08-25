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
public class CPU extends Thread {

    LinkedList<Proceso> lista = null;

    public CPU() {
    }

    public CPU(LinkedList<Proceso> lista) {
        this.lista = lista;
    }

    @Override
    public void run() {
        Proceso proces;
        long time = 20000;
        while (true) {
            if (lista.isEmpty()) {
                System.out.println("No hay procesos en cola");
            } else {
                proces = lista.pollFirst();
                proces.setEstado(1);
                System.out.println("PROCES ANTES:\n" + "id: " + proces.id + "\n" + "Rafaga: " + proces.getRafaga() + "\n" + "Estado: " + proces.getEstado()+"\n");
                if (proces.getRafaga() > 20000) {
                    time = 20000;
                    proces.setRafaga(proces.getRafaga() - 20000);
                } else {
                    time = proces.getRafaga();
                    proces.setRafaga(0);
                }
                try {
                    Thread.sleep(time);
                    proces.setEstado(0);
                    System.out.println("PROCES DESPUES:\n" + "id: " + proces.id + "\n" + "Rafaga: " + proces.getRafaga() + "\n" + "Estado: " + proces.getEstado()+"\n");
                    if(proces.getRafaga()>0){
                        lista.add(proces);
                    }
                } catch (InterruptedException ex) {

                }
            }
        }
    }
}
