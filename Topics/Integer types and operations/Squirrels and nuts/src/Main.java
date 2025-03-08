import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int sum = 0;
        int squirrels = scanner.nextInt();
        int nuts = scanner.nextInt();

        sum = nuts % squirrels;

        System.out.println(sum);
    }
}