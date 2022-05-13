package ticket;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        //Constructor, constant value
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Your start station?(1: Taipei, 2: Taichung, 3: Kaohsiung)");
//        int startChoice=Integer.parseInt(scanner.next());
//        Station start = null;
//        switch (startChoice){
//            case 1:
//                start = Station.TAIPEI_STATION;
//                break;
//            case 2:
//                start = Station.TAICHUNG_STATION;
//            case 3:
//                start = Station.KAOHSIUNG_STATION;
//        }
//        Scanner scanner2 = new Scanner(System.in);
//        System.out.println("You destination station?[1]Taipei, [2]Taichung, [3]KAOHSIUNG");
//        Station destination=null;
//        int destinationChoice=Integer.parseInt(scanner2.next());
//        switch (destinationChoice){
//            case 1:
//                destination= Station.TAIPEI_STATION;
//                break;
//            case 2:
//                destination= Station.TAICHUNG_STATION;
//                break;
//            case 3:
//                destination= Station.KAOHSIUNG_STATION;
//                break;
//        }


        Scanner scanner = new Scanner(System.in);
        System.out.println("Your start station?(1: Taipei, 2: Taichung, 3: Kaohsiung)");
        int choice = Integer.parseInt(scanner.next());
        Station start = null;
        switch (choice) {
            case 1:
                start = Station.TAIPEI_STATION;
                break;
            case 2:
                start = Station.TAICHUNG_STATION;
                break;
            case 3:
                start = Station.KAOHSIUNG_STATION;
                break;
        }
        System.out.println("Your destination station?(1: Taipei, 2: Taichung, 3: Kaohsiung)");
        choice = Integer.parseInt(scanner.next());
        Station destination = null;
        switch (choice) {
            case 1:
                destination = Station.TAIPEI_STATION;
                break;
            case 2:
                destination = Station.TAICHUNG_STATION;
                break;
            case 3:
                destination = Station.KAOHSIUNG_STATION;
                break;
        }
        Ticket ticket = new Ticket(start, destination);
        ticket.print();
        System.out.println("Which kind of ticket? 1)Normal Ticket 2)Student ticket 3)Elder ticket");
        int Ticket = Integer.parseInt(scanner.next());

    }
}

