package city;

import java.util.Arrays;
import java.util.Objects;

public class Street {

    private House[] houses;

    private String name;

    public Street(String name, House[] houses) {
        this.name = name;
        this.houses = houses;
    }

    public House[] getHouses() {
        return houses;
    }

    public void setHouses(House[] houses) {
        this.houses = houses;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "улица " + name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Street street = (Street) o;
        return Arrays.equals(houses, street.houses) && Objects.equals(name, street.name);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(name);
        result = 31 * result + Arrays.hashCode(houses);
        return result;
    }
}
