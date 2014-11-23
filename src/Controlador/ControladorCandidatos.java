package Controlador;

import Modelo.AdminVotos;
import Modelo.Modelo;

public class ControladorCandidatos extends Controlador {

    private String nombre = this.getClass().getName();

    public ControladorCandidatos(Modelo modelo, int idEvento) {
        super(modelo, idEvento);
    }

    public void agregarCandidato(int id, String nombreCandidato) {
        ((AdminVotos) super.getModelo()).agregarCandidatos(id, nombreCandidato);
    }

    public void eliminarCandidato(String candidato) {
        ((AdminVotos) super.getModelo()).eliminarCandidatos(candidato, this.nombre);
    }

}
