// public class ReverseNum{
//     public static void main(String[] args) {
//         int n= 1029;
//         int m ;
//         while(n>0){
//             m = n % 10;
//             System.out.print(m);
//             n=n/10;       
//         }
//     }
// }

import java.util.*;
public class ReverseNum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter number: ");
        int n= sc.nextInt();
        int m ;
        while(n>0){
            m = n % 10;
            System.out.print(m);
            n=n/10;       
        }
    }
}