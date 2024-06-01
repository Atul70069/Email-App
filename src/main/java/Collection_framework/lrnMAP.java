package Collection_framework;

import java.util.HashMap;
import java.util.Map;

public class lrnMAP
{
    public static void main(String[] args) {
        Map<String,Integer> numbers= new HashMap<>();
        numbers.put("one",1);
        numbers.put("two",2);
        numbers.put("three",3);
        numbers.put("two",23);

        System.out.println(numbers);



    }
}
