package Controlador;

import Modelo.AdminVotos;
import Modelo.Candidato;
import Vista.VentanaPrincipal;
import java.util.ArrayList;

public class ControladorVotos extends Controlador{
    
    private String nombre = this.getClass().getName();
    VentanaPrincipal ventanaPrincipal = new VentanaPrincipal(this);

    public ControladorVotos(AdminVotos modelo, int idEvento) {      
        super(modelo, idEvento);
    }


    public void realizarVotacion(int id) {
        ((AdminVotos)super.getModelo()).agregarVoto(id);
    }
    
    public void desplegarVentana(){
        ventanaPrincipal.inicializaVentana(modelo.obtenerElementosDeCache());
        ventanaPrincipal.setVisible(true);
    }
    
        @Override
    public void actualizar(Object o) {
        super.actualizar(o);
        desplegarVentana();
    }
}
