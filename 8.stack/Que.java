import java.util.*;
public class Que{

    //push bottom af stack
    public static void pustAtBottom(Stack<Integer> s, int data) {
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top = s.pop();
        pustAtBottom(s, data);
        s.push(top);
    }

    //reverse a string eg= abc -> cba
    public static void reverseString(String str){
        Stack<Character> s = new Stack<>();
        int idx = 0;
        while(idx<str.length()){
             s.push(str.charAt(idx));
             idx++;
        }

        StringBuilder stb = new StringBuilder();
        while(!s.isEmpty()){
            char curr = s.pop();
            stb.append(curr);
        }

        str= stb.toString();
        System.out.println(str);
    }

    //reverse a stack
    public static void reverseStack(Stack <Integer> s) {
        if(s.isEmpty()){
            return ;
        }
        int top = s.pop();
        reverseStack(s);
        //pushAtBottom(s,top);
        
    }

    //stock span 
    public static void stockSpan(int stock[],int span[]){
        Stack<Integer> s = new Stack<>();
        span[0]=1;
        s.push(0);

        for(int i=1;i<stock.length;i++){
          int currPrice = stock[i];
          while(!s.isEmpty()&& currPrice > stock[s.peek()]){
            s.pop();
          }
          if(s.isEmpty()){
            span[i]=i+1;
          }else{
            int preHigh = s.peek();
            span[i]=i -preHigh;
          }

          s.push(i);
        }

    }

    public static void print(Stack<Integer> s) {
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }

    public static void main(String[] args) {
        // Stack<Integer> s = new Stack<>();
        // s.push(1);
        // s.push(2);
        // s.push(3);
        //pustAtBottom(s, 4);
        // while(!s.isEmpty()){
        //   System.out.println(s.peek());
        //   s.pop();
        // }
        //reverseString("abc");
       int stock[]={100,80,60,70,60,85,100};
       int span[]= new int[stock.length];
       stockSpan(stock,span);

       for(int i=0 ; i<span.length;i++ ){
        System.out.println(span[i]+" ");
       }
    }
}