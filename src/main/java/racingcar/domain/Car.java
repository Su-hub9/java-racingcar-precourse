package racingcar.domain;

/**
 * 단일 자동차
 *
 * @author suji
 * @date 2022-04-23
 **/
public class Car {

    private CarName carName;
    private Integer movement;

    private Car(CarName carName) {
        this.carName = carName;
        this.movement = 0;
    }

    public static Car newInstance(String name) {
        return new Car(new CarName(name));
    }

    public String getName() {
        return this.carName.getName();
    }

    public CarName getCarName() {
        return carName;
    }

    public Integer getMovement() {
        return movement;
    }
}
