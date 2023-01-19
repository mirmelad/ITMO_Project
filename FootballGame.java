package actions;

import items.Ball;

import java.util.Objects;

public class FootballGame extends Actions {

    private Ball ball;

    private String description;

    public FootballGame(String description, Ball ball) {
        this.description = description;
        this.ball = ball;
    }

    public Ball getBall() {
        return ball;
    }

    public void setBall(Ball ball) {
        this.ball = ball;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public void start() {
        System.out.print("начаться");
    }

    @Override
    public void end() {
        System.out.print("закончиться");
    }

    @Override
    public String toString() {
        return description + " футбольная игра ";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FootballGame that = (FootballGame) o;
        return Objects.equals(ball, that.ball) && Objects.equals(description, that.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ball, description);
    }
}
