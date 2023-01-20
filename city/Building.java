package city;

public abstract class Building {

    protected final int number;

    protected Building(int address) {
        this.number = address;
    }

    public int getNumber() {
        return number;
    }

}
