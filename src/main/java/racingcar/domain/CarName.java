package racingcar.domain;

import racingcar.common.ErrorMessage;

/**
 * CarName
 *
 * @author suji
 * @date 2022-04-23
 **/
public class CarName {

    private final int MAX_SIZE = 5;
    private String name;

    public CarName(String name) {
        validate(name);
        this.name = name;
    }

    private void validate(String name) {
        if (isEmpty(name)) {
            throw new IllegalArgumentException(ErrorMessage.ERROR_CAR_NAME_EMPTY);
        }
        if (greaterThenMaxSize(name)) {
            throw new IllegalArgumentException(ErrorMessage.ERROR_CAR_NAME_SIZE);
        }
    }

    private boolean greaterThenMaxSize(String name) {
        return name.length() > MAX_SIZE;
    }

    private boolean isEmpty(String name) {
        return name == null || name.trim().length() == 0;
    }

    public String getName() {
        return name;
    }
}
