package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArithmeticProgression t = new ArithmeticProgression(4, 7);
        System.out.println(t.getNumber(1));
    }
}