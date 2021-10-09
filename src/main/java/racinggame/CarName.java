package racinggame;

import java.util.Objects;

public class CarName {
    private final String name;

    public CarName(String name) {
        this.name = name;
    }

    public boolean isBlank() {
        return Objects.isNull(name) || "".equals(this.name.trim());
    }

    public boolean isOverLength(int length) {
        return this.name.length() > length;
    }

    public String value() {
        return this.name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CarName carName = (CarName) o;
        return Objects.equals(name, carName.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
