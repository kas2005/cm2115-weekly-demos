package uk.ac.rgu.topic7;

public class AntiqueFurnitureFactory implements FunitureFactory {

    @Override
    public Chair getChair() {
       return new AntiqueChair();
    }

    @Override
    public Table getTable() {
       return new AntiqueTable();
    }

    
}
