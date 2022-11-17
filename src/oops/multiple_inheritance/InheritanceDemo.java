package oops.multiple_inheritance;

public class InheritanceDemo {
    public static void main(String[] args) {
        Parent obj = new Child();
        obj.show();
    }
}

class Parent {
    void show() {
        System.out.println("This is Parent");
    }
}

class Child extends Parent {
    void show() {
        System.out.println("this is child");
    }
}
