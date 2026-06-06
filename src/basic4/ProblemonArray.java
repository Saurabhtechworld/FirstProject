package basic4;

public class ProblemonArray {
    static void main(String[] args) {
//        USING FOR EACH LOOP

//        int numbers[] = {23,12,6,5,13,5};
//
//        int sum = 0;

//        for(int number: numbers){
//            sum += number;
//        }
//        System.out.println("Sum is "+ sum);



//        USING FOR LOOP
//        for (int i = 0; i < numbers.length; i++) {
//            sum = sum + numbers[i];
//        }
//        System.out.println("Sum "+ sum);


//        FIND MINIMUM

//        int numbers[] = {23,12,6,5,13,5};
//      int min = Integer.MAX_VALUE;
//
//      for(int number: numbers){
//          if(number < min){
//              min = number;
//          }
//      }
//        System.out.println("Sum is "+ min);


//        USING FOR LOOP

//        int numbers[] = {23,12,6,5,13,5};
//
//        int min = numbers[0];
//
//        for(int i = 1; i<numbers.length; i++){
//            if(numbers[i] < min){
//                min = numbers[i];
//            }
//        }


//        MAXIMUM

        int numbers[] = {23, 12, 6, 5, 33, 5};

        int max = numbers[0];

        for (int num : numbers) {
            if (num > max) {
                max = num;
            }
        }

        System.out.println("Maximum number is: " + max);

    }
}
