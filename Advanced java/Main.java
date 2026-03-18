// class Plant{
//     String genus;
//     String name;
//     void print(){
//         System.out.println(name);
//     }
    
// }
// class mango extends Plant{
//         mango(String name){
//           this.name = name;
//         }
//     }
// public class Main{
//     public static void main(String[] args) {
//         Plant p = new mango("manifera");
//         p.print();
//     }
// }

// class Main
// {
// interface  motion{
//   void sound();
// }

// abstract class plant{
//   abstract void sound();
// }

// class hlo extends plant implements motion{
//     public void sound(){
//         System.out.println("hloo plant");
//     }
// }

//  public static void main(String [] args){
//      Main m = new Main();
//      hlo h = m.new hlo();
//      motion r = h;
//      r.sound();
//      plant s = h;
//      s.sound();
//  }
// }

// import java.util.*;
// public class Main{
//     public static void main(String[] args) {
//        int a ,b;
//        Scanner sc = new Scanner(System.in);
//        a = sc.nextInt();
//        b= sc.nextInt();
//        try {
//          System.out.println(a/b);    
//        }catch(ArithmeticException e){
//          System.out.println("error");
//        }
       
//     }
// }


class A extends Thread{
    public void run(){
    for(int i = 1; i<10; i++){
        System.out.print("A");
    }}
}

class B extends Thread{
    public void run(){for(int i = 1; i<10; i++){
        System.out.print("B");
    }}
}


public class Main{
    public static void main(String [] args){
      A a = new A();
      B b = new B();
      a.start();
      b.start();
    }
}