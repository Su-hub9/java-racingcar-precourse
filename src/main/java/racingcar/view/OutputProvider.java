package racingcar.view;

import racingcar.common.GameMessage;
import racingcar.domain.Car;
import racingcar.domain.Cars;

/**
 * OutputProvider
 *
 * @author suji
 * @date 2022-04-23
 **/
public class OutputProvider {

    public static void printExceptionMessage(Exception e) {
        System.out.println(e.getMessage());
    }

    public static void printExecuteResultTitle() {
        System.out.print(GameMessage.NEXT_LINE);
        System.out.println(GameMessage.EXECUTE_RESULT_TITLE);
    }

    public static void printExecuteResult(Cars cars) {
        for (Car car : cars.getCars()) {
            System.out.printf(
                    GameMessage.EXECUTE_RESULT_FORMAT, car.getCarName(), getMoveHyphen(car.getMovementCount())
            );
        }
        System.out.print(GameMessage.NEXT_LINE);
    }

    private static String getMoveHyphen(Integer movementCount) {
        StringBuilder moveHyphen = new StringBuilder();
        for (int i = 0; i < movementCount; i++) {
            moveHyphen.append(GameMessage.MOVE_HYPHEN);
        }
        return moveHyphen.toString();
    }
}
