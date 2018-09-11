package se.iths.martin.invocation;

public class SubChooseMethod extends ChooseMethod {
    @Override
    public void doSomething(Integer i) {
        System.out.println("Subclass Integer method");
    }
}
