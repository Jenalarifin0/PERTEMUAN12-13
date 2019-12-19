/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg08.variable;

/**
 *
 * @author Jenal Arifin
 */
public class Variable {

    private static String a;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         System.out.println("nilai a = " + a);

        a = ("20");
        System.out.println("nilai a baru = " + a);

        // kita akan membuat sebuah deklarasi
        int b; // deklarasi

        b = 7;

        System.out.println("nilai b = " + b);
    }
    
}
