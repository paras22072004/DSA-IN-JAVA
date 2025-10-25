//operations of arrayList , add,remove,set,contains,size
// import java.util.*;
// public class main{
//     public static void main(String[] args) {
//     ArrayList<Integer>list = new ArrayList<>();
//     list.add(2);
//     list.add(3);
//     list.add(93);
//     list.add(94);

    //System.out.println(list.get(2));

    //list.remove(1);
    //System.out.println(list);

    //list.set(1,3);
    //System.out.println(list);
    //list.add(2,93);
    //System.out.println(list);

    //System.out.println(list.contains(94));
   // System.out.println(list);

    // for(int i= 0; i<list.size();i++){
    //   System.out.println(list.get(i));
    // }
//      System.out.println(list.size());
//     }

   
// }




// reverse arraylist

// import java.util.ArrayList;
// public class main{
//     public static void main(String[] args) {
//         ArrayList<Integer> list = new ArrayList<>();
//         list.add(12);
//         list.add(25);
//         list.add(35);
//         list.add(45);
//         for(int i = list.size()-1; i>=0;i--){
//      System.out.print(list.get(i)+" ");
//         }
//     }}




// max number
// import java.util.*;
// public class main{
//     public static void main(String[] args) {
//         ArrayList<Integer> list = new ArrayList<>();
//         list.add(2);
//         list.add(5);
//         list.add(9);
//         list.add(3);
//         list.add(60);

//         int max = Integer.MIN_VALUE;
//         for(int i=0; i <list.size();i++){
//           if(max<list.get(i)){
//             //max = list.get(i);
//             max= Math.max(max,list.get(i));
//           }

//         }
//         System.out.println(max);
//     }}


//swap two numbers
// import java.util.*;
// public class main
// {

//     public static void swap(ArrayList<Integer> list, int idx1, int idx2){
//                int temp = list.get(idx1);
//                list.set(idx1,list.get(idx2));
//                list.set(idx2,temp);
//                System.out.print(list);
//     }
//     public static void main(String[] args) {
//         ArrayList<Integer> list = new ArrayList<>();
//         list.add(2);
//         list.add(5);
//         list.add(9);
//         list.add(3);
//         list.add(6);
//         int idx1 = 1;
//         int idx2 = 3;
    
//       swap(list, idx1, idx2);
//     }
// }


//sorting using Collections.sort and reverse by Collections.reverseOrder();
// import java.util.*;
// public class main
// {   public static void main(String[] args) {
//         ArrayList<Integer> list = new ArrayList<>();
//         list.add(2);
//         list.add(5);
//         list.add(9);
//         list.add(3);
//         list.add(6);
//         System.out.println(list);
    
//       Collections.sort(list);
//       System.out.println(list);

//       Collections.sort(list,Collections.reverseOrder());
//       System.out.println(list);
//     }
// }




// multi-dimensional arrayList
import java.util.*;
public class main{
    public static void main(String[] args) {
       ArrayList<ArrayList<Integer>> mainlist = new ArrayList<>();
       ArrayList<Integer> list = new ArrayList<>();
       ArrayList<Integer> list2 = new ArrayList<>();

       list.add(2);     list2.add(34);
       list.add(4);     list2.add(36);
       mainlist.add(list);
       mainlist.add(list2);

       System.out.println(mainlist);

       for(int i = 0;i<mainlist.size();i++){
        ArrayList<Integer> curr = mainlist.get(i);
        for(int j =0; j<curr.size();j++){
            System.out.print(curr.get(j)+" ");
        }
        System.out.println(" ");
       }

    }}
