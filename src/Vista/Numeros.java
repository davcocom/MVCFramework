package Vista;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import Modelo.Candidato;
import Modelo.Modelo;
import java.util.ArrayList;


/**
 *
 * @author Carlos
 */
public class Numeros extends Vista {

    private VentanaNumeros vn;
    private VentanaTabla vt=new VentanaTabla();
    private ArrayList<Candidato> candidatos;

    public Numeros(Modelo modelo, int idEvento) {
        super(modelo, idEvento);
        vn = new VentanaNumeros();
    }

    @Override
    public void actualizar(Object o) {
        super.actualizar(o);
        this.candidatos = (ArrayList<Candidato>) o;
        activar();
    }

    @Override
    public void desplegar() {

    }

    @Override
    public void activar() {
        //vn.init(candidatos);
        //vn.setVisible(true);
        vt.llenaTabla(candidatos);
        vt.setVisible(true);
    }
}
