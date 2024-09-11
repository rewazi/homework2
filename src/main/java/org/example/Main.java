package org.example;

import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("введите температуру по цельсию");
        int n = scanner.nextInt();
        double x=9.0*n/5+32 ;
        System.out.printf("градусов по фарингейту %.1f%n",x );

    }
}




