// import java.util.*;
// public class basic{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         //create array
//         int marks[]=new int[100];
//         int numbers[]= {1,2,3};
//         String fruits[]={"apple","mango"};
        
//          marks[1]= sc.nextInt();
//          marks[2]= sc.nextInt();

//          System.out.println(marks[1]);
//          System.out.println(marks[2]);


//     }}


// public class basic{
//     public static void add(int num[]){
//        for (int i = 0; i < num.length; i++) {
//            num[i]=num[i]+1;
//        }
//        int number = 10;
//     }

//   public static void main(String[] args){
//     int marks[]= {2,12,32,12};
//     int number = 5;

     
//      for (int i = 0; i < marks.length; i++) {
//          System.out.print(marks[i]+" ");
//      }
//     System.out.println("num "+ number);
    
//     add(marks);
     
//      for (int i = 0; i < marks.length; i++) {
//          System.out.print(marks[i]+" ");
//      }
//     System.out.println( "num "+number);
    
//   }
// }


//largest number in array

// public class basic{
//     public static void largest(int num[]) {
//         int lagest = Integer.MIN_VALUE;
//         for(int j = 0;j<num.length;j++){
//             if(lagest<num[j]){
//                 lagest = num[j];
//             }
//         }
//         System.out.println(lagest);
//     }
//   public static void main(String[] args) {
//       int num[]={1,3,6,25,90};
//         largest(num);
//   }
// }


//Reverse an array
// public class basic{
//     public static void reverse(int num[]){
//         int start = 0;
//         int end = num.length-1;
        
//        while(start < end){
//         int temp = 0;
//         temp=num[start];
//         num[start]=num[end];
//         num[end]=temp;
//         start++;
//         end--;
//        }
           
        
//         for (int i = 0; i < num.length; i++) {
//             System.out.println(num[i]);
//         }
//     }
//     public static void main(String[] args) {
//         int num[]={2,4,6,8,10};
//         reverse(num);
//     }
// }

//pairs in a array
// public class basic{
//     public static void pairs(int num[]) {
//         for (int i = 0; i < num.length; i++) {
//             for (int j = i+1; j < num.length; j++) {
//                 System.out.print("("+num[i]+","+num[j]+") ");
//             }
//             System.out.println();
//         }
//         System.out.println();
//     }
//     public static void main(String[] args) {
//         int num[]={2,4,6,8,10};
//          pairs(num);
//     }
// }


//sub array
public class basic{
    public static void subarray(int num[]){
        for (int i = 0; i < num.length; i++) {
        for (int j = i+1; j < num.length; j++) {
           for (int k=i ;k < j; k++) {
            System.out.print(num[k]);
        }  
         System.out.println(" ");
        }
        }
    }
    public static void main(String[] args) {
        int num[]= { 2,4,6,8,10};
    subarray(num);
    }
}