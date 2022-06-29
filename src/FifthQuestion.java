package project;

import java.util.Scanner;

public class FifthQuestion {

    public static void main(String[] args) {
        String frase;

        Scanner read = new Scanner(System.in);
        frase = read.nextLine();
        int tam_string = frase.length();
        char[] code = new char[tam_string];
        char[] inverse = new char[tam_string];
        for (int i = 0; i < tam_string; i++) {
            code[i] = frase.charAt(i);
        }
        for (int i=0;i<tam_string;i++){
            inverse[i] = code[tam_string - 1 - i];
        }
        String reverseWord = new String(inverse);
        System.out.println(reverseWord);
    }
}
