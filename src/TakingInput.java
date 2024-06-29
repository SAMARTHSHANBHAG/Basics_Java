import java.util.Scanner;

public class TakingInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a number");
//        int num_one = sc.nextInt();
//
//        System.out.println("Entered lucky number is " + num_one);
//
//
//        System.out.println("Enter your name:");
//        String name = sc.next();
//        System.out.println("Hello there, " + name);

        System.out.println("Enter your name:");
        String name = sc.nextLine();
        System.out.println("Hello there, " + name);

    }
}
