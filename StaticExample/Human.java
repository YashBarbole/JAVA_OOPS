package StaticExample;

public class Human {
    int age;
    String name;
    int salary;
    boolean married;
    static int pop;

    public Human(int age,
    String name,
    int salary,
    boolean married){
            this.age=age;
            this.name=name;
            this.salary=salary;
            this.married=married;
            Human.pop+=1;
    }

}
