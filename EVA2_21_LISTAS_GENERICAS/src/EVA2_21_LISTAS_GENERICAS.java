/**
 *
 * @author Jonathan Aguilera
 */
public class EVA2_21_LISTAS_GENERICAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ListaDoble <String> ldMiLista = new ListaDoble("Hola mundo cruel");
        ListaDoble <Integer> ldMiLista2 = new ListaDoble(15648);
    }
    
}
class Nodo <T> {
    //Atributos: 1. dato a almacenar 2. Enlace al siguiente o anterior nodo
    private T iDato;
    private Nodo nSig;
    private Nodo nPrev;

    public Nodo() {
        this.nSig = null;
        this.nPrev=null;
    }

    public Nodo(Nodo nPrev) {
        this.nPrev = nPrev;
    }

    public Nodo(T iDato) {
        this.iDato = iDato;
        this.nSig = null;
        this.nPrev=null;
    }

    public Nodo(T iDato, Nodo nSig, Nodo nPrev) {
        this.iDato = iDato;
        this.nSig = nSig;
        this.nPrev=null;
    }

    public void setnSig(Nodo nSig) {
        this.nSig = nSig;
    }

    public Nodo getnSig() {
        return nSig;
    }

    public T getiDato() {
        return iDato;
    }

    public Nodo getnPrev() {
        return nPrev;
    }

    public void setnPrev(Nodo nPrev) {
        this.nPrev = nPrev;
    }

    public void setiDato(T iDato) {
        this.iDato = iDato;
    }
    
    
}
class ListaDoble <T> {
    private Nodo nIni;
    private Nodo nFin;
    private int iCount;

    public ListaDoble(T Valor) {
        Nodo <T> nNodo = new Nodo (Valor);
        this.nIni = nNodo;
        this.nFin = nNodo;
        
    }

    public ListaDoble() {
        this.nIni = null;
        this.nFin = null;
    }
    
    public void add(Nodo nNodo){
         if (nIni == null) {//la lista esta vacia
            nIni = nNodo;
            nFin = nNodo;

        } else {//la lista tiene elementos
            //hay que overnos al final de la lista

            nFin.setnSig(nNodo);
            
            nFin = nNodo;
         }
    }
}