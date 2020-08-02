public class Extends {
    public static void main(String[] args) {
        Teacher teacher=new Teacher();
        teacher.printName();
        System.out.println(teacher.name);

    }
}

class Employee {

    String name;
    Employee(){
        name="hello";
    }
    public void work(){
        System.out.println("work");
    }
}
class Teacher extends Employee {
    String name;
    Teacher(){
        super();
        name="world";
    }
    public void printName(){
        System.out.println("name= "+super.name);
    }
}
































