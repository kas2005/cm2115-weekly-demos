package uk.ac.rgu.topic7b;

public class App {

    public static void main(String[] args){

        Car[] cars ={new Ford(), new Ferrari()};
                
        CarVisitor visitor = new BasicServiceVisitor();

        for(Car car: cars){
            car.accept(visitor);
        }

}
}
