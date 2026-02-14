import java.util.LinkedList;
public class Classroom{
 public static void main(String[] args) {
     LinkedList<Integer> ll = new LinkedList<>();
     //add
     ll.addLast(1);
     ll.addLast(2);
     ll.addFirst(0);
     
     //remove
     ll.removeLast();

     System.out.println(ll);
     
     

 }
}
