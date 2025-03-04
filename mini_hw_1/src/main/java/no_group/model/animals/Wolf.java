package no_group.model.animals;

public class Wolf extends Predator {
    public Wolf() {
        inventorialNumber = inventoriedCounter;
    }
    public Wolf(int fd) {
        inventorialNumber = inventoriedCounter;
        food = fd;
    }

    //будем считать, что прибавление за нас уже кто-то делает
    public Wolf(int f, int inventorialnumber) {
        inventorialNumber = inventorialnumber;
        food = f;
    }
    
    @Override
    public void writeInfo() {
        System.out.println("Wolf");
        super.writeInfo();
    }
}