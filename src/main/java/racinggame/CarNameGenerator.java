package racinggame;

public class CarNameGenerator {
   public static CarName createCarName(String name, CarNameValidationPolicy carNameValidationPolicy) {
        CarName carName = new CarName(name);
        if (carName.isBlank() || carName.isOverLength(carNameValidationPolicy.getCarNameLength())) {
            throw new IllegalArgumentException("차 이름은 1자 이상 5자 이하로 입력하세요.");
        }
        return carName;
    }
}
