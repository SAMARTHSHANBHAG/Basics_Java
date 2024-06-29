import java.sql.SQLOutput;
import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int num_one = sc.nextInt();

        System.out.println("Enter the second number");
        int num_two = sc.nextInt();

        int sum = num_one + num_two;


        System.out.println("The sum is:" +sum);







    }
}
