import java.util.Scanner;

public class ForLoops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        int sum = 0;

        for (int num = 1; num <= n; num++){
//            sum = sum + num;
            System.out.println(num);// Print sum for sum of n natural numbers
        }
    }
}
// for loop if we want to print 10 to 1 in reverse order
// for(int num = n; num >= 1; num--){
//     sout
//  }
