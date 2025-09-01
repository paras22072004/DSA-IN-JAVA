import java.util.*;
public class Averagenum{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("AVERAGE NUMBER");
        System.out.println("Enter a first number");
        int a = sc.nextInt();
        System.out.println("Enter a second number");
        int b = sc.nextInt();
        System.out.println("Enter a third number");
        int c = sc.nextInt();
        int d;
        d= ((a+b+c)/3);
        System.out.println("average number is :"+d);
    }
}