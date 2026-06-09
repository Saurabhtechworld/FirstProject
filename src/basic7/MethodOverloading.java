package basic7;

public class MethodOverloading {
    static void main(String[] args) {
        Greet obj = new Greet();
        obj.greetings();
        obj.greetings("saurabh");
    }
}

class Greet {

    void greetings(){
        System.out.println("Hello, good Morning");
    }

    void greetings(String name){
        System.out.println("Hello "+name+", Good Moring");
    }
}
