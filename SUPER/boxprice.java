package SUPER;

public class boxprice extends boxwt{
    int price;
    boxprice(int l,int w,int h,int wt,int price){
        super(l,h,w,wt);
        this.price=price;
    }
    boxprice(){
        super();
        this.price=-1;

    }
    
}
