package city;

import java.util.Objects;

public class Shutters {

    private ShuttersStatus status = ShuttersStatus.OPEN;

    private String description;

    private int transmittance;

    private int safety;

    public Shutters(String description, int transmittance, int safety) {
        this.description = description;
        this.transmittance = transmittance;
        this.safety = safety;
    }

    public void open() {
        status = ShuttersStatus.OPEN;
        System.out.print("ставни открыты");
    }

    public void close() {
        status = ShuttersStatus.CLOSED;
        System.out.println("ставни закрыты");
    }

    public void strengthen() {
        safety += 10;
    }

    public void expand() {
        transmittance += 10;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getTransmittance() {
        return transmittance;
    }

    public void setTransmittance(int transmittance) {
        this.transmittance = transmittance;
    }

    public int getSafety() {
        return safety;
    }

    public void setSafety(int safety) {
        this.safety = safety;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Shutters shutters = (Shutters) o;
        return transmittance == shutters.transmittance && status == shutters.status;
    }

    @Override
    public int hashCode() {
        return Objects.hash(status, transmittance);
    }


    @Override
    public String toString() {
        return description + " ставни";
    }
}
