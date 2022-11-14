package uk.ac.rgu.topic7;

public class ModernFurnitureFactory implements FunitureFactory {

    @Override
    public Chair getChair() {
        return new ModernChair();
    }

    @Override
    public Table getTable() {
        return new ModernTable();
    }
    
}
