package basic9.another1;

public class Person {

    public static int count = 12;

    public Person(){
        count++;
    }

    private int age;

    private String name;

    boolean canBeChanged = true;


    public void setAge(int age) {
        if(canBeChanged) {
            if (age > 0) {
                this.age = age;
            }
        }
}

    boolean canBeAccessed = false;

public int getAge(){
    if(canBeAccessed) return age;
    return -1;
    }
}
