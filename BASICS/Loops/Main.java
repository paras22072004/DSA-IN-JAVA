// public class Main{
//     public static void main(String[] args) {
//         for(int i=1;i<=10;i++){
//             System.out.println(i);
//         }
//     }
// }


// import java.util.*;
// public class Main{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int counter = 1;
//         while(counter <=n){
//             System.out.println(counter);
//             counter++;

//         }
//     }
// }



// import java.util.*;
// public class Main{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.err.println("enter number: ");
//         int n = sc.nextInt();
//         int counter = 1;
//         int sum = 0;
//         while(counter <=n){
//             sum = sum + counter;
//             counter++;

//         }
//         System.err.println(sum);
//     }
// }


// public class Main{
//     public static void main( String [] args){
//        for(int i=1;i<=5;i++){
//         for(int j=1;j<=5;j++){
//             System.err.print("*");
//         }
//           System.err.println(" ");
//        }
     
//     }
// }


import java.util.*;
public class Main{
    public static void main( String [] args){
        Scanner sc = new Scanner(System.in);
        System.err.println("number:");
        int n = sc.nextInt();
        int evensum =0, oddsum=0;
       for(int i=1;i<=n;i++){
        if(i%2==0){
            evensum += i;

        }
        else{
            oddsum += i;
        }
       }
       System.err.println("the sum of even numbers:" + evensum);
       System.err.println("the sum of odd numbers: "+ oddsum);
     
    }
}