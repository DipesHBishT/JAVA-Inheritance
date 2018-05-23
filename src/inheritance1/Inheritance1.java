/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance1;

/**
 *
 * @author dipesh bIsht
 */
class A{
    
    int a,b,c;
    A(int a,int b)
    {
        this.a=a;
        this.b=b;
    
    }
    
    void add()
    {
        c=a+b;
    }
    
    public void display()
    {
        System.out.println("SUM:"+c);
    }
}

class B extends A{
    
    B(int a,int b)
    {
       super(a,b); 
    }
    
    @Override
    void add() {
        //super.add();
        c=a*b;
    }
}


public class Inheritance1 {
    
    
    
    public static void main(String[] args) {
        B obj =new B(10,200);
        obj.add();
        obj.display();
    }
    
}
