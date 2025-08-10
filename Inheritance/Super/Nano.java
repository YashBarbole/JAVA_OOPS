package Inheritance.Super;

public class Nano extends Vehicle{
    String color;

    Nano(){
        super();
        this.color="yellow";
    }
    Nano(Nano other){
        super(other);
        this.color=other.color;
    }
    
}
