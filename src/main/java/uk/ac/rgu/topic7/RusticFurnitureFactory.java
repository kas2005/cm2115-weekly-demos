package uk.ac.rgu.topic7;

public class RusticFurnitureFactory implements FunitureFactory {

    @Override
    public Chair getChair() {
        return new RusticChair();
    }

    @Override
    public Table getTable() {
        return new RusticTable();
    }
    
}
