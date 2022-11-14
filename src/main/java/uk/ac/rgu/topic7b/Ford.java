package uk.ac.rgu.topic7b;

public class Ford implements Car {

    @Override
        public void accept(CarVisitor visitor) {
        visitor.visit(this);
    
}
    public void someFordMethod(){
        System.out.println("ferrari method");
}

}