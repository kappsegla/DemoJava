package se.iths.martin.invocation;

public class ChooseMethod {

    public void doSomething(Number n) {
        System.out.println("Numbers");
    }
    public void doSomething(Integer i){
        System.out.println("Integer");
    }
    /**
     * Varargs method will have lowest priority
     * when overloading is decided
     */
    public void doSomething(Integer... i){
        System.out.println("Vararg");
    }
}
