public class ContinueKeyword {
    public static void main(String[] args) {
        for(int num = 1; num <= 20; num++){
            if (num % 3 ==0){
                continue;
            }
            System.out.println(num);
        }
    }
}
//using while loop
//        int num = 1;
//        while (num <= 20) {
//            if (num % 3 == 0) {
//                num++;
//                continue;
//            }
//            System.out.println(num);
//            num++;
//        }
//    }
//
//}

