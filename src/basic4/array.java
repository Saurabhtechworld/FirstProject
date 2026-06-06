package basic4;

public class array {
    static void main(String[] args) {
//        int marks[] = {98, 12, 45, 12, 93};
//        System.out.println(marks[3]);

        String names[] = {"Ram","Shyam","Saurabh","Anuj"};
//        for(int i=0; i < names.length; i++){
//            System.out.println("Name is "+ names[i]);
//        }

        for(String name: names) {
            System.out.println(name);
        }

    }
}
