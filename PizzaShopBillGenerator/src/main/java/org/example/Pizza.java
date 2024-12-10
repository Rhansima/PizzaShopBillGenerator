package org.example;

public class Pizza {
    private int price;
    private Boolean veg;
    private int extraCheesePrice = 100;
    private int extraToppingPrice = 100;
    private int bagPack = 20;
    private int basePizzaPrice;
    private boolean isExtraCheeseAdded = false;
    private boolean isExtraToppingAdded=false;
    private boolean isOrderForTakeAway=false;


   // constructor
    public Pizza(Boolean veg) {
        this.veg = veg;
        if(this.veg){
            this.price= 300;
        } else {
            this.price = 400;
        }
        basePizzaPrice = this.price;
    }
//    public void getPizzaPrice(){
//        System.out.println(this.price);
//    }
    public void addExtraCheese(){
        isExtraCheeseAdded = true;
        System.out.println("Extra cheese added");
        this.price += extraCheesePrice;

    }

    public void addExtraTopping(){
        isExtraToppingAdded = true;
        System.out.println("Extra topping added");
        this.price += extraToppingPrice;

    }

    public void takeAway(){
        isOrderForTakeAway = true;
        System.out.println("Take Away");
        this.price += bagPack;

    }

    public void getBill(){
        String bill ="";
        System.out.println("pizza : "+basePizzaPrice);
        if (isExtraCheeseAdded){
            bill += "Extra cheese added :" +extraCheesePrice+ "\n";
        }
        if(isExtraToppingAdded){
            bill += "Extra topping added : " +extraToppingPrice+ "\n";
        }
        if (isOrderForTakeAway){
            bill += "Take away : " +isOrderForTakeAway + "\n";
        }
        bill += "Total Bill is :" +this.price +"\n";
        System.out.println(bill);

    }
}

