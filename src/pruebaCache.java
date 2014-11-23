
import Cache.DreamTeamCache;
import Modelo.Candidato;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.jcs.access.exception.CacheException;

public class pruebaCache {
    
    public static void main(String[] args) {
        DreamTeamCache cache = new DreamTeamCache();

        cache.configLoad();
        Candidato candidato = new Candidato(1, "Romario");
        cache.put(candidato.getId(), candidato);
        
        System.out.println("Candidato:"+candidato+"  Votos:"+candidato.getNumVotos());
        
    }
}
