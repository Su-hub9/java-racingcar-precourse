package racingcar.common;

/**
 * ErrorMessage
 *
 * @author suji
 * @date 2022-04-23
 **/
public class ErrorMessage {
    public static String ERROR_PREFIX = "[ERROR]";
    public static String ERROR_CAR_NAME_EMPTY = formatErrorMessage("자동차 이름은 빈 값일 수 없습니다.");
    public static String ERROR_CAR_NAME_SIZE = formatErrorMessage("자동차 이름은 5자 이하만 가능합니다.");

    private static String formatErrorMessage(String message) {
        return String.format("%s %s", ERROR_PREFIX, message);
    }
}
