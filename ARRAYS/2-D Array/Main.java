
//import java.util.*;

public class Main {

    public static void search(int arr[][], int key) {
        for (int o = 0; o < arr.length - 1; o++) {
            for (int p = 0; p < arr.length - 1; p++) {
                if (arr[o][p] == key) {
                    System.out.println(o + "," + p + "");
                }

            }

        }
    }

    public static void sorting(int arr[][],int key){
        int row = 0;
        int col = arr[0].length-1;
        while(row < arr.length && col >=0){
            if(arr[row][col]==key){
                     System.out.println("("+row+","+col+")");
                     break;
            }else if (key < arr[row][col]){
                col--;
                
            }else {
              row++;
            
            }
            
               
            
        }
         
    }
       
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // int arr[][] = new int[3][3];
        // int n = arr.length;
        // int m = arr[0].length;
        // int key = 4;

        // for (int i = 0; i < n; i++) {
        //     for (int j = 0; j < m; j++) {
        //         arr[i][j] = sc.nextInt();
        //     }
        // }
        // for (int i = 0; i < n; i++) {
        //     for (int j = 0; j < m; j++) {
        //         System.out.print(arr[i][j] + " ");
        //     }
        //     System.out.println(" ");
        // }

        // search(arr, key);
        int arr[][]={
            {10,20,30,40},
            {15,25,35,45},
            {27,29,37,48},
            {32,33,39,50}
        };
        int key = 50;
        sorting(arr, key);


    }
}
