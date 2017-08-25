/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad.pkg5;

/**
 *
 * @author Miguel A. Ardon E
 */
public class Proceso{
    int id = 0;
    int rafaga = 0;
    int estado = 0;//0 es listo y 1 es en ejecucion

    public Proceso() {
    }

    public Proceso(int id, int rafaga, int estado) {
        this.id = id;
        this.rafaga = rafaga;
        this.estado = estado;
    }

    public int getRafaga() {
        return rafaga;
    }

    public void setRafaga(int rafaga) {
        this.rafaga = rafaga;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
    
    
    
}
