package basic3;

public class conditionalStm {
    static void main(String[] args) {

//        int age = 4;
//        if(age >= 18) {
//            System.out.println("You can vote");
//        }else{
//            System.out.println("You can not vote");
//        }

//         ELSE IF

//        int day = 3;
//        if(day == 1){
//            System.out.println("Go to home");
//        } else if(day == 2){
//            System.out.println("Go to the village");
//        }else if(day == 3){
//            System.out.println("Go to the Party");
//        }else{
//            System.out.println("Go to office");
//        }

//        Your given three number , find the maximum number

//        int a = 2;
//        int b = 8;
//        int c = 6;
//
//        if(a>b){
//            System.out.println("a is bigger then b");
//            if(a>c){
//                System.out.println("a is bigger than c");
//                System.out.println("a is largest "+ a);
//            } else{
//                System.out.println("c is bigger then a");
//                System.out.println("c is largest "+ c);
//            }
//        } else {
//            System.out.println("b is bigger than a");
//            if(b > c){
//                System.out.println("b is bigger then c");
//                System.out.println("b is largest "+ b);
//            } else{
//                System.out.println("c is bigger then b");
//                System.out.println("c is larger " + c);
//            }
//        }

//        AND OR OPERATOR

        int time = 13;

//        if(time == 12 || time == 18) {
//            System.out.println("Time for snacks");
//        } else {
//            System.out.println("Time to work");
//        }

        if(time >= 10 && time <= 20){
            System.out.println("Office is open");
        }else {
            System.out.println("Time to work");
        }

    }
}
