package Interface;

public class Car implements Engine,Brake{
    @Override
    public void brake(){
        System.out.println("i brake like normal car");
    }
    @Override
    public void start(){
        System.out.println("start");
    }
    @Override
    public void acc(){
System.out.println("accelerate");
    }
    @Override
    public  void stop(){
System.out.println("stop");
    }
}
