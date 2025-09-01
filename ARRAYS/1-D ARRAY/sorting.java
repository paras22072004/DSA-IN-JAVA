//import java.util.Arrays;
public class sorting {

    public static void bubbleSort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                }
            }

        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void selectionSort(int arr[]){
      for (int i = 0; i < arr.length-1; i++) {
          int minpos= i;
          for (int j = i+1; j < arr.length; j++) {
              if(arr[minpos]>arr[j]){
                minpos = j;
              }
              
          }
          int temp = arr[i];
          arr[i] = arr[minpos];
          arr[minpos]= temp;
          
      }

      for (int i = 0; i < arr.length; i++) {
          System.out.println(arr[i]+" ");
          
      }
    }

    public static void insertionSort(int arr[]){
      for (int i = 1; i < arr.length; i++) {
          int curr= arr[i];
          int prev = arr[i-1];
         while(prev >= 0 && arr[prev]> arr[curr]){
          arr[prev+1] = arr[prev];
          prev--;
         }
        arr[prev+1]=arr[curr];
         }   

         for (int idx = 1; idx < arr.length; idx++) {
             System.out.println(arr[idx]+" ");
             
         }
      }
    
      public static void countingSort(int arr[]){
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            largest = Math.max(largest, arr[i]);
        }
      int count[] = new int [largest+1];
      for(int i=0; i<arr.length;i++){
        count[arr[i]]++;
      }

      int j=0;
      for (int i = 0; i < count.length; i++) {
       while(count[i]>0){
        arr[j]=i;
        j++;
        count[i]--;
       }         
      }
     for (int i = 0; i < arr.length; i++) {
         System.out.print(arr[i]+" ");
     }
      }

    public static void main(String[] args) {
        int arr[] = {12, 2, 4, 1, 7, 0};
        //bubbleSort(arr);
        //selectionSort(arr);
       //Arrays.sort(arr);
      //  Arrays.sort(arr,0,3);
      //   System.out.println(Arrays.toString(arr));
        countingSort(arr);
    }
}
