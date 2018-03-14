/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.POLab3;

/**
 *
 * @author Asia
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO 1.4, 1.7, 
        // TODO 2.2
        // TODO 3.3, 3.4
       
        
        System.out.println(silnia(8));
        System.out.println(silniaPentla(8));
    }

    public static void zadanie1_3() {
        int a = 6;
        int b = 4;

        int c = a & b;

        int d = a | b;

        System.out.println(c); // 4
        System.out.println(d); // 6
        if (a != 0 && b == 4) {
            System.out.println("Obie wartosci sa prawdziwe");
        }
    }

    public static void zadanie1_6() {
        int a = 5;
        int b = 3;
        //int c = a + b++;
        int d = (a++) + b;
        //System.out.println(c);
        System.out.println(d);
    }

    public static int silnia(int wartosc) {

        if (wartosc == 0) {
            return 1;
        } else {
            return wartosc * silnia(wartosc - 1);
        }
    }
    
    public static int silniaPentla(int wartosc){
        int wynik=1;
        for (int i = 1; i <= wartosc; i++) {
            wynik*=i;
        }
        return wynik;
    }
    
    public static int Fibb(int numerLiczby)
    {
        if (numerLiczby == 1 || numerLiczby == 2) {
            return 1;
        }
        return 0;
}
