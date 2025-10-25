// maximum waterstore Brute force approach
// import java.util.*;
// public class ques{

//     public static int storewater(ArrayList<Integer> height){
//        int maxwater = 0;
//        for(int i=0;i<height.size();i++){
//         for(int j = i+1;j<height.size();j++){
//             int ht = Math.min(height.get(i), height.get(j));
//             int width = j-i;
//             int currwater = ht*width;
//             maxwater = Math.max(maxwater, currwater); 
//         }
//        }
//        return maxwater;
//     }
//     public static void main(String[] args) {
//         ArrayList<Integer> height = new ArrayList<>();
//         height.add(1);
//         height.add(8);
//         height.add(6);
//         height.add(2);
//         height.add(5);
//         height.add(4);
//         height.add(8);
//         height.add(3);
//         height.add(7);
//         System.out.println(height);
//         System.out.print(storewater(height));
//     }
// }





//2 pointer approach
// import java.util.*;
// public class ques{
//     public static int storewater(ArrayList<Integer> height){
//        int lp = 0;
//        int rp= height.size()-1;
//        int maxwater = 0;
//        while(lp<rp){
//         int ht = Math.min(height.get(lp), height.get(rp));
//         int width = rp-lp;
//         int currwater = ht * width;
//         maxwater = Math.max(maxwater, currwater);
//         if(height.get(lp) < height.get(rp))
//         {
//             lp++;
//         }else{
//             rp--;
//         }
//        }
//        return maxwater;
//     }
//     public static void main(String[] args) {
//         ArrayList<Integer> height = new ArrayList<>();
//         height.add(1);
//         height.add(8);
//         height.add(6);
//         height.add(2);
//         height.add(5);
//         height.add(4);
//         height.add(8);
//         height.add(3);
//         height.add(7);
//         System.out.println(height);
//         System.out.print(storewater(height));
//     }
// }



//Pair sum by brute force
// import java.util.*;
// public class ques{
//     public static boolean  pairsum(ArrayList<Integer> list, int target){
//       for(int i=0;i<list.size();i++){
//         for(int j=i+1;j<list.size();j++){
//             int sum = list.get(i) + list.get(j);
//             if(target==sum){
//                 System.out.println(i +" "+ j );
//                 return true;
//             }
//         }
//       }
//       return false;
//     }
//     public static void main(String[] args) {
//         ArrayList<Integer> list = new ArrayList<>();
//         list.add(1);
//         list.add(2);
//         list.add(3);
//         list.add(4);
//         list.add(5);
//         list.add(6);
//         int target = 5;
//       System.out.println(pairsum(list, target));
//     }
// }



// two pair sum by 2 pointer approach
// import java.util.*;
// public class ques {
//     public static boolean pairsum(ArrayList<Integer> list, int target) {
//         int lp = 0;
//         int rp = list.size() - 1;
//         while (lp != rp) {
//             if (list.get(lp) + list.get(rp) == target) {
//                 return true;
//             }
//             if (list.get(lp) + list.get(rp) < target) {
//                 lp++;
//             } else {
//                 rp--;
//             }
//         }
//         return false;
//     }
//     public static void main(String[] args) {
//         ArrayList<Integer> list = new ArrayList<>();
//         list.add(1);
//         list.add(2);
//         list.add(3);
//         list.add(4);
//         list.add(5);
//         list.add(6);
//         int target = 5;
//         System.out.println(pairsum(list, target));
//     }
// }




//pair sum rotated list and sorted
import java.util.*;

public class ques {

    public static boolean pairsum(ArrayList<Integer> list, int target) {
        int bp = -1;
        int n = list.size();

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > list.get(i + 1)) {
                bp = i;
                break;
            }
        }

        int lp = bp + 1;
        int rp = bp;

        while (lp != rp) {
            if (list.get(lp) + list.get(rp) == target) {
                return true;
            }

            if (list.get(lp) + list.get(rp) < target) {
                lp = (lp + 1) % n;

            } else {
                rp = (n + rp - 1) % n;
            }

        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
        int target = 16;

        System.out.println(pairsum(list, target));

    }
}
