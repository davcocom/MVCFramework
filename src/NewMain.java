

import Controlador.*;
import Modelo.*;
import Vista.*;

public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        AdminVotos admin= new AdminVotos();
        ControladorVotos entrada=new ControladorVotos(admin, 0);
        Barras b=new Barras(admin,0);
        Pastel p=new Pastel(admin,0);
        Numeros v=new Numeros(admin,0);
        
        entrada.desplegarVentana();

    }
    
}
