import org.w3c.dom.ls.LSOutput;

public class AbstractClass {
    public static void main(String[] args) {
        B b=new B();
        b.printB();
        b.printA();
        System.out.println(b.print());
    }
}

abstract class A{
    void printA(){
        System.out.println("A");
    }
    abstract String print();
}

class B extends A{
    void printB(){
        System.out.println("B");
    }
    String print(){
        return "hello world";
    }
}
