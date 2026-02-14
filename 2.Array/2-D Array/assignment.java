
public class assignment {

    //print 7's
    public static void Sevenprint(int num[][]) {
        int count = 0;
        int n = num.length;
        int m = num[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (num[i][j] == 7) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }

    //sum print 2 row
    public static void rowSum(int num[][]) {
        int sum = 0;
        int n = num.length;
        int m = num[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (i == 1) {
                    sum = sum + num[i][j];
                }
            }
        }
        System.out.println(sum);
    }

    //transpose of matrix
    public static void transpose(int num[][]) {
        int n = num.length;
        int m = num[0].length;
        int num2[][] = new int[m][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                num2[j][i] = num[i][j];
            }

        }
        int x = num2.length;
        int y = num2[0].length;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.print(num2[i][j] + " ");

            }
            System.out.println();

        }
    }

    public static void main(String[] args) {
        //int num[][]= {{4,7,8},{7,8,7}};
        //Sevenprint(num);
        //int num[][]= {{1,4,9},{11,4,3},{2,2,3}};
        //rowSum(num);
        int arr[][] = {{11, 12, 13},
        {21, 22, 23}};
        transpose(arr);

    }
}
