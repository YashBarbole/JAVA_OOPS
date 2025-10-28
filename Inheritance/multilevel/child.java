package Inheritance.multilevel;

public class child extends boy{
    String color;   
    child(){
        super();
        this.color="white";
    }

    child(child other){
        super(other);
        this.color=other.color;
    }

    
}
