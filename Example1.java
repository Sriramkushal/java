interface Interface1 {
    void method1();
}

interface Interface2 {
    void method2();
}

class BaseClass {
    void baseMethod() {
        System.out.println("Base class method");
    }
}

class DerivedClass extends BaseClass implements Interface1, Interface2 {
    @Override
    public void method1() {
        System.out.println("Interface1 method");
    }

    @Override
    public void method2() {
        System.out.println("Interface2 method");
    }
}

public class Example {
    public static void main(String[] args) {
        DerivedClass obj = new DerivedClass();
        obj.method1();
        obj.method2();
        obj.baseMethod();
    }
}

