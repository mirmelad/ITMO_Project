package city;

import java.util.Objects;

public class Mill extends Building {

    private Rattle rattle;

    public Mill(int number, Rattle rattle) {
        super(number);
        this.rattle = rattle;
    }

    public Rattle getRattle() {
        return rattle;
    }

    public void setRattle(Rattle rattle) {
        this.rattle = rattle;
    }

    @Override
    public String toString() {
        return "мельница номер " + number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mill mill = (Mill) o;
        return Objects.equals(rattle, mill.rattle);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rattle);
    }
}
