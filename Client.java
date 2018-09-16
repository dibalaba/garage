package com.learning.garage;

public class Client {
    String name;
    String lastname;
    String brand;


    public Client (String carBrand){

        this.brand=carBrand;
    }

    public void carBroken(){
        System.out.print("my car is broken");
    }

    public void bringCarToMechanic(){
        System.out.println("I bring my to the garage to fix the issue");

    }
     public boolean greetings(){

        System.out.println("Hello Sir How you doing?" + "Can you repair a" + this.brand + "?");
        
     }
}
