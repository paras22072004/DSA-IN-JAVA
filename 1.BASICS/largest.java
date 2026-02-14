//      largest 2 numbers
// import java.util.*;
// public class main{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter number a:");
//         int a = sc.nextInt();
//         System.out.println("Enter number b:");
//         int b= sc.nextInt();
//         if(a>b) {
//             System.out.println("the largest number is:"+a);
//         } else 
//         System.out.println("largest number is:"+b);
//     }
// }





// largest 3 numbers
import java.util.*;
public class largest{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter the a:");
        int a = sc.nextInt();
        System.err.println("Enter the b:");
        int b = sc.nextInt();
        System.err.println("Enter the c:");
        int c = sc.nextInt();
        if(a>b){
            if(a>c){
                System.err.println("a is greater:" +a);
            }
        }else if (b>c){
            System.err.println("b is greater:" +b);
        }
        else {
            System.err.println("c is greater:"+c);
        }
    }
}
