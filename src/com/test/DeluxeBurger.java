package com.test;

public class DeluxeBurger extends Hamburger{

    public DeluxeBurger (String name, String Bread, String Meat, double Price,
                         String Chips, String Drinks){
        super (name, Bread, Meat,Price);
        setAddition1(Chips,0);
        setAddition2 (Drinks, 0);
    }

    @Override
    public void setAddition3 (String addition3, double addPrice3){
        System.out.println("Can not be added");
    }

    @Override
    public void setAddition4 (String addition4, double addPrice4){
        System.out.println("Can not be added");
    }
    @Override
    public double getTotalPrice (){
        return (getPrice());
    }
}
