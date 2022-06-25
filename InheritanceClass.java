 class Dog{             // parent class 
  void  eat()
  {
    System.out.println("This inheritade dog class");
  }
}
 class InheritanceClass extends Dog{  
  //  eat.super(); // subclass inherit parent class with the help of extends keyword
  void eat()
  {
    
    
      System.out.println("Inheritance Class ");
    }
    public static void main(String[] args) {
     Dog in=new InheritanceClass();  // Subclass inherit perent class 
      in.eat();

      Dog dd=new Dog();   // Parent class object 
      dd.eat();  
    }
    
  }
  