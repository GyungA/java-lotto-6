package lotto.View;

import camp.nextstep.edu.missionutils.Console;

import java.util.ArrayList;
import java.util.List;

public class WinningLottoGenerator {
    public static List<Integer> WINNING_NUMBERS;
    public static Integer BONUS_NUMBER;
    private static final String WINNING_NUMBER_MESSAGE = "당첨 번호를 입력해 주세요. (쉼표로 구분)";
    private static final String BONUS_NUMBER_MESSAGE = "보너스 번호를 입력해 주세요.";
    private static final String NUMBER_FORMAT_ERROR_MESSAGE = "입력값 %s는 올바른 숫자 형식이 아닙니다. ";
    public static void generateWinningNumbers() {
        System.out.println(WINNING_NUMBER_MESSAGE);
        String[] numberStrings = Console.readLine().split(",");
        convertStringToInteger(numberStrings);
    }

    private static List<Integer> convertStringToInteger(String[] numberStrings) {
        List<Integer> winningNumbers = new ArrayList<>();
        for (String numberString : numberStrings) {
            try {
                int number = Integer.parseInt(numberString.trim());
                winningNumbers.add(number);
            } catch (NumberFormatException e) {
                System.out.println(String.format(NUMBER_FORMAT_ERROR_MESSAGE, numberString));
            }
        }
        WINNING_NUMBERS = winningNumbers;
        return winningNumbers;
    }

    public static Integer generateBonusNumber() {
        System.out.println(BONUS_NUMBER_MESSAGE);
        BONUS_NUMBER = Integer.parseInt(Console.readLine());
        return BONUS_NUMBER;
    }
}
