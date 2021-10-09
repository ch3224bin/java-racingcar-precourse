package racinggame;

public class CarNameGenerator {
   public static CarName createCarName(String name, CarNameValidationPolicy carNameValidationPolicy) {
        CarName carName = new CarName(name);
        if (carName.isBlank() || carName.isOverLength(carNameValidationPolicy.getCarNameLength())) {
            throw new IllegalArgumentException();
        }
        return carName;
    }
}
