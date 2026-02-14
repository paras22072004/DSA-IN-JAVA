public class Main1{
    //print number in decreasing
    public static void dec(int n) {
      if(n==0){
        return;
      }  
      System.out.print(n+" ");
      dec(n-1);
    }

    // ascending order print
    public static void ace(int n) {
        if(n==1){
            System.out.println(n);
            return;
        }        
        ace(n-1);
        System.out.println(n);
    }

    //factorial
    public static int fact(int n) {
           if(n==0){
            return 1;
           }   
           return n*fact(n-1); 

    }

    //print sum natural number
     public static int sum(int n) {
           if(n==0){
            return 0;
           }   
           return n+sum(n-1); 

    }

    //fibonacci
    public static int fib(int n){
        if(n==0 || n==1){
            return n;
        }
        int fib1 = fib(n-1);
        int fib2 = fib(n-2);
        int fib3 = fib1 + fib2;
        return fib3;
    }

    //sorted 
    public static boolean  sorted(int num[],int i){
         
       if(i==num.length-1){
           return true;
       }
      if(num[i]>num[i+1]){
        return false;
      }
      return sorted(num, i+1);
    }

    //first occurence
    public static int occur(int num[], int key,int idx) {
        if(idx==num.length){
          return -1;
        }
        if(num[idx]==key){
            return idx;
        }
       return occur(num, key, idx+1);
    }


    //last occurence
    public static int lastOccur(int num[], int key, int idx) {
        if(idx == num.length){
            return -1;
        }
        int ans = lastOccur(num, key, idx+1);
         
         if( ans!= -1){
            return ans;
        }
        if(num[idx]==key){
            return idx;
        }
        return -1;
    }

    //power x^n
    public static int power(int x, int n ) {
         if(n==0){
            return 1;
         }       

         return x * power(x, n-1);
    }

    //optimized power
    public static int optimized(int x, int n){
        if(n==0){
            return 1;
        }

        int half = optimized(x, n/2);
        int half2 = half * half;
        // odd case 
        if(n %2 != 0){
            half2= x * half2;
        }

      return half2;
    }
    public static void main(String[] args) {
        //int n = 5;
        //dec(n);
        //ace(n);
        //System.out.println(fact(n));
        //System.out.println(sum(n));
        //System.out.println(fib(n));
        //int num[]={1,2,3,6,5};
        //System.out.println(sorted(num, 0));
        //int num[]={8,3,6,9,5,10,2,5,3};
        //System.out.println(lastOccur(num, 5, 0));
        //System.out.println(lastOccur(num, 3, 0));
        int x = 2;
        int n = 5;
        System.out.println(optimized(x, n));
    }
}