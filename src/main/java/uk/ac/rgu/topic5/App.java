package uk.ac.rgu.topic5;

import uk.ac.rgu.topic5.Laptop.LaptopScreen;

public class App {

    public static void main(String[] args){

        Laptop laptop = new Laptop();
        LaptopScreen screen = laptop.new LaptopScreen(15, "1024x768" );
    }
    
}
