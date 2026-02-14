public class Main {

    public static void hollowRect(int n,int m) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <=m; j++) {
                if (i == 1 || i == 10 || j == 1 || j == 12) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }

    }

    public static void InvertedHalfPyra(int n){
        for(int i=1;i<=n;i++){
            for(int j= 1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
         
    }

    public static void numHalfInverted(int n) {
       // int count =1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <=n-i+1; j++) {
                System.err.print(j);
            }
            System.out.println("");
        }

    }

     public static void floydTri(int n) {
         int count =1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <=i; j++) {
                System.err.print(count + " ");
                count++;
            }
            System.out.println("");
        }
     }
     

      public static void zeroAndoneTri(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <=i; j++) {
                if((i+j)%2==0){
                    System.out.print("1");
                } else{
                    System.out.print("0");
                }
            }
            System.out.println("");
        }
     }

      public static void Butterfly(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <=i; j++) {
                System.err.print("*");
            }
            for(int k =1;k<=2*(n-i);k++){
                System.out.print(" ");
            }
             for (int j = 1; j <=i; j++) {
                System.err.print("*");
            }
            
            System.out.println("");
        }
         for (int i = n; i >= 1; i--) {
            for (int j = 1; j <=i; j++) {
                System.err.print("*");
            }
            for(int k =1;k<=2*(n-i);k++){
                System.out.print(" ");
            }
             for (int j = 1; j <=i; j++) {
                System.err.print("*");
            }
            
            System.out.println("");
        }
     }



     public static void solidRhombus(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=n;k++){
                System.out.print("*");
            }
            System.out.println("");
        }
     }
     
       public static void hollowRhombus(int n,int m) {
        for (int i = 1; i <= n; i++) {
            for(int k=1;k<=n-i;k++){
                System.out.print(" ");
            }
            for (int j = 1; j <=m; j++) {
                if (i == 1 || i == 5 || j == 1 || j == 5) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }

    }
    
    public static void diamond(int n){
        for(int i =1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int k= 1;k<=(2*i-1);k++){
                System.out.print("*");
            }
            System.out.println("");
        }
         
        for(int i=n;i>=1;i--){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int k= 1;k<=2*i-1;k++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }

 
    public static void main(String[] args) {
         //hollowRect(10,12);
         //InvertedHalfPyra(40);
         //numHalfInverted(14);
         //floydTri(5);
         //zeroAndoneTri(5);
         //Butterfly(20);
         //solidRhombus(5);
         //hollowRhombus(5, 5);
         diamond(4);
    }
}
