package hu.fenyvesvolgyimate.RomanNumberConverter;

public class RomanNumberConverter {
    public String convertToRoman(int input) {
        checkInput(input);
        String result;
        if (input <= 3)
            result = printOneFor(input);
        else if (input < 5)
            result = printOnesBeforeFive(5 - input);
        else if (input == 5)
            result = "V";
        else
            result = printOnesAfterFive(input - 5);
        return result;
    }

    private String printOnesAfterFive(int numbersOfOne) {
        return "V" + printOneFor(numbersOfOne);
    }

    private String printOnesBeforeFive(int numbersOfOne) {
        return printOneFor(numbersOfOne) + "V";
    }

    private String printOneFor(int input) {
        return "I".repeat(Math.max(0, input));
    }

    private void checkInput(int input) {
        if (input <= 0)
            throw new IllegalArgumentException();
    }
}
