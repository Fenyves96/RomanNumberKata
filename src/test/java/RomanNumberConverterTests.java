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

    @Test(expected = IllegalArgumentException.class)
    public void ifZeroThenException() {
        converter.convertToRoman(0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void ifMinusThenException() {
        converter.convertToRoman(-1);
    }

    @Test
    public void testDefaults(){
        //I, V, X, L, C, D, and M
        assertEquals("I", converter.convertToRoman(1));
        assertEquals("V", converter.convertToRoman(5));
        assertEquals("X", converter.convertToRoman(10));
        assertEquals("L", converter.convertToRoman(50));
        assertEquals("C", converter.convertToRoman(100));
        assertEquals("D", converter.convertToRoman(500));
        assertEquals("M", converter.convertToRoman(1000));
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

    @Test
    public void ifNineThenIX(){
        assertEquals("IX", converter.convertToRoman(9));
    }

    @Test
    public void ifTenThenX(){
        assertEquals("X", converter.convertToRoman(10));
    }

    @Test
    public void ifElevenThenXI(){
        assertEquals("XI", converter.convertToRoman(11));
    }

    @Test
    public void ifFourteenThenXIV(){
        assertEquals("XIV", converter.convertToRoman(14));
    }
    @Test
    public void ifFifteenThenXV(){
        assertEquals("XIV", converter.convertToRoman(14));
    }

    @Test
    public void ifSixteenThenXVI(){
        assertEquals("XVI", converter.convertToRoman(16));
    }

    @Test
    public void ifNineTeenThen(){
        assertEquals("XIX", converter.convertToRoman(19));
    }

    @Test
    public void ifTwentyThenXX(){
        assertEquals("XX", converter.convertToRoman(20));
    }

    @Test
    public void ifTwentyNineThenXXIX(){
        assertEquals("XXIX", converter.convertToRoman(29));
    }

    @Test
    public void ifThirtyNineThenXXXIX(){
        assertEquals("XXXIX", converter.convertToRoman(39));
    }
}
