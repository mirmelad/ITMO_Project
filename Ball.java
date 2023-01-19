package items;

import java.util.Objects;

public class Ball implements ItemsActions {

    public String description = ", который по необъяснимым причинам всегда ";
    public String descriptionTo = "не туда, куда надо, а непременно в окно. ";

    public Ball() {

    }

    @Override
    public void fly() {
        System.out.print("летит " + descriptionTo);
    }

    @Override
    public String toString() {
        return "футбольный мяч " + description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ball ball = (Ball) o;
        return Objects.equals(description, ball.description) && Objects.equals(descriptionTo, ball.descriptionTo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description, descriptionTo);
    }
}
