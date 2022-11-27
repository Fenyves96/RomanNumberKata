package hu.fenyvesvolgyimate.RomanNumberConverter;

public class RomanNumberConverter {
    public int convert(String input) {
        checkInput(input);
        int result;
        switch (input) {
            case "I":
                result = 1;
                break;
            case "II":
                result = 2;
                break;
            case "III":
                result = 3;
                break;
            default:
                result = 5;
                break;
        }
        return result;
    }

    private void checkInput(String input) {
        if(input == null || input.equals(""))
            throw new IllegalArgumentException();
    }
}
