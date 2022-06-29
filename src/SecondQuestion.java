
package project;

import java.util.Scanner;

public class SecondQuestion {

    public static void main(String[] args) {
        int value, anterior = 0, atual = 1;

        Scanner read = new Scanner(System.in);
        value = read.nextInt();

        while (atual < value - 1) {

            anterior += atual;
            atual += anterior;

        }

        if (value == 0 || atual == value) {
            System.out.println("\nPertence sim a frequencia");
        } else {
            System.out.println("\nNao pertence a frequencia");
        }
    }

}
