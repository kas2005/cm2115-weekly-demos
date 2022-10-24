package uk.ac.rgu.topic4;

public class Pegasus extends Horse implements CanFly {
    
    public Pegasus(String name){
        super(name);

    }

    @Override
    public void fly(){
        System.out.println("Pegasus is flying");
    }

    

}
