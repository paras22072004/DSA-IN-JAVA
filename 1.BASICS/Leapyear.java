// import java.util.*;
// public class Leapyear{
//     public static void main(String[] args) {
//         Scanner sc= new Scanner(System.in);
//         System.out.println("Enter year");
//         int a = sc.nextInt();

//         if(a%4==0){
//             if(a%100==0){
//                 if(a%400==0){
//                     System.err.println("leap year "+a);
//                 }
//                 else{
//                     System.err.println("not a leap year "+a);
//                 }

//             }
//             else{
//                 System.err.println("leap year "+a);
//             }
//         }
//         else{
//             System.err.println("not a leap year: "+a);
//         }
    
// }
// }




// import java.util.*;
// public class Leapyear {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.print("Input the year: ");
// int year = sc.nextInt();

// boolean x = (year % 4) == 0;
// boolean y = (year % 100) != 0;
// boolean z = ((year % 100 == 0) && (year % 400 == 0));

// if (x && (y || z)) {
// System.out.println(year + " is a leap year");
// } else {
// System.out.println(year + " is not a leap year");
// }
// }
// }