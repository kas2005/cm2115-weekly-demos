package uk.ac.rgu.topic4;

public class Eagle extends Bird implements CanFly, IsPredator {
    public Eagle (String name){
        super(name);
    
}

    @Override
    public String makeSound() {
        return ": tweet";
    }
    @Override
    public void fly() {
        System.out.println("The Eagle Soared");
    }
   @Override
   public void eat(){
    System.out.println( "I'm eating!");
   }
    

}
