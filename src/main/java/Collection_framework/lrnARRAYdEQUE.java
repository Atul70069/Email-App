package Collection_framework;

import java.util.ArrayDeque;

public class lrnARRAYdEQUE {

    public static void main(String[] args) {

        ArrayDeque<Integer> dq= new ArrayDeque<>();

        dq.offer(12);
        dq.offer(16);
        dq.offer(15);
        dq.offerFirst(25);
        dq.offerLast(65);

        System.out.println(dq);


        System.out.println("////////////////////");  ////////////////////

        System.out.println(dq);

        System.out.println(dq.peek());
        System.out.println(dq.peekFirst());
        System.out.println(dq.peekLast());

        System.out.println(dq.poll());
        System.out.println("after poll"+dq);

        System.out.println(dq.pollFirst());
        System.out.println("after poll first"+dq);

        System.out.println(dq.pollLast());
        System.out.println("poll last "+dq);
























    }
}
