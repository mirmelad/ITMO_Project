package city;

import java.util.Objects;

public class Window {

    private Shutters shutters;

    public Window(Shutters shutters){
        this.shutters = shutters;
    }

    public Shutters getShutters() {
        return shutters;
    }

    public void setShutters(Shutters shutters) {
        this.shutters = shutters;
    }


    @Override
    public String toString() {
        return "окно";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Window window = (Window) o;
        return Objects.equals(shutters, window.shutters);
    }

    @Override
    public int hashCode() {
        return Objects.hash(shutters);
    }
}
