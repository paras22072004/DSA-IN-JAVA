public class Main2{
    //tiling problem
    public static int Tiling(int n) {
        if(n==0 || n==1){
            return 1;
        }
        //vertical
        int til1 =  Tiling(n-1);

        // horizontal
        int til2 =  Tiling(n-2);
        return til1 + til2; 
    }

    //remove duplicate
    public static void duplicate(String str, int idx, boolean  map[], StringBuilder newStr){
      if(idx == str.length()){
        System.out.println(newStr);
        return;
      }

      //logic
      char curr = str.charAt(idx);
      if(map[curr - 'a'] == true){
          
          duplicate(str, idx+1, map, newStr);
      }
      else{
        map[curr - 'a'] = true;
        duplicate(str, idx+1, map, newStr.append(curr));
      }

    }

    //friends pairing
    public static int friends(int num) {
        if(num == 1 || num == 2){
            return num;
        }

        //int frd1 = friends(num-1);

        //int frd2 = friends(num-2);

        //int waypair  = (num-1) * frd2;

        //int totalways = frd1 + waypair; 

        return friends(num-1) + (num-1)*friends(num-2);

        
    }
    public static void main(String[] agrs){
    // int n = 4;
    // System.out.println(Tiling(n));
    //String str = "ppppaarass";
    //duplicate(str, 0, new boolean[26], new StringBuilder(""));

    int n = 7;
    System.out.println(friends(n));
    }
}