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
        hanoiTowers(3, "Startowy", "Buffor", "Koncowy");
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

    //zadanie 1.4
    //Domowe
    public static void zadanie1_4() {
        int a = 11, b = 3;
        //Przesuniecie prawe ze znakiem
        System.out.println(a >> b);
        //Przesunuecie lewe ze znakiem
        System.out.println(a << b);
        //Przesuniecie prawe bez znaku
        System.out.println(a >>> b);
        //Przesuniecie prawe bez znaku
        System.out.println(-a >>> b);
    }

    public static void zadanie1_6() {
        int a = 5;
        int b = 3;
        //int c = a + b++;
        int d = (a++) + b;
        //System.out.println(c);
        System.out.println(d);
    }

    public static void zadanie1_7() {
        //Opereator NOT i XOR uzyte w instrukcji warunkowej if
        Boolean falsz = false;
        int a = 11, b = 3;
        // !falsz zwraca true poniewaz ! zaprzecza zawartosc falsz(falsz = false, !falsz = true)
        if (!falsz) {
            System.out.println(a ^ b);//wypisze 8            
        }
        //! jest operatorem NOT a ^ oznacza bitowe XOR
        //a = 11(10) a = 1011(2)
        //b = 3(10) b = 0011(2)
        // 1011
        // 0011
        // ----
        // 1000
        // 1000(2) = 8(10)
    }

    //zadanie 2.2
    //Domowe
    public static void zadanie2_2() {
        String str1 = "To jest Napis do testow";
        char[] str1ToTab = str1.toCharArray();
        System.out.println(str1ToTab);
        String str2 = new String(str1.getBytes());
        System.out.println(str2);
        System.out.println(str1.equals(str2));
        str1 = str1.toUpperCase();
        str2 = str2.toLowerCase();
        System.out.println(str1.equalsIgnoreCase(str2));
        System.out.println(str1.indexOf("E"));
        System.out.println(str1.lastIndexOf("E"));
        System.out.println(str1.indexOf(69));//69 to E w ASCII
        System.out.println(str1.lastIndexOf(69));
        String str3 = str1.replace("T", "F");
        System.out.println(str3);
        System.out.println(str2.substring(4, 19));
        str3 = "Zdanie jeden.Zdanie dwa.";
        String[] tabOfString = str3.split("[.]");
        for (String string : tabOfString) {
            System.out.println(string);
        }
        str1 = "      Cos do obciecia      ";
        System.out.println(str1);
        System.out.println(str1.trim());
    }

    //silnia rekursyjnie jako metoda
    //Domowe
    public static int silnia(int wartosc) {

        if (wartosc == 0) {
            return 1;
        } else {
            return wartosc * silnia(wartosc - 1);
        }
    }

    //silnia iteracyjnie jako metoda
    //Domowe
    public static int silniaPentla(int wartosc) {
        int wynik = 1;
        for (int i = 1; i <= wartosc; i++) {
            wynik *= i;
        }
        return wynik;
    }

    //zadanie 3.4
    //Domowe
    public static int fibb(int numerLiczby) {
        if (numerLiczby == 1 || numerLiczby == 2) {
            return 1;
        } else {
            return fibb(numerLiczby - 1) + fibb(numerLiczby - 2);
        }
    }

    //wieze hanoi rekursywnie
    //Dodatkowe
    public static void hanoiTowers(int discCount, String A, String B, String C) {
        if (discCount > 0) {
            hanoiTowers(discCount - 1, A, C, B);
            System.out.println(A + " -> " + C);
            hanoiTowers(discCount - 1, B, A, C);
        }
    }

}
