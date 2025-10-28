package Inheritance;
//inherit from box
public class boxwt extends box {
    double weight;

    public boxwt(){
        this.weight=-1;
    }

    public boxwt(double l, double h, double w, double weight){
        super(l,h,w);                                          //inititalise props from parent class
        this.weight=weight;
    }

    boxwt(boxwt other){
        super(other);
        weight=other.weight;
    }

}
