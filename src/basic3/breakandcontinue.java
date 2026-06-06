package basic3;

public class breakandcontinue {
    static void main(String[] args) {
//  BREAK
//        int i=0;
//        while(i<=5){
//            System.out.println(i);
//            i++;
//            if(i == 3) break;
//        }

//  CONTINUE

//        for (int j = 0; j <= 10; j++) {
//            if(j == 2 || j == 5 || j>=5) continue;
//            System.out.println("gave toffee to"+ j);
//        }

//   NESTED LOOP

//        for (int i = 0; i < 5; i++) {
//            for (int j = 0; j < i; j++) {
//                System.out.print(j+" ");
//            }
//            System.out.println();
//        }

        for (int i = 0; i < 10; i++) {
            int j = 0;
            while(j <= 5){
                System.out.print(j+" ");
                j++;
            }
            System.out.println();
        }
    }
}
