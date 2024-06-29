import java.util.Scanner;
//Sum of n natural numbers
public class WhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sum = 0;
        int num = 1;

        while (num <= n){
//            System.out.println(num); code to print n natural number(ignore the next 2 lines of this code)
            sum = sum + num;
            num ++;

        }
        System.out.println(sum);
    }
}
