package Inheritance.Super;

public class Vehicle {
    int wheels;
    String engine;

    Vehicle(){
        this.wheels=4;
        this.engine="front";
    }

    Vehicle(Vehicle other){
        this.wheels=other.wheels;
        this.engine=other.engine;
    }
}
