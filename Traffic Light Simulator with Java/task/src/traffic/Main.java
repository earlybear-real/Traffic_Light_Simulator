package traffic;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int numOfRoads = 0;
        int numOfIntervals = 0;
        int selectedOption = 0;
        boolean running = true;
        Scanner sc1 = new Scanner(System.in);

        System.out.println("Welcome to the traffic management system!");
        System.out.print("Input the number of roads: > ");
        numOfRoads = sc1.nextInt();
        System.out.print("Input the interval: > ");
        numOfIntervals = sc1.nextInt();
        while (running) {
            System.out.println("Menu:");
            System.out.println("1. Add");
            System.out.println("2. Delete");
            System.out.println("3. System");
            System.out.println("0. Quit");

            selectedOption = sc1.nextInt();

            switch (selectedOption) {
                case 1:
                    System.out.println("Road added");
                    break;
                case 2:
                    System.out.println("Road deleted");
                    break;
                case 3:
                    System.out.println("System opened");
                    break;
                case 0:
                    System.out.println("Bye!");
                    running = false;
                    break;
                default:
                    System.out.println("Wrong input!");
                    break;
            }
        }
    }
}
