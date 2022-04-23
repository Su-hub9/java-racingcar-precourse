package racingcar.controller;

import racingcar.domain.*;
import racingcar.view.InputProvider;
import racingcar.view.OutputProvider;

/**
 * RacingCarGame
 *
 * @author suji
 * @date 2022-04-23
 **/
public class RacingCarGame {

    public void start() {
        Cars cars = getCars();
        RacingCount racingCount = getRacingCount();
        execute(cars, racingCount);
    }

    public void execute(Cars cars, RacingCount racingCount) {
        OutputProvider.printExecuteResultTitle();
        int tryCount = 0;
        while (!racingCount.isEnd(tryCount)) {
            tryCount++;
            play(cars);
        }
        gameResult(cars);
    }

    public void play(Cars cars) {
        MoveNumbers moveNumbers = MoveNumbers.newInstance();
        moveNumbers.addRandomNumbers(cars.size());
        cars.moveCars(moveNumbers);
        OutputProvider.printExecuteResult(cars);
    }

    public void gameResult(Cars cars) {
        Ranking ranking = new Ranking(cars);
        FinalWinners finalWinners = new FinalWinners(ranking);
        OutputProvider.printFinalWinners(finalWinners);
    }

    private Cars getCars() {
        Cars cars = null;
        while (isEmptyCars(cars)) {
            cars = createCars(cars);
        }
        return cars;
    }

    private Cars createCars(Cars cars) {
        try {
            String carNames = InputProvider.inputCarNames();
            cars = Cars.newInstance(carNames);
        } catch (IllegalArgumentException e) {
            OutputProvider.printExceptionMessage(e);
        }
        return cars;
    }

    private boolean isEmptyCars(Cars cars) {
        return cars == null || cars.isEmpty();
    }

    private RacingCount getRacingCount() {
        RacingCount racingCount = null;
        while (isEmptyRacingCount(racingCount)) {
            racingCount = createRacingCount(racingCount);
        }
        return racingCount;
    }

    private RacingCount createRacingCount(RacingCount racingCount) {
        try {
            String inputCount = InputProvider.inputRacingCount();
            racingCount = new RacingCount(inputCount);
        } catch (IllegalArgumentException e) {
            OutputProvider.printExceptionMessage(e);
        }
        return racingCount;
    }

    private boolean isEmptyRacingCount(RacingCount racingCount) {
        return racingCount == null || racingCount.getCount() == 0;
    }
}
