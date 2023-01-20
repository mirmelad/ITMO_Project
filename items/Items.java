package items;

public abstract class Items {

    public String getName() {
        return name;
    }

    public final String name;

    protected Items(String name) {
        this.name = name;
    }
}
