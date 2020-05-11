package com.test;

public class HeathyBurger extends Hamburger{

    private String Addition5;
    private String Addition6;
    private double addPrice5;
    private double addPrice6;

    public HeathyBurger(String name, String Meat, double Price){
        super(name, "Brown rye bread roll",Meat,Price);
    }



    public void setAddition5(String addition5, double addPrice5) {
        Addition5 = addition5;
        this.addPrice5 = addPrice5;
    }

    public void setAddition6(String addition6, double addPrice6) {
        Addition6 = addition6;
        this.addPrice6 = addPrice6;
    }

    @Override
    public double getTotalPrice (){
       return (getPrice() + getAddPrice1() + getAddPrice2() +getAddPrice3()  +getAddPrice4()+
               this.addPrice5 + this.addPrice6);
    }


}
