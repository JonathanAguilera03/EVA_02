
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;
import java.util.Stack;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jonathan Aguilera
 */
public class EVA2_14_COLLECTIONS_STACK {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Stack <Integer> stkPila = new Stack();
        stkPila.add(10);
        stkPila.add(20);
        stkPila.add(30);
        stkPila.add(40);
        System.out.println(stkPila.peek());
        System.out.println(stkPila.pop());
        System.out.println(stkPila.pop());
        
        Set <Integer> stConjunto = new LinkedHashSet();
        stConjunto.add(10);
        stConjunto.add(10);
        stConjunto.add(20);
        stConjunto.add(30);
        stConjunto.add(30);
        stConjunto.add(40);
        System.out.println(stConjunto);
    }
    
}
