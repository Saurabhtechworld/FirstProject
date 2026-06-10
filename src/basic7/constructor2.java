package basic7;

//public class constructor2 {
//    static void main() {
//        Complex num1 = new Complex();
//        num1.print();
//    }
//}
//
//class Complex{
//    int a, b;
//
//    public Complex(){
//        a = 5;
//        b = 9;
//    }
//
//    void print(){
//        System.out.println(a+" + " +b+"i");





//   WITHOUT CONSTRUCTOR

//        class Student {
//            String name;
//            int age;
//        }
//    public class constructor2  {
//            static void main(String[] args) {
//                Student s1 = new Student();
//
//                s1.name = "Saurabh";  //yaha value manually set rni pad rhi hai
//                s1.age = 21;
//
//                System.out.println(s1.name);
//            }
//        }
//

//   WITH CONSTRUCTOR

//        class Student {
//            String name;
//            int age;
//
//           Student(){
//            s1.name = "Saurabh";
//            s1.age = 21;
//            }
//        }
//
//        public class constructor2  {
//            static void main(String[] args) {
//                Student s1 = new Student();
//
//
//                System.out.println(s1.name);
//                System.out.println(s1.age);
//            }
//        }


//   PARAMETRIZED CONSTRUCTOR
//   Agar har student ka naam alag ho

        class Student {
            String name;

            Student(String n){
                name = n;
            }
        }

        public class constructor2 {
            static void main(String[] args) {
                Student s1 = new Student("Saurabh");
                Student s2 = new Student("Saur");

                System.out.println(s1.name);
                System.out.println(s2.name);
            }
        }
