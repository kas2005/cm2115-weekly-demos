package uk.ac.rgu.topic4;

public class App {

    public static void main(String[] args){

        CanFly[] flyingThing = new CanFly[3];
        flyingThing[0] = new Eagle ("Kenny");
        flyingThing[1] = new Pegasus ("Bob");
        flyingThing[3] = new Plane ();

        for (int i=0;i<flyingThing.length;i++){
            System.out.println(flyingThing[i].getFlyingDistance());
        
        }

}
    //public static void acceptFlying ;
}

    

