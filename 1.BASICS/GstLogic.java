// import java.util.*;
// public class GstLogic{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("TOTAL BILL");
//         System.out.println("Enter the cost of pencil:");
//         float a = sc.nextFloat();
//         System.out.println("Enter the cost of pen");
//         float b = sc.nextFloat();
//         System.out.println("Enter the cost of eraser");
//         float c = sc.nextFloat();

//         float d = (a+b+c);
//         double e =  (d * 0.18);
//         System.out.println("tootal bill pay:"+(d+e));
//     }
// }

// tax
import java.util.*;
public class GstLogic{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter income");
        double a = sc.nextDouble();
        if(a <= 500000){
            System.out.println("zero tax");
        } else if (a>500000 && a<=1000000){
            double tax = a * 0.2;
          double total = tax + a;
            System.out.println("20% tax total amount:" + total);
        }
        else if (a>1000000){
            double tax = a * 0.3;
            double total = tax + a;
            System.out.println("30% tax total amount is : " + total);
        }
    }
}
