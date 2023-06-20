package com.lita.javafundamentals;

public class Two {
    public static void main (String args[]) {
        int x = 9;
        int y = 5;
        for (int i = 1; i <= y; i++) {
            for (int j = i; j <= x; j++) {
                if (j % 2 == 0) {
                    System.out.print("_");
                } else {
                    System.out.print(j);
                }
            }
            x--;
            System.out.println();
        }
    }
}
