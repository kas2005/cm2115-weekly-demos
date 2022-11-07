package uk.ac.rgu.topic6;

public class VerboseLogger implements Logger {

    private static VerboseLogger instance = null;

    public static VerboseLogger getInstance(){
            if(instance == null){
            instance = new VerboseLogger();
        }
        return instance;
        }
    
    private VerboseLogger(){

    }

    @Override
    public void log(String message) {
        System.out.println("Verbose logger" + message);
        
    }
    
    

}