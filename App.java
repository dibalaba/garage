package com.learning.garage;

public class App {
    public static void main(String[] args) {
        Mechanics Guy=new Mechanics();
        Guy.repair();

        Client client=new Client("peugeot");
        client.greetings();
    }
}
