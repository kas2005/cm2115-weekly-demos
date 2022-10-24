package uk.ac.rgu.topic4;

public interface CanFly {
   
    public void fly();

    default int getFlyingDistance(){
        return -1;
    }
    
}
