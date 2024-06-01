package Collection_framework;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class lrnPRIORITYQueue {

 public static void main(String[] args) {


  PriorityQueue<Integer> pq= new PriorityQueue<>(Comparator.reverseOrder());

  pq.offer(12);
  pq.offer(15);
  pq.offer(18);
  pq.offer(129);
  System.out.println(pq);


  pq.poll();
  System.out.println(pq);



 }
}
