public class Searching{
    public static void linear(int num[],int key){
        for(int i=0;i<num.length;i++){
            if(key==num[i]){
                System.out.println("at index "+i);
            }
        }
    }

    public static void binarySearch(int num[],int key){
        int start = 0;
        int end = num.length-1;
        while(start<=end){
            int mid = (start + end)/2;
            if(num[mid]==key){
                System.out.println("found at a index"+mid);
                return;
            }  
             else if(num[mid]<key){
                start = mid+1;
            }
           else{
                end = mid-1;
            }
        }
    }
    public static void main(String[] args) {
        int number[]={2,4,6,8,10,12,14,16};
        int key = 10;

        //linear(number, key);
        binarySearch(number, key);
    }
}