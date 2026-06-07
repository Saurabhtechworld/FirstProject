package basic5;

public class mathfun {
    public static void main() {
//        int a = 4;
//        int b = 3;
//        System.out.println(Math.min(a,b));
//        System.out.println(Math.sqrt(13));
//        System.out.println(Math.pow(3,4));
//        System.out.println(Math.abs(-3));
//        System.out.println(getRandom(10, 20));
//        System.out.println(Math.floor(5.1));
//        System.out.println(Math.ceil(5.1));
        System.out.println(Math.round(5.1));
    }

    public static int getRandom(int a, int b) {
        return (int) (Math.random()*(b-a+1)+a);
//        return (int) (Math.random()*6)+1;
    }
}
