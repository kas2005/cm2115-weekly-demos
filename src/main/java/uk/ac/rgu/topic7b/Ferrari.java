package uk.ac.rgu.topic7b;

public class Ferrari implements Car {

    @Override
    public void accept(CarVisitor visitor) {
        visitor.visit(this);
        
    }

    public void someFerrariMethod(){
        System.out.println("ferrari method");
    }
    
}
