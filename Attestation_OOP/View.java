package Attestation_OOP;

import java.util.Scanner;

public class View {
    Scanner in = new Scanner(System.in);


    public int getValue(String tittle){
        System.out.printf("%s: ", tittle);
        return in.nextInt();
    }
    public void print(int data, String tittle){
        System.out.printf("%s, %d\n", tittle, data);
    }
}
