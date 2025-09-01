
public class assignment {

    public static void print7Nums(int arr[][], int key) {
        int count = 0;
        int row = arr.length;
        int col = arr[0].length;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (key == arr[i][j]) {
                    count++;
                }
            }
        }
        System.out.print(count + " ");
    }

    public static void sum2ndrow(int arr[][]) {
        int sum = 0;
        for (int i = 0; i < arr[0].length; i++) {
            sum = sum + arr[1][i];
        }
        System.out.print(sum);
    }

    public static void transpose(int arr[][]) {
        int row = arr.length;
        int col = arr[0].length;
        int arr2[][] = new int[col][row];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr2[j][i] = arr[i][j];
            }
        }

        // Print original
        System.out.println("Original Matrix:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        // Print transpose
        System.out.println("\nTranspose Matrix:");
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        int arr[][] = {
            {1, 4, 9},
            {11, 4, 3},
            };
        // int key = 2;
        //print7Nums(arr, key);
        //sum2ndrow(arr);
        transpose(arr);
    }
}
