package basic9.encapsulation;

import basic9.another.MainIn;
import basic9.another1.Person;

public class main {

    public static void printHello(){     //It is static method we can access it
        System.out.println("Hello");
    }

    public void printHii(){   //It is non ststic method
        System.out.println("Hello hii");
    }

    static {
        System.out.println("Called from the static ");  //Start from initially
    }


    static void main(String[] args) {

        main.printHello();
//        printHii();

        Person p1 = new Person();
        p1.setAge(-12);
//        System.out.println(p1.getAge());


        Person p2 = new Person();
        Person p3 = new Person();

//        Person.count = 50;

        System.out.println(Person.count);




    }
}
