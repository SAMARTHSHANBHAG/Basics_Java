public class LogicalOperators {
    public static void main(String[] args) {
        int p = 10, q = 15, r = 5;

//        Logical AND operator
        System.out.println((p < r) && (q > p));
        System.out.println((p > r) && (q > p));

        // Logical OR
        System.out.println((p < q) || (q ==r));

        // ! operator
        System.out.println(!(p == q));



    }
}
