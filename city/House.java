package city;

import java.util.Objects;

public class House extends Building {

    private Window window;

    public House(int number, Window window) {
        super(number);
        this.window = window;
    }


    public Window getWindow() {
        return window;
    }

    public void setWindow(Window window) {
        this.window = window;
    }

    @Override
    public String toString() {
        return "дом номер" + number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        House house = (House) o;
        return Objects.equals(window, house.window);
    }

    @Override
    public int hashCode() {
        return Objects.hash(window);
    }
}
