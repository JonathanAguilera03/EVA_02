/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_4_recursividad_for;

/**
 *
 * @author Jonathan Aguilera
 */
public class EVA2_4_RECURSIVIDAD_FOR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        forRec(5);
        forRecA(5);
    }
    public static void forRec(int iNum){
        System.out.println(iNum+" - ");
        if(iNum>1)
        forRec(iNum-1);
        System.out.println("Terminado");
    }
    
    public static void forRecA(int num){
        int x;
        System.out.println();
        
    }
}
