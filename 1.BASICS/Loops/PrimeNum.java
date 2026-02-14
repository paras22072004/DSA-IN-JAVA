// import java.util.*;
// public class PrimeNum{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.err.println("Enter number: ");
//         int n = sc.nextInt();
//         boolean isPrime = true;

//         if (n<=1){
//             isPrime= false;
           
//     }  else{
//             for(int i = 2;i * i<=n;i++ ){
//                 if(n%i==0){
//                  isPrime= false;
//                  break;
//             }  
//          }
//       }

//      if(isPrime){
//        System.err.println( n +" prime number");   
//     }  else {
//           System.err.println( n +" not a prime number ");
//     }
//   }
// }





import java.util.*;
public class PrimeNum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = sc.nextInt();
       
      for(int k = 1;k<=n;k++){
         boolean isPrime = true;
        if (k<=1){
            isPrime= false;
           
    }  else{
            for(int i = 2;i * i<=k;i++ ){
                if(k%i==0){
                 isPrime= false;
                 break;
            }  
         }
      }

       if(isPrime){
       System.err.println( k +" prime number");   
       }   else {
          System.err.println( k +" not a prime number ");
           }
    }
         
  }
}