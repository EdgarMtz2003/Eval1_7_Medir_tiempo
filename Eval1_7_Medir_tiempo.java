/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author moviles
 */
public class Eval1_7_Medir_tiempo {
    public static void main(String[]args){
        
        int []datos=new int[100000000];
        long ini = System.nanoTime();
        
        for (int i = 0; i < datos.length; i++) {
            datos[i]=100;
                     
        }       
        long fin=System.nanoTime();
        long tiempo=fin-ini;
        System.out.println(tiempo);
    }
}
