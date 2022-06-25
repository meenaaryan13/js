abstract class x{
 void  A()
    {
       
    };

}
class y{
    y()
  {
    System.out.println(" Absract class X access by ");
  }
}
 class z extends y{
       z()
  {
     
    System.out.println("Absract class X access by z class ");
  }
}
public class Absract{
      public static void main(String[] args) {
        // y th =new z();
        // the.A();

        // z th=new z();
        // th.A();
      }
};

