package racingcar.domain;

import racingcar.common.ErrorMessage;

import java.util.Arrays;
import java.util.List;

/**
 * MoveNumbers
 *
 * @author suji
 * @date 2022-04-23
 **/
public class MoveNumbers {

    private List<Integer> moveNumbers;

    private MoveNumbers(List<Integer> moveNumbers) {
        this.moveNumbers = moveNumbers;
    }

    public static MoveNumbers newInstance(Integer... moveNumber) {
        return new MoveNumbers(Arrays.asList(moveNumber));
    }

    public void addNumber(Integer number) {
        this.moveNumbers.add(number);
    }

    public Integer getIndex(int index) {
        if (isEmpty()) {
            throw new IllegalStateException(ErrorMessage.ERROR_NOT_MOVE_NUMBERS);
        }
        return this.moveNumbers.get(index);
    }

    private boolean isEmpty() {
        return this.moveNumbers == null || this.moveNumbers.isEmpty();
    }
}
