package racingcar.domain;

/**
 * 단일 자동차
 *
 * @author suji
 * @date 2022-04-23
 **/
public class Car {

    private CarName carName;
    private MovementCount movementCount;

    private Car(CarName carName, MovementCount movementCount) {
        this.carName = carName;
        this.movementCount = movementCount;
    }

    public static Car newInstance(String name) {
        return new Car(new CarName(name), new MovementCount());
    }

    public void move(int moveNumber) {
        this.movementCount.increase(moveNumber);
    }

    public String getName() {
        return this.carName.getName();
    }

    public CarName getCarName() {
        return carName;
    }

    public Integer getMoveCount() {
        return this.movementCount.getCount();
    }

    public MovementCount getMovementCount() {
        return movementCount;
    }
}
