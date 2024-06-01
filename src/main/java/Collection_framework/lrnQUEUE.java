package Collection_framework;

import java.util.LinkedList;
import java.util.Queue;

public class lrnQUEUE {

    public static void main(String[] args) {

        Queue<Integer> queue= new LinkedList<>();

        queue.offer(12);
        queue.offer(16);
        queue.offer(13);
        queue.offer(122);
        queue.offer(1);
        queue.offer(32);
        queue.offer(122);
        queue.offer(1266);

        System.out.println(queue);

        System.out.println(queue.poll());
        System.out.println(queue);

        System.out.println(queue.peek());









    }
}
