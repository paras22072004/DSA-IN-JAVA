
public class string {

    public static boolean palindrome(String str) {

        for (int i = 0; i < str.length() / 2; i++) {
            //System.out.println(str.charAt(i)+" ");
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static float shortestpath(String str) {
        int x = 0;
        int y = 0;
        for (int i = 0; i < str.length(); i++) {
            char dir = str.charAt(i);
            if(dir =='S'){
                y--;
            } else if (dir == 'N') {
                y++;
            } else if (dir == 'W') {
                x--;
            } else {
                x++;
            }
        }
        int x2 = x * x;
        int y2 = y * y;
        int add = x2 + y2;
        return (float) Math.sqrt(add);
    }

    public static void toUpperCase(String str){
        StringBuilder sb = new StringBuilder ("");
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);
        for (int i = 1; i < str.length(); i++) {
            if(str.charAt(i)==' ' && i < str.length()-1){
               sb.append(str.charAt(i));
               i++;
               sb.append(Character.toUpperCase(str.charAt(i)));
            }else{
                sb.append(str.charAt(i));
            }
            
        }
        System.out.println(sb);
    }

    public static String compress(String str){
        String newstr = "";
        for (int i = 0; i < str.length(); i++) {
            Integer count = 1;
            while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
                count++;
                i++;
            }
            newstr += str.charAt(i);
            if(count>1){
                newstr += count.toString();
            }
            
        }
        return newstr;
    }
    public static void main(String[] args) {
//   char arr[] = {'a','b','c','d'};
//   String str = "abcd";
//   String str2 = new String("xyz@gh");

//String str = "WNEENESENNN";
//String str = "NS";
//System.out.println(palindrome(str));
//System.out.println(shortestpath(str));
//String str = "i am paras";
        // String fruits[] = {"apple", "mango", "banana"};
        // String largest = fruits[0];
        // for (int i = 1; i < fruits.length; i++) {
        //     if (largest.compareTo(fruits[i]) < 0) {
        //         largest = fruits[i];
        //     }

        // }
        // System.out.println(largest);

        //toUpperCase(str);

        String str = "aaabbcccdd";
        System.out.print(compress(str));
    }
}
