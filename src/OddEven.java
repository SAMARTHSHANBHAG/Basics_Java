import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println("It is an even number");
        } else {
            System.out.println("It is an odd number");

            //Use of ternary operator for odd-even
//            String ans;
//            ans = (num % 2 == 0) ? "Even" : "Odd";
//            System.out.println(ans);

        }
    }
}
