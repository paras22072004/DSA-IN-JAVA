public class assignment{
    //occurrences
    public static void occurrences(int arr[],int key,int idx){
        if(idx == arr.length){
            return;
        }

        if(arr[idx] == key){
          System.out.print(idx+" ");
        }
    
       occurrences(arr, key, idx+1);
    }

    //convert it into a String of english 
    public static void english(String str[], int num ) {
               if(num==0){
                return;
               }

               int lastdigit = num % 10;
               english(str, num/10);
               System.out.print(str[lastdigit]+" ");
    }
    public static void main(String[] args) {
        //int arr[ ] = {3, 2, 4, 5, 6, 2, 7, 2, 2};
        //int key = 2;
        //occurrences(arr, key, 0);
        String str[]= {"zero","one","two","three","four","five","six","seven","eight","nine"};
        int n = 1947;
        english(str, n);
    }
}