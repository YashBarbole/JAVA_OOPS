package SUPER;

public class boxwt extends box{
    int wt;
    boxwt(){
        this.wt=-1;
    }

    boxwt(int l,int h,int w,int wt){
        super(l,h,w);
        this.wt=wt;
    }
    
}
