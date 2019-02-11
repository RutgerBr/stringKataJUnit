package school.oose.dea;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class StringCalculatorTest
{
    private StringCalculator calc;

    @BeforeEach
    void setup()
    {
        calc = new StringCalculator();
    }

    @Test
    void testLegeStringReturnNul()
    {
        //act
        var actual = calc.add("");

        //assert
        Assertions.assertEquals(0, actual);
    }

    @Test
    void testEenReturnEen()
    {
        //act
        var actual = calc.add("1");

        //assert
        Assertions.assertEquals(1, actual);
    }

    @Test
    void testSimpeleGetallenReturnSome()
    {
        //act
        var actual = calc.add("1,2,3");

        //assert
        Assertions.assertEquals(6, actual);
    }

    @Test
    void testSimpeleGetallenReturnSomNewLine()
    {
        //act
        var actual = calc.add("1\n2,3");

        //assert
        Assertions.assertEquals(6, actual);
    }

    @Test
    void testSimpeleGetallenReturnSomDelimiter()
    {
        //act
        var actual = calc.add("//;\n1,2");

        //assert
        Assertions.assertEquals(3, actual);
    }

    @Test(expected = geenCijferException)
    void testException()
    {
        //act
        var actual = calc.add("geenCijfer");

        //assert
        Assertions.assertEquals(3, actual);
    }
}