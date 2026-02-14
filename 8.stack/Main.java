
import java.util.*;

public class Main{

    //create satck by araaylist
    // static class Stack{
    //     static ArrayList<Integer> list = new ArrayList<>();

    //     public static boolean isEmpty(){
    //        return list.size()==0;
    //     }

    //     public static void push(int data){
    //         list.add(data);
    //     }

    //     public static int pop(){
    //         if(isEmpty()){
    //             return -1;
    //         }
    //         int top = list.get(list.size()-1);
    //         list.remove(list.size()-1);
    //         return top;
    //     }

    //     public static int peek(){
    //         if(isEmpty()){
    //             return -1;
    //         }
    //         return list.get(list.size()-1);
    //     }

    //create stack by linked list
    // static class Node{
    //     int data;
    //     Node next;
    // }

    // static class Stack{
    //     static Node head = null;

    //     public static boolean isEmpty(){
    //         return head==null;  
    //     }

    //     public static void push(int data){
    //       Node newNode = new Node();
    //       if(isEmpty()){
    //         head = newNode; 
    //       }
    //       newNode = head;
    //       head = newNode;
    //     }

    //     public static int pop(){
    //         if(isEmpty()){
    //             return -1;
    //         }
    //         int top = head.data;
    //         head = head.next;
    //         return top;
    //     }

    //     public static int peek(){
    //         if(isEmpty()){
    //             return -1;
    //         }
    //         return head.data;
    //     }
    // }
  

   // } 
    public static void main(String args[]){
     Stack<Integer> s = new Stack<>();
     s.push(2);
     s.push(3);
     s.push(4);
     s.push(5);
    
      System.out.println(s.peek());
      
     }
    }
