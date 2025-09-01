// public class Main{
//     public static void main( String [] args){
//         int n=4;
//      for(int i=1;i<=n;i++){
//         for(int j=1;j<=(n-i)+1;j++){
//             System.out.print("*");
//         }
//         System.out.println(" ");
//      }

//      for(int i=1;i<=n;i++){
//         for(int j=1;j<=i;j++){
//             System.out.print("*");
//         }
//         System.out.println(" ");
//      }


//      }
//}


// public class Main{
//     public static void main(String[] args) {
//         for(int i=1;i<=4;i++){
//             for(int j=1;j<=i;j++){
//                 System.out.print(j);
//             }
//             System.out.println(" ");
//         }
//     }
// }


public class Main{
    public static void main(String[] args) {
        char a ='A';
        for(int i=1;i<=4;i++){
            for(int j=1;j<=i;j++){
                System.out.print(a);
                a++;
            }
            System.out.println(" ");
        }
    }
}