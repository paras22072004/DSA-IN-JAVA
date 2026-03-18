import java.util.PriorityQueue;
import java.util.Comparator;
public class Main{
 public static void main(String[] args) {
     PriorityQueue <Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
         pq.add(3);
         pq.add(2);
         pq.add(4);
         pq.add(18);

       while(!pq.isEmpty()){
        System.out.println(pq.peek());
        pq.remove();
       }

 }
}