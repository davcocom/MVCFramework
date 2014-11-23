package Vista;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import Controlador.Controlador;
import Modelo.Candidato;
import Modelo.Modelo;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JPanel;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author Carlos
 */
public class Barras extends Vista{
    private ArrayList<Candidato> candidatos;
    private final GraficaBarras graficaBarras;
    
    public Barras(Modelo modelo,int idEvento) {
        super(modelo,idEvento);
        this.candidatos= new ArrayList();
        this.graficaBarras=new GraficaBarras();
    }

    @Override
    public void actualizar(Object datos) {
        super.actualizar(datos);
        this.candidatos= (ArrayList<Candidato>) datos;
        desplegar();
        activar();
    }

    @Override
    public void desplegar(){
        System.out.println("Barras candidatos: "+candidatos.size());
        for (Candidato candidato : candidatos) {
            System.out.println(candidato.getNombre());
        }
    }


    @Override
    public void activar() {       
        graficaBarras.init(candidatos);
        graficaBarras.setVisible(true);      
    }
}
