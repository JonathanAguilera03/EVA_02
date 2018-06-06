
import java.util.ArrayList;
import java.util.Iterator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jonathan Aguilera
 */
public class EVA2_11_COLLECTIONS_ARRAYLIST {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Integer> alsMiArregloDin = new ArrayList();
        alsMiArregloDin.add(10);
        alsMiArregloDin.add(20);
        alsMiArregloDin.add(30);
        alsMiArregloDin.add(40);
        //PUEDEN RECORRER EL COLLECTION CON UN FOR O FOR-EACH
        for (int i = 0;  i< alsMiArregloDin.size() ; i++) {
            System.out.print(alsMiArregloDin.get(i)+" - ");
        }
        System.out.println("");
        
        for (Integer integer : alsMiArregloDin) {
            System.out.print(integer +" - ");
        }
        System.out.println("");
       
        //ITERATORES
            for (Iterator<Integer> iterator = alsMiArregloDin.iterator(); iterator.hasNext();) {
            Integer next = iterator.next();
                System.out.print(next + " - ");
        }
        System.out.println("");
            
        Iterator itMiIterator= alsMiArregloDin.iterator();
        while(itMiIterator.hasNext()){
            System.out.print(itMiIterator.next()+" - ");
        
        }
        System.out.println("");
            alsMiArregloDin.remove(0);
             for (Integer integer : alsMiArregloDin) {
            System.out.print(integer +" - ");
        }
        System.out.println("");
        
        
        }
    
    }
    

