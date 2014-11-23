package Controlador;


import Modelo.Modelo;
import Modelo.Observer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author a09001005
 */
public abstract class Controlador implements Observer {

    protected Modelo modelo;

    public Controlador(Modelo modelo, int idEvento) {
        this.modelo = modelo;
        this.modelo.registrarObservador(this, idEvento);
    }

    @Override
    public void actualizar(Object o) {
        System.out.println("si actualiza, controlador");
    }

    public Modelo getModelo() {
        return modelo;
    }

    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }

}
