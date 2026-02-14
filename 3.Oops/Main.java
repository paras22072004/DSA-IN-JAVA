public class Main{
  public static void main(String[] args) {
      //pen p1 = new pen();
      pen p1 = new pen(4);
      p1.setcolor("yellow");
      System.out.println(p1.color);
      p1.tip=7;
      p1.setTip(6);
      System.out.println(p1.gettip());
      System.out.println(p1.getcolor());
        System.out.println(p1.tip);
  }
}

class pen{
    String color;
    int tip;

    String getcolor(){
        return this.color;
    }
    void setcolor(String newcolor){
        color=newcolor;
    }

    int gettip(){
        return this.tip;
    }

    void setTip(int newtip){
        tip = newtip;
    }

    //constructor
    //  pen(){
    //    System.out.println("constructor called");
    // }

    pen(int tip){
        this.tip = tip;
    }

}