// import java.util.*;
// public class Main{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//       int number[]= new int[4];
//       for(int i=0;i<number.length;i++){
//         System.out.println("enter number");
//         number[i]=sc.nextInt();
//       }

//       number[1]=number[1]+1;
//       for (int i = 0; i <number.length; i++) {
//       System.out.print(number[i]+" ");    
//       }
//       int avg= ((number[0] + number[1] + number[2])/3);
//       System.out.println("average number is :"+avg);
//     }
// }
// public class Main{
//     public static void array(int marks[]){
//        for (int i = 0; i <marks.length; i++) {
//            System.out.println(marks[i]+" ");
//        }
//     }
//     public static void main(String[] args) {
//         int marks[]={97,99,98};
//         array(marks);
//     }
//}
public class Main {

    public static int LinearSearch(int nums[], int keys) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == keys) {
                System.out.println(i + " " + keys);
                return 1;
            }
        }
        return -1;
    }

    public static void LargestArray(int arr[]) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }
        System.out.println("the lagest number is: " + largest);
        System.out.println("the smallest number is: " + smallest);
    }

    public static void BinarySearch(int arr[], int keys) {
        int start = 0;
        int last = arr.length - 1;
        while (start <= last) {
            int mid = (start + last) / 2;
            if (arr[mid] == keys) {
                System.out.println("found" + ' ' + keys + " " + mid);
                return;
            } else if (arr[mid] > keys) {
                last = mid - 1;
            } else if (arr[mid] < keys) {
                start = mid + 1;
            }
        }
        System.out.println("not found");
    }

    public static void ReverseArray(int arr[]) {
        int start = 0;
        int last = arr.length - 1;
        while (start < last) {
            int temp;
            temp = arr[start];
            arr[start] = arr[last];
            arr[last] = temp;
            start++;
            last--;

        }
        System.out.print("reverse array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    public static void PairArrays(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                System.out.print("(" + arr[i] + "," + arr[j] + ")");
            }
            System.out.println("");
        }
    }

    public static void subArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
            }
        }
    }

    public static void AddsubArray(int arr[]) {
        //BRUTE FORCE
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    System.out.println(arr[k] + " ");
                    sum = sum + arr[k];

                    if (largest < sum) {
                        largest = sum;
                    }
                }
                System.out.println("the sum is " + sum);
                System.out.println();
            }
        }
        System.out.println("the largest sum " + largest);
    }

    public static void PrefixAddSubArray(int arr[]){
        //PREFIX
        int largest = Integer.MIN_VALUE;
        int prefix[] = new int [arr.length];
        prefix[0]=arr[0];
        for (int i = 1; i < arr.length; i++) {
            prefix[i]= prefix[i-1]+arr[i];
        }
        
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int sum;
                if(i==0){
                    sum=prefix[j];
                }
                else {
                    sum = prefix[j]-prefix[i-1];
                }
                if(sum>largest){
                    largest = sum;
                }
            }
          
            
        }
          System.out.println("largest :"+ largest);
        
    }

    public static void kadanes(int arr[]){
        int curr = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            curr =curr + arr[i];
            if (curr<0){
                curr=0;
            }
            max = Math.max(curr, max); 
        }
        System.out.println(max);
    }

    

    public static void main(String[] args) {
        int num[] = {2, 4, 6, 8, 10};
        //int num[]={-2,-3,4,-1,-2,1,5,-3};
        //int key = 161;
        // int ans = LinearSearch(num, key);
        // if (ans == 1) {
        //     System.out.println("valid");
        // } else {
        //     System.out.println("wrong key");
        // }
        //LargestArray(num);
        //BinarySearch(num, key);
        // System.out.print("original array:");
        // for (int i = 0; i < num.length; i++) {
        //     System.out.print(num[i]+" ");
        // }
        // System.out.println("");
        // ReverseArray(num);
        //PairArrays(num);
        //subArray(num);
        //AddsubArray(num);
        //PrefixAddSubArray(num);
        kadanes(num);
    }
}
