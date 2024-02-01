package application;

import entities.Rent;

import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

public class ProgramVet {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Rent[] vect = new Rent [10];

        System.out.println("How many rooms will be rented? ");
        int n = sc.nextInt();

        Rent r = new Rent("Maria","maria@gmail.com");
        System.out.println();

        for (int i = 1; i<=n; i++){
            System.out.println();
            System.out.println("Rent #" + i + ":");
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.next();
            System.out.println("Room: ");
            int roomNumber = sc.nextInt();

            vect[roomNumber] = new Rent(name, email);
        }

        System.out.println();
        System.out.println("Bussy rooms: ");
        for (int i = 0; i < 10; i++) {
            if (vect[i] != null) {
                System.out.println(i + ": " + vect[i]);
            }
        }

        sc.close();
    }
}
