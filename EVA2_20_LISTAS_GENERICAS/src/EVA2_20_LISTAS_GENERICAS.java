
import java.util.ArrayList;
/**
 *
 * @author Jonathan Aguilera
 */
public class EVA2_20_LISTAS_GENERICAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //TIPOS DE DATOS GENÉRICOS:
        ArrayList <String> listaEnteros=new ArrayList();
        listaEnteros.add("Hola");
        
        GuardaeAlgo <Integer> objGuardar= new GuardaeAlgo();
        objGuardar.setCade(100);
        System.out.println("El valor es: "+objGuardar.getCade());
    }
    
}

class GuardaeAlgo <T> {
    private T cade;
    public T getCade() {
        return cade;
    }

    public void setCade(T cade) {
        this.cade = cade;
    }

    public GuardaeAlgo() {
    }

    public GuardaeAlgo(T cade) {
        this.cade = cade;
    }
}