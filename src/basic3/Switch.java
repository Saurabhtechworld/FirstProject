package basic3;

import java.util.Scanner;

public class Switch {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the day");
        int day = sc.nextInt();

        switch(day){
            case 1:
                System.out.println("Today is Sunday");
                break;

            case 2:
                System.out.println("Today is Monday");
                break;

            case 3:
                System.out.println("Today is tuesday");
                break;

            default:
                System.out.println("Wrong enter");
        }
    }
}
