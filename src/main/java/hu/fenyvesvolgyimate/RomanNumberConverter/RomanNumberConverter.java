package hu.fenyvesvolgyimate.RomanNumberConverter;

import java.util.HashMap;
import java.util.Map;

public class RomanNumberConverter {
    Map<Integer, String> defaultNumbers = new HashMap<>(){{
        put(1, "I");
        put(5, "V");
        put(10, "X");
        put(50, "L");
        put(100, "C");
        put(500, "D");
        put(1000, "M");
    }};

    public String convertToRoman(int input) {
        checkInput(input);
        String result;
        if(defaultNumbers.get(input) != null)
            return defaultNumbers.get(input);
        if (input < 4)
            result = printNumberFor(1, input);
        else if(input < 9)
            result = printNumbersByDistance(5,1, input);
        else if (input < 14)
            result = printNumbersByDistance(10,1, input);
        else{
            if(input % 10 != 0)
                result = printNumberFor(10, input/10) + convertToRoman(input % 10);
            else result = printNumberFor(10, input/10);
        }

        return result;
    }

    private String printNumbersByDistance(int firstNumber, int secondNumber, int input){
        int distance;
        if(firstNumber > secondNumber)
            distance = firstNumber - input;
        else
            distance = secondNumber - input;
        String result;
        if(distance < 0)
            result = printNumberAfterNumberForTimes(firstNumber, secondNumber, Math.abs(distance));
        else
            result = printNumberAfterNumberForTimes(secondNumber, firstNumber, Math.abs(distance));
        return result;
    }

    private String printNumberAfterNumberForTimes(int firstNumber, int secondNumber, int timesSecond){
        String firstRomanNumber = defaultNumbers.get(firstNumber);
        String secondRomanNumber = defaultNumbers.get(secondNumber);
        return firstRomanNumber + secondRomanNumber.repeat(timesSecond);
    }

    private String printNumberFor(int number, int times){
        return defaultNumbers.get(number).repeat(times);
    }

    private void checkInput(int input) {
        if (input <= 0)
            throw new IllegalArgumentException();
    }
}
