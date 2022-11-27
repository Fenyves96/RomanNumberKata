import hu.fenyvesvolgyimate.RomanNumberConverter.RomanNumberConverter;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RomanNumberConverterTests {

    private RomanNumberConverter converter;

    @Before
    public void setUp(){
        converter = new RomanNumberConverter();
    }

    @Test
    public void testConstructorWorks(){
        RomanNumberConverter converter = new RomanNumberConverter();
    }

    @Test(expected = IllegalArgumentException.class)
    public void ifZeroThenException() {
        converter.convertToRoman(0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void ifMinusThenException() {
        converter.convertToRoman(-1);
    }

    @Test
    public void ifOneThenI() {
        assertEquals("I", converter.convertToRoman(1));
    }

    @Test
    public void ifTwoThenII() {
        assertEquals("II", converter.convertToRoman(2));
    }

    @Test
    public void ifThreeThenIII() {
        assertEquals("III", converter.convertToRoman(3));
    }

    @Test
    public void ifFiveThenV() {
        assertEquals("V", converter.convertToRoman(5));
    }

    @Test
    public void ifFourThenIV() {
        assertEquals("IV", converter.convertToRoman(4));
    }

    @Test
    public void ifSixThenVI() {
        assertEquals("VI", converter.convertToRoman(6));
    }

    @Test
    public void ifSevenThenVII() {
        assertEquals("VII", converter.convertToRoman(7));
    }

    @Test
    public void ifEightThenVIII() {
        assertEquals("VIII", converter.convertToRoman(8));
    }
}
