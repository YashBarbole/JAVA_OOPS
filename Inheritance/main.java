package Inheritance;

public class main {
    public static void main(String[] args) {
        
    //     // box boxx= new box();

    //     // System.out.println(boxx.l+" "+ boxx.w+" "+boxx.h);
    // boxwt box3 = new boxwt();
    // System.out.println(box3.h+" "+box3.weight);

    // boxwt box4= new boxwt(3,4,5,6);
    // System.out.println(box4.w+" "+box4.h);

    // boxprice box0= new boxprice();// this calls super in box price that is above it that is  const of box wt
    // System.out.println(box0.weight);
    // System.out.println(box0.h);
    // System.out.println(box0.cost);
    // System.out.println(box0.w);
    // System.out.println(box0.l);


    box box13=new box(4);
    System.out.println(box13.h);

    box box9= new boxwt(2,3,4,5);
    System.out.println(box9.h);
    }
}
