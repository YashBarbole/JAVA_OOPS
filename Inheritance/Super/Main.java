package Inheritance.Super;

public class Main {
    public static void main(String[] args) {
        Nano n1= new Nano();
        n1.color="red";
        Nano n2= new Nano(n1);
        System.out.println(n1.engine+" "+ n1.color+" "+n2.engine+ " "+ n2.color);
    }
}
