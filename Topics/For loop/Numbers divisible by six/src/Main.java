import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int numElements = scanner.nextInt();
        int sumElementsDivBy6 = 0;
        for (int i = 0; i < numElements; i++) {
            int element = scanner.nextInt();
            if (element % 6 == 0) {
                sumElementsDivBy6 += element;
            }
        }

        System.out.println(sumElementsDivBy6);
    }
}