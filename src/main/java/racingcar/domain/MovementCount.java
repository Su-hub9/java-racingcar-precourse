package racingcar.domain;

/**
 * MovementCount
 *
 * @author suji
 * @date 2022-04-23
 **/
public class MovementCount {

    private final int INCREASE_CONDITION = 4;
    private Integer count;

    public MovementCount() {
        this.count = 0;
    }

    public void increase(int moveNumber) {
        if (moveNumber >= INCREASE_CONDITION) {
            this.count++;
        }
    }

    public Integer getCount() {
        return count;
    }
}
