class overloading{
  void meth1(int n,int z)
  {
    System.out.println("Method 1 ");
  }
  void meth1()
  {
    System.out.println("Method 2");
  }
  public static void main(String[] args) {
    overloading over1=new overloading();
    over1.meth1(5,5);
  }
}