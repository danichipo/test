/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parooimpar;

import java.util.Scanner;

/**
 *
 * @author Vero-
 */
public class ParooImpar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        int a;
        System.out.println("Escriba el valor de a:");
        a=sc.nextInt();
        
        if(a%a==0){
            System.out.println(a+" es primo");
        }
        else{
            System.out.println(a+" no es primo");
        }
        
    }
    
}
