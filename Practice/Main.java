public class Main{
    // longest common prefix
    public static void longest(String[] ch) {
      if(ch == null || ch.length==0 ){
        System.out.println("");
        return;
      }
        int c = ch.length;

        //mim length  
        StringBuilder str = new StringBuilder("");
    
        int length = Integer.MAX_VALUE;
        
        for(int j = 0; j< c;j++){
             length = Math.min(length,ch[j].length());
        }
        
        //compare character
        for (int i = 0; i < length; i++) {
        char current = ch[0].charAt(i);

        for (int j = 1; j < ch.length; j++) {
            if (ch[j].charAt(i) != current) {
                System.out.println(str.toString());
                return;
            }
        }
        str.append(current);
    }

        System.out.println(str);
        
    }
  public static void main(String[] args) {
      //String str[]= {"flower","flow"};
      String ch[]= {"flower","flow","flight"};

      //System.out.println(ch.charAt(3));
    //longest("hlo", "yu"); 
      //longest(str);
      longest(ch);
  }
}