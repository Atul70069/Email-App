package Collection_framework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class araylst {


    public static void main(String[] args) {


        List<Integer> list= new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        list.add(30);
        list.add(36);
        System.out.println(list);
        list.add(1,50);
        System.out.println(list);

        List<Integer> newList= new ArrayList<>();
        newList.add(500);
        newList.add(60025);

        list.addAll(newList);
        System.out.println(list);

        System.out.println(list.get(1));

        list.remove(2);
        System.out.println(list);
        list.remove(Integer.valueOf(60025));
        System.out.println(list);

        /*list.clear();
        System.out.println(list);
*/

        list.set(2,100);
        System.out.println(list);


        System.out.println(list.contains(50));

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("...******************........");
        for (Integer elemnt: list) {
            System.out.println(elemnt);
        }

        Iterator<Integer> it =list.iterator();
        while (it.hasNext())
        {
            System.out.println("iterator=:"+ it.next());
        }







    }
}
