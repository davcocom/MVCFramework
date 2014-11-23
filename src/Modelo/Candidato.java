/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.Serializable;

/**
 *
 * @author David Cocom
 */
public class Candidato implements Serializable {

    private static final long serialVersionUID = -5372772868069600498L;

    private String nombre;
    private int numVotos;
    private int id;

    public Candidato(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        this.numVotos = 0;
    }

    public Candidato(String nombre) {
        this.nombre = nombre;
        this.numVotos = 0;
    }

    public void agregarVoto() {
        ++numVotos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumVotos() {
        return numVotos;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return nombre;
    }

}
