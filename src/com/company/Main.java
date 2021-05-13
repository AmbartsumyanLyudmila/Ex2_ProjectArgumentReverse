package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println("Now: 1 2 3 4 5 6 7 8 9");
        System.out.print("Reverse:");
        for (int i = args.length - 1; i >= 0; i--) {

            System.out.print(" "+args[i]);
        }
    }
}
