public class spiral{

    public static void spiralMatrix(int arr[][]){
        int startrow = 0;
        int startcol= 0;
        int endrow = arr.length-1;
        int endcol = arr[0].length-1;

       while(startrow<=endrow && startcol<=endcol){
         //top row
        for (int j=startrow; j < endcol; j++) {
        System.out.print(arr[startrow][j]+" ");                    
        }

      
       
       //right col
        for (int j=startcol; j < endcol; j++) {
        System.out.print(arr[j][endcol]+" ");                    
        }

       
       
       //bottom row
        for (int j=endrow; j > startrow; j--) {
            if(startrow==endrow){
                break;
            }
        System.out.print(arr[endrow][j]+" ");                    
        }

      
      
      //left col
        for (int j=endrow; j > startrow; j--) {
            if(startcol==endcol){
                break;
            }
        System.out.print(arr[j][startrow]+" ");                    
        }
             
        startcol++;
        startrow++;
        endcol--;
        endrow--;
       }
    }
    public static void main(String[] args) {
        int arr[][] = {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16}
        };

        spiralMatrix(arr);
    }
}