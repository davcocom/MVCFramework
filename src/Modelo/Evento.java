package Modelo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;

/**
 *
 * @author vaio
 */
public class Evento {
    protected ArrayList<Observer> miembros;
    protected int idEvento;
    protected String nombreEvento;

    public Evento(int idEvento) {
        this.miembros=new ArrayList();
        this.idEvento=idEvento;
    }
    

    public void agregarMiembro(Observer miembro){
        miembros.add(miembro);
    }
    
    public void eliminarMiembro(Observer miembro){
        miembros.remove(miembro);
    }
    
    /**
     * @return the miembros
     */
    public ArrayList<Observer> getMiembros() {
        return miembros;
    }

    /**
     * @return the idEvento
     */
    public int getIdEvento() {
        return idEvento;
    }

    /**
     * @param miembros the miembros to set
     */
    public void setMiembros(ArrayList<Observer> miembros) {
        this.miembros = miembros;
    }

    /**
     * @param idEvento the idEvento to set
     */
    public void setIdEvento(int idEvento) {
        this.idEvento = idEvento;
    }

    /**
     * @return the nombreEvento
     */
    public String getNombreEvento() {
        return nombreEvento;
    }

    /**
     * @param nombreEvento the nombreEvento to set
     */
    public void setNombreEvento(String nombreEvento) {
        this.nombreEvento = nombreEvento;
    }
    
    
    
}
