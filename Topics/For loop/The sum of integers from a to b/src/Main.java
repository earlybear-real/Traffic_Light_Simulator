import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int sum = 0;

        for (int i = a; i < b + 1; i++){
            sum += i;
        }

        System.out.println(sum);
        scanner.close();
    }
}