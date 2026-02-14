//import java.util.*;

public class Main {

    public static int Product(int a, int b) {
        return a * b;
    }

    public static int fact(int n) {
        int facte = 1;
        for (int i = 1; i <= n; i++) {
            facte = facte * i;
        }
        return facte;
    }

    public static int binomial(int n, int r) {
        return fact(n) / (fact(r) * fact(n - r));
    }

    // public static boolean  PrimeNum(int n){
    //     boolean isPrime = true;
    //         for(int i=2;i*i<=n;i++){
    //             if(n%i==0){
    //                 isPrime=false;
    //                 break;
    //             }
    //         }
    //     System.out.println(isPrime);
    //     return isPrime; 
    // }
    public static boolean PrimeNum(int n) {
        boolean isPrime = true;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }
        System.out.println(isPrime);
        return isPrime;
    }

    public static void rangePrimeNum(int n) {
        for (int k = 2; k <= n; k++) {
            boolean isPrime = true;

            for (int i = 2; i * i <= k; i++) {
                if (k % i == 0) {
                    isPrime = false;
                    break;
                }

            }

            if (isPrime) {
                System.err.println(k);
            }
        }

    }

    public static void BinaryToDecimal(int n) {
        int power = 0;
        int sum = 0;
        while (n > 0) {
            double m = n % 10;
            m = m * Math.pow(2, power);
            power++;
            sum = sum + (int) m;
            n = n / 10;
        }
        System.out.println(sum);

    }
    //  repeat wrong this
    //  public static void DecimalToBinary(int n){
    //     String binary = "";
    //    while(n>0 || n>1){
    //     int m ;
    //     m= n%2;
    //     binary = binary + m;
    //     n=n/2;
    //    }
    //     System.out.println(binary);
    // }

    public static int averageNum(int a, int b, int c) {
        int d = (a + b + c) / 3;
        return d;
    }

    public static void palindrome(int n) {
        int number = n;
        int rev = 0;
        while (n > 0) {
            int digit = n % 10;
            rev = rev * 10 + digit;
            n = n / 10;
        }
        if (number == rev) {
            System.out.println("palindrome");
        } else {
            System.out.println("not a palindrome");
        }
    }

    // public static boolean  iseven(int m){
     //if(m%2==0){
       // return true;
    //} else {
      //  return false;
    //}
     
    //}

    public static void sumDigits(int n){
      int sum = 0;
      for(int i=0;i<=n;i++){
        sum = sum+i;
      }  
     System.out.println(sum);
    }


    public static void main(String[] args) {
        //   Scanner sc= new Scanner(System.in);
        //    System.out.println("Enter numers: ");
        //    int c = sc.nextInt();
        //    int d = sc.nextInt();
        //    int e= Product(c, d);
        //    System.out.println("the product is :"+e);
        //System.out.println(fact(5));
        //System.out.println(binomial(5,2));
        // boolean a = PrimeNum(4);
        // if (a==true) {
        //     System.out.println("prime ");
        // }

        // else{
        //     System.out.println("not a prime");
        // }
        // rangePrimeNum(20);
        //BinaryToDecimal(111);
        //System.out.println(averageNum(3, 3, 12));  
        //palindrome(123);
        //System.out.println(iseven(4));
        sumDigits(5);
    }
}
