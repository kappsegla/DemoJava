package se.iths.martin.invocation;


import java.util.Scanner;

/**
 * Signature of the method to be invoked is decided at compiletime.
 * Selection of the right implementation of method is done at runtime.
 */

public class MethodChooser {
    public static void main(String[] args) {
        ChooseMethod m = new ChooseMethod();
        m.doSomething(10);
    }
}
