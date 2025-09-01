public class trapWater{
    public static void trapWaterHeight(int arr[]){
        int n = arr.length;
        int leftmaxboud[]= new int[n];
        leftmaxboud[0]=arr[0];
        for (int i = 1; i < n; i++) {
            //  if(leftmaxboud[i-1]<arr[i]){
            //     leftmaxboud[i]=arr[i];
            //  }   else {
            //     leftmaxboud[i]= leftmaxboud[i-1];
            //  }

            leftmaxboud[i]= Math.max(leftmaxboud[i-1], arr[i]);
        }

        int rightmaxbound[]= new int[n];
        rightmaxbound[n-1]=arr[n-1];
        for (int j = n-2; j >= 0; j--) {
          rightmaxbound[j]= Math.max(arr[j], rightmaxbound[j+1]);            
        }

        int trappedwater = 0;
        for (int i = 0; i < n; i++) {
        int waterLevel = Math.min(leftmaxboud[i], rightmaxbound[i]);
        trappedwater += waterLevel - arr[i];             
        }
        System.out.println(trappedwater);
    }



    public static void main(String[] args) {
        int height[]={4,2,0,6,3,2,5};
        trapWaterHeight(height);
    }
}