package basic6;

public class Stringg {
    static void main(String[] args) {
        String name = "Saurabh";
        String sameName = "Saurabh";
        String newName = new String("Saurabh");

//        if(name == sameName){
//            System.out.println("Both are same");
//        }
//
//        if(name == newName){
//            System.out.println("Both are same");
//        } else{
//            System.out.println("Both are not same");
//        }
//

        if(name.equals(newName)){
            System.out.println("Name and Newname have same values");
        }else{
            System.out.println("They are not same ");
        }


    }
}
