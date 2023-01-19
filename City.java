package city;

import java.util.Arrays;
import java.util.Objects;

public class City {

    private Street[] streets;


    private Mill mill;

    public City(Street[] streets, Mill mill) {
        this.streets = streets;
        this.mill = mill;
    }

    public Mill getMill() {
        return mill;
    }

    public void setMill(Mill mill) {
        this.mill = mill;
    }


    public Street[] getStreets() {
        return streets;
    }

    public void setStreets(Street[] streets) {
        this.streets = streets;
    }

    @Override
    public String toString() {
        return "City{" +
                "streets=" + Arrays.toString(streets) +
                ", mill=" + mill +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        City city = (City) o;
        return Arrays.equals(streets, city.streets) && Objects.equals(mill, city.mill);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(mill);
        result = 31 * result + Arrays.hashCode(streets);
        return result;
    }
}
