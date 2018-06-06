/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jonathan Aguilera
 */
public class PRINCIPAL {

    /**
     * @param args the command line arguments
     */static int lento=0;
     static int rapido=0;
    public static void main(String[] args) {
        // TODO code application logic here
        int iNum=4;
        if(esPrimoRapido(iNum)){
            System.out.println("El numero "+iNum+" Es primo");
        }else{
            System.out.println("El numero "+iNum+" No es primo");
        }
        if(esPrimoLento(iNum)){
            System.out.println("El numero "+iNum+" Es primo");
        }else{
            System.out.println("El numero "+iNum+" No es primo");
        }
        
    
    }
    public static boolean esPrimoLento(int iNum){
    boolean bBande=true;
    lento=0;
        for (int i = 2; i < iNum; i++) {
            int iResi=iNum%i;
            if(iResi == 0){//El numero no es primo
            bBande=false;
            }
            lento++;
        }
        System.out.println("lento= "+lento);
    return bBande;
    }
    public static boolean esPrimoRapido(int iNum){
    boolean bBande=true;    
    int iRaizEn=(int)Math.sqrt(iNum)+1;
    rapido=0;
        for (int i = 2; i < iRaizEn; i++) {
            int iResi=iNum%i;
            if(iResi == 0){//El numero no es primo
            bBande=false;
            }
            rapido++;
        }
        System.out.println("rapido= "+rapido);
    return bBande;
    }
}
