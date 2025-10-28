package exercise4;

import exercise3.Car;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("Enea", "Lagler", 364736457, 4000, 2500);

        boolean schalter = true;

        while (schalter) {


            System.out.println("1: Alle Informationen ausgeben");
            System.out.println("2: Einzahlen");
            System.out.println("3: Auszahlen");
            System.out.println("4: Balance ausgeben");

            Scanner sc = new Scanner(System.in);
            int eingabe = sc.nextInt();

            if (eingabe == 1) {
                System.out.println(bankAccount);
            } else if (eingabe == 2) {
                System.out.println("Wie viel wollen Sie einzahlen?");
                int eingaeben = sc.nextInt();
                bankAccount.deposit(eingaeben);
            } else if (eingabe == 3) {
                System.out.println("Wie viel wollen Sie auszahlen?");
                int eingaeben = sc.nextInt();
                bankAccount.withdraw(eingaeben);
            } else if (eingabe == 4) {
                bankAccount.printBalance();
            }
        }

    }
}
