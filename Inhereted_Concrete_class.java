package com;
import static java.lang.System.*;

public class Inhereted_Concrete_class extends Abstract_concrete_class implements Concrete_class {

    @Override
    public void display() {
        out.println("The abstract class is displaying:");
    }
    
    // Optional but safe: You can explicitly call super if you want to override it here
    @Override
    public void display1() {
        super.display1();
    }
}
