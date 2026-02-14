
public class Main {

    public class Node {

        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    //methods 
    //add
    public void addFirst(int data) {
        //O(1)
        //step1 -create new node
        Node newNode = new Node(data);
        size++;

        if (head == null) {
            head = tail = newNode;
            return;
        }

        //step 2-newNode next = head
        newNode.next = head;

        // step 3- head = newNode
        head = newNode;
    }

    //last add
    public void addLast(int data) {
        //O(1)
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;

        tail = newNode;
    }

    //print ll
    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    //add to middle index
    public void addIndex(int idx, int data) {
        //O(n)
        if (idx == 0) {
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;
        while (i < idx - 1) {
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;

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
        size--;
    }

    //remove last
    public void removeLast() {
        if (head == null) {
            System.out.println("empty");
            return;
        } else if (size == 1) {
            head = tail = null;
            return;
        }

        Node prev = head;
        for (int i = 0; i < size - 2; i++) {
            prev = prev.next;
        }
        prev.next = null; 
        tail = prev;
        size--;
    }

    //search
    public int search(int key) {
        Node temp = head;
        int idx = 0;
        while (temp != null) {
            if (temp.data == key) {
                return idx;
            }
            temp = temp.next;
            idx++;
        }
        return -1;
    }

    //search by recursion
    public int helper(Node head, int key) {
        if (head == null) {
            return -1;
        }
        if (head.data == key) {
            return 0;
        }
        int idx = helper(head.next, key);
        if (idx == -1) {
            return -1;
        }
        return idx + 1;
    }

    public int recSearch(int key) {
        return helper(head, key);
    }

    //reverse 
    public void reverse(){
        Node prev = null;
        Node curr = tail = head;
        Node next;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next; 
        }
        head = prev; 
    }

    //revome & find  nth node from end
    public void deleteNth(int n ){
     //calculate size
     int sz = 0;
     Node temp = head;
     while(temp != head){
        temp = temp.next;
        sz++;
     }

     //first element
     if(n==sz){
        head = head.next;
        return;
     }

     //n - sz
     int i = 1;
     int itofind = n - sz;
     Node prev = head;
     while(i< itofind){
        prev = prev.next;
        i++;
     }

     prev.next = prev.next.next;
    }


    //palindrome
    public Node findmid(Node head){
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next !=null){
            slow = slow.next; 
            fast = fast.next.next;
        }
        return slow;
    }

    public boolean palindrome(){
        if(head == null & head.next == null){
            return true;
        }
        //step1 find mid
        Node midNode = findmid(head);

        //step2 reverse 2nd half
        Node prev = null;
        Node curr = midNode;
        Node next;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node right = prev;//right half head
        Node left = head; 

        //step3 check left or right half
        while(right != null){
            if(left.data != right.data){
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }


    public static void main(String[] args) {
        Main ll = new Main();
        ll.addFirst(2);
        ll.addLast(3);
        ll.addLast(3);
        ll.addLast(2);
        //ll.addIndex(2, 7);

        //ll.print();
        //ll.removeFirst();
        //ll.removeLast();
        //ll.print();
        //System.out.println(ll.search(7));
        //System.out.println(ll.size);
        //System.out.println(ll.recSearch(10));
        //ll.reverse();
        ll.print();
        //ll.deleteNth(4);
        System.out.println(ll.palindrome());
        ll.print();
    }
}
