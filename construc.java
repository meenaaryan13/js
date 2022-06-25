public class construc{
  String str;
  int in;
        construc(String str,int in)
  {
    this.str=str;
    this.in=in;
  }
  public static void main(String[] args) {
    construc obj =new construc("Deepak",5);

    System.out.println("Student_Name "+obj.str+"  Serial No.  "+obj.in);
    System.out.println(obj.in);
  }
  
}
