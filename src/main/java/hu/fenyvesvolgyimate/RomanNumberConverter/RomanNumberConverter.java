package hu.fenyvesvolgyimate.RomanNumberConverter;

import java.util.HashMap;
import java.util.Map;

public class RomanNumberConverter {
    public int convertToRoman(int input) {
        checkInput(input);
        return 0;
    }

    private void checkInput(int input) {
        if (input <= 0)
            throw new IllegalArgumentException();
    }
}
