abstract class abstractClass {
    abstract void abstractMethod();
    
    void concreteMethod() { 
        System.out.println("This is a concrete method.");
    }
}

class B extends abstractClass {
    void abstractMethod() {
        System.out.println("B's implementation of abstractMethod.");
    }
}

// Dito ilalagay ang implementation para sa Class C
class C extends abstractClass {
    @Override
    void abstractMethod() {
        System.out.println("C's implementation of abstractMethod.");
    }
}

public class Task14 {
    public static void main(String args[]) {
        // Para kay B
        B b = new B();
        b.abstractMethod();
        b.concreteMethod();
        
        // Para kay C
        C c = new C();
        c.abstractMethod();
        c.concreteMethod();
    }
}