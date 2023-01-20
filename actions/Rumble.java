package actions;

import java.util.Objects;

public class Rumble {

    private String description;

    public Rumble(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void stay() {
        System.out.print("стоять");
    }

    @Override
    public String toString() {
        return description + " гул ";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rumble rumble = (Rumble) o;
        return Objects.equals(description, rumble.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description);
    }
}
