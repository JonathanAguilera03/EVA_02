/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jonathan Aguilera
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] aiDatos = new int[300000000];
        for (int i = 0; i < aiDatos.length; i++) {
           aiDatos[i]=(int)(Math.random()*999+1);
            System.out.print(aiDatos[i]+", ");
        }
    }
    
}
