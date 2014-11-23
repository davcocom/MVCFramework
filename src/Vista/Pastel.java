package Vista;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Modelo.Candidato;
import Modelo.Modelo;
import java.util.ArrayList;


/**
 *
 * @author a09001005
 */
public class Pastel extends Vista{
    private final GraficaPastel graficaPastel;
    private ArrayList<Candidato> candidatos;
    
    public Pastel(Modelo modelo, int idEvento) {
        super(modelo, idEvento);
        this.candidatos= modelo.obtenerElementosDeCache();
        graficaPastel=new GraficaPastel();
    }

    @Override
    public void actualizar(Object datos) {
        super.actualizar(datos);
        this.candidatos= (ArrayList<Candidato>) datos;
        activar();
    }

    @Override
    public void desplegar(){
    }


    @Override
    public void activar() {
        graficaPastel.init(this.candidatos);
        graficaPastel.setVisible(true);
    }

    
}
