package com.driver;
class A{
    public void meth(){
        System.out.print("Invoking method from class A");
        
    }
}
class B extends A{
    @Override
    public void meth(){
        System.out.print("Method is overridden in Extendend class B");
    }
}
public class Main {
  public static void main(String[] args) {
    B ob1 = new B();
    ob1.meth();
  }
}