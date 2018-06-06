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
        System.out.println("Factorial de 6 = " + calcularFactorial(6));
        System.out.println("Sumatoria de 6 = " + calcularSumatoria(6));
                
    }
    public static int calcularFactorial(int iVal){
        if(iVal==0){
            return 1;
        }else{
            return iVal * calcularFactorial(iVal-1);
        }
    }
    
    public static int calcularSumatoria(int iVal){
        if(iVal==1){
            return 1;
        }else{
            return iVal + calcularSumatoria(iVal-1);
        }
    }
    
    
    
}
