
public class Main {

    public static void num(int m) {
        if (m == 1) {
            System.out.print(m + " ");
            return;
        }
        num(m - 1);
        System.out.print(m + " ");

    }

    public static void printSumFib(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            System.out.println(fibo(i));
            sum = sum + fibo(i);
            //System.out.println(i);
        }
        System.out.println("sum is " + sum);

    }

    public static int fibo(int n) {
        if (n <= 1) {

            return n;
        }
        return fibo(n - 1) + fibo(n - 2);

    }

    public static int sumNatural(int n) {
        if (n == 1) {
            return 1;
        }
        int sum = sumNatural(n - 1);
        return n + sum;
    }

    public static Boolean isSorted(int arr[], int i) {
        if (i == arr.length - 1) {
            return true;
        }
        if (arr[i] > arr[i + 1]) {
            return false;
        }

        return isSorted(arr, i + 1);
    }

    public static int firstOccurence(int arr[], int key, int i) {
        if (i == arr.length - 1) {
            return -1;
        }
        if (arr[i] == key) {
            return i;
        }
        return firstOccurence(arr, key, i + 1);
    }

    public static int lastOccurence(int arr[], int key, int i) {
        if (i == arr.length) {
            return -1;
        }
        int found = lastOccurence(arr, key, i + 1);
        if (found != -1) {
            return found;
        }

        if (arr[i] == key) {
            return i;
        }
        return found;
    }

    public static int power(int x,int n) {
    if(n==0){
        return 1;
    }        

    return x * power(x,n-1);
    }

    public static int optimized(int x,int n) {
        if(n==0){
            return 1;
        }
        int half = optimized(x, n/2);
        int half2= half*half;
        
        if(n%2!=0){
           half2= x*half2;
        }
        return half2;
    }

    public static void main(String[] args) {
        //int n = 6;
        //num(n);
        //System.out.println(fibo(n));
        //printSumFib(n);
        //System.out.println(sumNatural(n));
        // int arr[] = {2, 3, 4, 5, 5, 6};
        // int i = 0;
        // int key = 5;
        //System.out.print(isSorted(arr, i));
        //System.out.println(firstOccurence(arr, key, i));
        //System.out.println(lastOccurence(arr, key, i));
        int n = 10;
        int x = 2;
        System.out.print(optimized(x, n));
    }
}
