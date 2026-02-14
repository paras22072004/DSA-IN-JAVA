
import java.util.*;

public class Main2 {

    //valid parentheses
    public static boolean isValid(String str) {
        Stack<Character> s = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == '(' || ch == '{' || ch == '[') {
                s.push(ch);
            } else {
                
                //closing
                if (s.isEmpty()) {
                    return false;
                }
                if ((s.peek() == '(' && ch == ')')
                        || (s.peek() == '{' && ch == '}')
                        || (s.peek() == '[' && ch == ']')) {
                    s.pop();
                } else {
                    return false;
                }
            }
        }

        if (s.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }
    
    //duplicate parentheses
    public static boolean isDuplicate(String str){
     Stack<Character> s = new Stack<>();

     for (int i = 0; i < str.length(); i++) {
         char ch = str.charAt(i);

         if(ch==')'){
            int count = 0;
            while(s.peek()!='('){
                s.pop();
                count++;
            }
             if(count<1){
                return true;
            }else{
                s.pop();//opening pair
            }
         }else{
            //opening 
            s.push(ch);
         }
         
     }
     return false;
    }

    //max area in histogram
    public static void MaxArea(int arr[]){
        int max = 0;
        int nsr[]=new int[arr.length];
        int nsl[]=new int[arr.length];


       //Next smaller right
       Stack<Integer> s = new  Stack<>();

       for (int i = arr.length-1; i >= 0; i--) {
          while(!s.isEmpty() && arr[s.peek()]>= arr[i]){
            s.pop();
          }
          if(s.isEmpty()){
            nsr[i] = arr.length;
          }else{
            nsr[i] = s.peek();
          }
           s.push(i);
       }
       //Next smaller left
       s = new  Stack<>();

       for (int i = 0; i < arr.length; i++) {
          while(!s.isEmpty() && arr[s.peek()]>= arr[i]){
            s.pop();
          }
          if(s.isEmpty()){
            nsl[i] = -1;
          }else{
            nsl[i] = s.peek();
          }
           s.push(i);
       }
       

       //Current area : width = j-i-1 = nsr[i]-nsl[i]-1
       for (int i = 0; i < arr.length; i++) {
           int height = arr[i];
           int weigth = nsr[i]-nsl[i]-1;
           int currArea = height * weigth;
           max = Math.max(currArea, max);
       }
       System.out.println(max);
    }

    public static void main(String[] args) {
        //String str = "({)[]";
        //String str = "((a+b))";
        //System.out.println(isDuplicate(str));
        //int arr[]= {2,1,5,6,2,3};
        int arr[]={2,4};
        MaxArea(arr);

    }
}
