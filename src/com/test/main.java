package com.test;

public class main {
    public static  void main (String args[]){
        Hamburger CheeseBurger = new Hamburger("Cheeseburger", "normal", "beef", 3.99);
        CheeseBurger.setAddition1("ketchup",0.25);
        System.out.println("Price = " + CheeseBurger.getTotalPrice());

        HeathyBurger HealthyBurger1 = new HeathyBurger("H1","Special Bread",5.99) ;
        HealthyBurger1.setAddition1("ketchup",0.25);
        HealthyBurger1.setAddition2("mayo",0.25);
        HealthyBurger1.setAddition3("cucumber",0.65);
        HealthyBurger1.setAddition4("onion",0.85);
        HealthyBurger1.setAddition5("Cola",2.99);
        HealthyBurger1.setAddition6("Pomes frit",1.99);
        System.out.println("Price HealthyBurger1= " + HealthyBurger1.getTotalPrice());


    }
}
