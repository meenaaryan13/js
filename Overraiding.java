class A{
   
          void A1()
          {
            System.out.println( "A ");
          }
   
};
class B{
  void A1()
  {
    System.out.println("B Class");
  }
  
}

class C{
  void A1()
  {
    System.out.println("C Class");
  }
}

public class Overraiding {
  public static void main(String[] args) {
    A a=new A();
    a.A1();
  }
}
