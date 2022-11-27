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
    public void ifZeroThenException(){
        converter.convertToRoman(0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void ifMinusThenException(){
        converter.convertToRoman(-1);
    }
}
