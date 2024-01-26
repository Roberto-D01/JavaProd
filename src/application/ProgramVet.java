package application;

import entities.Rent;

import java.util.Locale;
import java.util.Scanner;

public class ProgramVet {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("How many rooms will be rented? ");
        Rent r = new Rent("Maria","maria@gmail.com");

        sc.close();
    }
}
