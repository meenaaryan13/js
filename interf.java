interface  A {
  public Void show();
}
class B implements A{
     public Void show()
     {
       System.out.print("A5");
      return null;
     }
}

public class interf {
  public static void main(String[] args) {
    B A2=new B();
    A2.show();
  }
}
