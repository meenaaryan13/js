class A1{
       int empid;

       public void setempid(int A)
       {
              empid=A;
       }
       public int  getempid()

      {
        return empid;
      }

}
public class encap {
  public static void main(String[] args) {
    A1 B1=new A1();
    B1.setempid(5);
    System.out.print(B1.empid);
  }
}
