package com.app;

public class Hamburger {
    private String Name;
    private String Bread;
    private String Meat;
    private String Addition1;
    private String Addition2;
    private String Addition3;
    private String Addition4;
    private double addPrice1;
    private double addPrice2;
    private double addPrice3;
    private double addPrice4;
    private double price;


    public Hamburger (String Name, String Bread, String Meat, double Price){
        this.Name = Name;
        this.Bread = Bread;
        this.Meat = Meat;
        this.price = Price;
        this.addPrice1 = 0;
        this.addPrice2 = 0;
        this.addPrice3 = 0;
        this.addPrice4 = 0;
    }

    public void setAddition1(String addition1, double addPrice1) {
        Addition1 = addition1;
        this.addPrice1 = addPrice1;
    }

    public void setAddition2(String addition2, double addPrice2) {
        Addition2 = addition2;
        this.addPrice2 = addPrice2;
    }

    public void setAddition3(String addition3, double addPrice3) {
        Addition3 = addition3;
        this.addPrice3 = addPrice3;
    }

    public void setAddition4(String addition4, double addPrice4) {
        Addition4 = addition4;
        this.addPrice4 = addPrice4;
    }

    public double getAddPrice1() {
        return addPrice1;
    }

    public double getAddPrice2() {
        return addPrice2;
    }

    public double getAddPrice3() {
        return addPrice3;
    }

    public double getAddPrice4() {
        return addPrice4;
    }

    public double getPrice() {
        return price;
    }

    public double getTotalPrice (){
        return (this.price + this.addPrice1 + this.addPrice2 + this.addPrice3
        + this.addPrice4);
    }
}


