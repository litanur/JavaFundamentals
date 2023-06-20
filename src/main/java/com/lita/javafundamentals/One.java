package com.lita.javafundamentals;

public class One {
    public static void main (String args[]) {
        System.out.println("Soal : \na. Bila angka merupakan kelipatan 3, maka cetak BIZZ\n" +
                "b. Bila angka merupakan kelipatan 5, maka cetak BUZZ\n" +
                "c. Bila angka merupakan kelipatan 3 dan 5, maka cetak BIZZBUZZ\n");

        System.out.println("Output program :");
        for (int i = 1; i <= 100 ; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                System.out.println(i + " : " + "BIZZBUZZ");
            } else if (i % 3 == 0) {
                System.out.println(i + " : " + "BIZZ");
            } else if ((i % 5 == 0)) {
                System.out.println(i + " : " + "BUZZ");
            }
        }
    }
}
