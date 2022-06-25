interface A{
     public  void show();
}

class inter implements A {
 public void show()
  {
    System.out.print("hii");

  
  }
  public static void main(String[] args) {
    inter a1=new inter();
    a1.show();
  }
}