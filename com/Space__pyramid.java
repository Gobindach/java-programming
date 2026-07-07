package com;
public class Space__pyramid {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {

            // Print spaces
            for (int s = 1; s <= 5 - i; s++) {
                System.out.print(" ");
            }

            // Print numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }

            // Move to next line
            System.out.println();
        }
    }
}