
import java.util.*;
public class fact{
    public static void main( String [] args){
        Scanner sc = new Scanner(System.in);
        System.err.println("number:");
        int n = sc.nextInt();
        int fact = 1;
        for(int i=1;i<=n;i++){
          fact = fact *i;
        }
        System.err.println("FACTORIAL of a number: "+n +" is "+ fact);
    }
}