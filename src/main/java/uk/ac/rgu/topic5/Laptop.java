package uk.ac.rgu.topic5;

public class Laptop {


     public class LaptopScreen{
    
            private int size;
            public int getSize() {
                return size;
            }
    
            private String resolution;
            //private <something> materialType;
        
            public String getResolution() {
                return resolution;
            }
    
            public LaptopScreen(int size, String resolution){
    
                this.size = size;
                this.resolution = resolution;
                
            }
        }
        
    }
    
}
