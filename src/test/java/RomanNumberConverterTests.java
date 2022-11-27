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
    public void testConvertIfNullThenException(){
        RomanNumberConverter converter = new RomanNumberConverter();
        converter.convert(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConvertIfEmptyStringThenException(){
        RomanNumberConverter converter = new RomanNumberConverter();
        converter.convert("");
    }

    @Test()
    public void testConvertIfRomanOneThenArabicOne(){
        assertEquals(1, converter.convert("I"));
    }

    @Test()
    public void testConvertIfRomanTwoThenArabicTwo(){
        assertEquals(2, converter.convert("II"));
    }

    @Test()
    public void testConvertIfRomanThreeThenArabicThree(){
        assertEquals(3, converter.convert("III"));
    }

    @Test()
    public void testConvertIfRomanFiveThenArabicFive(){
        assertEquals(5, converter.convert("V"));
    }
}
