package Collection_framework;

import java.util.Stack;

public class lrnSTACK {
    public static void main(String[] args) {

        Stack<String> animals= new Stack<>();
        animals.push("LION");
        animals.push("King");
        animals.push("name");
        animals.push("atul");
        animals.push("aman");
        animals.push("ayush");
        System.out.println("stack= "+animals);

        System.out.println(animals.peek());
        animals.pop();
        System.out.println(animals.peek());
        System.out.println("stack= "+animals);






    }
}
