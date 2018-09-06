package se.iths.martin.inheritance;

public class C extends A{
    A a;
    B b;

    public C(){
        a = new A();
        b = new B();
    }

}
