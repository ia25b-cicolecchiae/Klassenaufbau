package finalExercise;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Company company = new Company("Beccarch", "KTV Strasse 67", 100, 5);

        boolean schalter = true;

        while (schalter){



        System.out.println("1: add room");
        System.out.println("2: search room");
        System.out.println("3: free rooms");
        System.out.println("4: book room");
        System.out.println("5: System beenden");

        Scanner input = new Scanner(System.in);
        int eingabe = input.nextInt();

        if(eingabe == 1){
            company.addRoom(5);
            company.addRoom(10);
            company.addRoom(5);
        } else if(eingabe == 2){
            company.searchRoom(5);
        } else if(eingabe == 3){
            company.freeRooms();
        } else if (eingabe == 4){
            company.bookRoom(2);
        } else if(eingabe == 5){
            System.out.println("System wird beendet...");
            schalter = false;
            System.exit(0);
        }
        }


        //System.out.println(company);
        System.out.println(company.rooms);
    }


}
