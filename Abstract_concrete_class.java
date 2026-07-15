package com;
import static java.lang.System.*;

abstract public class Abstract_concrete_class {
    abstract void display();
    
    // CHANGED: Added 'public' to perfectly match the interface requirement
    public void display1() {
        out.println("The interface is displaying:-");
    }
}
