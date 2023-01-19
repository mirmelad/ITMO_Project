package city;

import java.util.Objects;

public class Rattle {

    private int amountOfBlades;

    public Rattle(int amountOfBlades) {
        this.amountOfBlades = amountOfBlades;
    }

    public int getAmountOfBlades() {
        return amountOfBlades;
    }

    public void setAmountOfBlades(int amountOfBlades) {
        this.amountOfBlades = amountOfBlades;
    }

    public void crackle() {
        System.out.print("трещать");
    }

    @Override
    public String toString() {
        return "трещотка";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rattle rattle = (Rattle) o;
        return amountOfBlades == rattle.amountOfBlades;
    }

    @Override
    public int hashCode() {
        return Objects.hash(amountOfBlades);
    }
}
