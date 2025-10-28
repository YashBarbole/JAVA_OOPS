package Inheritance;

public class boxprice extends boxwt{
    double cost;

    boxprice(){
        super();
        this.cost=-1;
    }
    
    boxprice(boxprice other){
        super(other);
        this.cost=other.cost;
    }

    boxprice(double l, double h, double w, double weight, double cost){
        super(l,h,w,weight);
        this.cost=cost;
    }
}
