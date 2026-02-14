public class Double{
    public class Node{
      int data;
      Node next;
      Node prev;

    public  Node(int data){
        this.data = data;
        this.next= null;
        this.prev= null;
    }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    //print 
    public static void print(){
        Node temp = head;

        while(temp!=null ){
            System.out.print(temp.data);
            if(temp.next!=null){
                System.out.print("<->");
            }
            temp = temp.next;
        }
        System.out.println();
    }
     
    // add first
    public void addFirst(int data){
        size++;
        Node newnode = new Node(data);
        if(head ==null){
            head = tail = newnode;
            return;
        }
        newnode.next = head;
        head.prev= newnode;
        head = newnode; 

    }
 
     //remove first
     public void removeFirst() {
        if (size == 0) {
            System.out.println("empty ll");
            return;
        } else if (size == 1) {
            head = tail = null;
            size = 0;
        }
        head = head.next;
        head.prev = null;
        size--;
    }
    public static void main(String args[]){
        Double dll = new Double();
        dll.addFirst(3);
        dll.addFirst(2);
        dll.addFirst(1);
        dll.print();
        // dll.removeFirst();
        // dll.print();
        // dll.removeFirst();
        // dll.removeFirst();
        // dll.print();
        


    }
}
