public class assignment{
    public static boolean distinct(int arr[]){
        for (int i=0; i<arr.length; i++) {
         for (int j = i+1; j < arr.length; j++) {
            if(arr[i]==arr[j]){
                return true;
            }            
         }    
      }
      return false;
    }

    public static void secondQuesRot(int arr[]){
        
    }
    public static void main(String[] args) {
        int nums[] = {1,2,3};
        System.out.println(distinct(nums));
    }
}