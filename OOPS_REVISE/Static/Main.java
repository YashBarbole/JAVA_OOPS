package OOPS_REVISE.Static;

import polymorphism.overriding.human;

public class Main {

    public static void main(String[] args) {
    Human yash=new Human(21,"YASH" ,999999 , false);
    Human om= new Human(21, "om", 99999, false);
         System.out.println(yash.name);
         System.out.println(yash.population);
         System.out.println(om.population);
    }    
}
