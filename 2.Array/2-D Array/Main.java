
public class Main {

    //largeest number
    public static void largest(int num[][]) {
        int largest = Integer.MIN_VALUE;
        int n = num.length;
        for(int i = 0; i < n; i++) {
            for (int j = 0; j < num[0].length; j++) {
                if (num[i][j] > largest) {
                    largest = num[i][j];
                }
            }
        }
        System.out.println(largest);
    }


    //Spiral matrix
    public static void SpiralMatrix(int num[][]) {
        int startrow = 0;
        int startcol = 0;
        int endrow = num.length - 1;
        int endcol = num.length - 1;

        while (startrow <= endrow && startcol <= endcol) {
            //top
            for (int i = startcol; i <= endcol; i++) {
                System.out.print(num[startrow][i] + " ");
            }

            //right
            for (int i = startrow + 1; i <= endrow; i++) {
                System.out.print(num[i][endcol] + " ");
            }

            //bottom
            for (int i = endcol - 1; i >= startcol; i--) {
                if (startrow == endrow) {
                    break;
                }
                System.out.print(num[endrow][i] + " ");
            }

            //left
            for (int i = endrow - 1; i > startrow; i--) {
                if (startcol == endcol) {
                    break;
                }
                System.out.print(num[i][startcol] + " ");
            }

            startcol++;
            startrow++;
            endcol--;
            endrow--;
        }

    }
    
    //Diagonal sum
    public  static void DiagonalSum(int num[][]){
        int sum = 0;
    //   for (int i = 0; i < num.length; i++) {
    //       for (int j = 0; j < num[0].length; j++) {
    //           if(i==j || i+j==(num.length-1)){
    //           sum = sum+num[i][j];
    //           }
              
    //       }
          
    //   }

    for (int i = 0; i < num.length; i++) {
        sum = sum+num[i][i];
        if(i != num.length-1-i){
           sum = sum + num[i][num.length-1-i];
        }
        
            }
      System.out.println(sum);
    }


    public static void main(String[] args) {
        int num[][] = {{1, 2, 3, 4},
        {5, 6, 7, 8},
        {9, 10, 11, 12},
        {13, 14, 15, 16}};
        //largest(num);
        //SpiralMatrix(num);
        DiagonalSum(num);
    }
}
