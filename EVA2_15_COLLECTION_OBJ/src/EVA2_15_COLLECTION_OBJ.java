
import java.util.LinkedList;
/**
 *
 * @author Jonathan Aguilera
 */
public class EVA2_15_COLLECTION_OBJ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LinkedList <Simple> llListaObjetos = new LinkedList();
        llListaObjetos.add(new Simple());
        llListaObjetos.add(new Simple());
        llListaObjetos.add(new Simple());
        llListaObjetos.add(new Simple());
    }

}
    class Simple{
public int iVal;
}