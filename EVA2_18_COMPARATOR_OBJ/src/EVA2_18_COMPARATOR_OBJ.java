
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

/**
 *
 * @author Jonathan Aguilera
 */
public class EVA2_18_COMPARATOR_OBJ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LinkedList<Persona> llDatosPersona = new LinkedList<>();
        llDatosPersona.add(new Persona("Antonio","Martinez",15));
        llDatosPersona.add(new Persona("Pedro","shong",17));
        llDatosPersona.add(new Persona("Juan","swat",17));
        llDatosPersona.add(new Persona("Hola","Que hace",85));
        llDatosPersona.add(new Persona());
        imprimeLista(llDatosPersona);
        //Comparator Apellido
        Comparator cmpApe = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                //Los Objeros son personas
                Persona per1, per2;
                per1 =(Persona)o1;
                per2 =(Persona)o2;
                //De cada persona recuperamos apellido
                String ape1, ape2;
                ape1=per1.getsApellido();
                ape2=per2.getsApellido();
                char c1, c2;
                c1=ape1.charAt(0);
                c2=ape2.charAt(0);
                /*
                o1 < o2   un numero menor a cero (-)
                o1 == o2   cero
                o1 > o2   un mayor menor a cero (+)
                
                */
                return c1-c2;
            }
        };
           System.out.println("////////////////////////////////////////////////////////");
        Collections.sort(llDatosPersona, cmpApe);
        imprimeLista(llDatosPersona);
        //Comparator Edad
                Comparator cmpEdad = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                //Los Objeros son personas
                Persona per1, per2;
                per1 =(Persona)o1;
                per2 =(Persona)o2;
                //De cada persona recuperamos apellido
                int Edad1, Edad2;
                Edad1=per1.getiEdad();
                Edad2=per2.getiEdad();
              
                /*
                o1 < o2   un numero menor a cero (-)
                o1 == o2   cero
                o1 > o2   un mayor menor a cero (+)
                
                */
                return Edad1-Edad2;
            }
        }; 
           System.out.println("////////////////////////////////////////////////////////");
        Collections.sort(llDatosPersona, cmpEdad);
        imprimeLista(llDatosPersona);
        //Tarea Comparato Apellido Edad

        
    }
    public static void imprimeLista(LinkedList<Persona> llLista){
    for (Persona persona : llLista) {
        System.out.println("Nombre: "+ persona.getsNombre());
        System.out.println("Apellido: "+ persona.getsApellido());
        System.out.println("Edad: "+ persona.getiEdad());
        System.out.println("----------------------------------------------------");
    }


}
 
}
   class Persona{
        private String sNombre;
        private String sApellido;
        private int iEdad;

        public Persona(String sNombre, String sApellido, int iEdad) {
            this.sNombre = sNombre;
            this.sApellido = sApellido;
            this.iEdad = iEdad;
        }

        public Persona() {
            this.sNombre = "Jonathan";
            this.sApellido = "Aguilera";
            this.iEdad = 19;            
            
        }

        public String getsNombre() {
            return sNombre;
        }

        public void setsNombre(String sNombre) {
            this.sNombre = sNombre;
        }

        public String getsApellido() {
            return sApellido;
        }

        public void setsApellido(String sApellido) {
            this.sApellido = sApellido;
        }

        public int getiEdad() {
            return iEdad;
        }

        public void setiEdad(int iEdad) {
            this.iEdad = iEdad;
        }
    
    }