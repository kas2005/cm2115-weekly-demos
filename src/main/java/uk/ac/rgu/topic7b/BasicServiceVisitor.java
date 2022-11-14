package uk.ac.rgu.topic7b;

public class BasicServiceVisitor implements CarVisitor {

    @Override
    public void visit(Ford car) {
        car.someFordMethod();
    }

    @Override
    public void visit(Ferrari car) {
        car.someFerrariMethod();
        }
    
}
