import java.util.ArrayList;

public class MainArray {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<String>();
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Pears");
        fruits.add("Orange");
        fruits.add("Mango");
        fruits.add("PineApple");

       // fruits.remove(4);
        fruits.set(0,"Dragon");
        //fruits.clear();

        System.out.println(fruits.size());


        System.out.println(fruits);




    }
}
