
import java.util.*;
public class Calculator{
public static void main(String args[]){
  Scanner sc = new Scanner(System.in);
  System.out.println("calculator");
  System.out.println("enter the numbers:");
  int a  = sc.nextInt();
  int b = sc.nextInt();
  System.out.println(  """
                       1: add 
                       2:subtract  
                       3:multiple   
                       4:divide """);
   
   int e = sc.nextInt();
  switch (e) {
      case 1-> System.err.println("add:"+ (a+b));      
      case 2 ->  System.err.println("sub:"+(a-b));           
      case 3 ->  System.err.println("mul:"+ a*b);            
      case 4 -> System.err.println("div:"+a/b);            
      default-> System.err.println("wrong input");
          
  }

  
}}
