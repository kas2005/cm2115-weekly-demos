package uk.ac.rgu.topic4;

public class Horse extends Animal {
    public Horse(String name){
        super(name);
    }

    @Override 
    public String makeSound() {
        return this.name + ": neigh";
    }

    
}
