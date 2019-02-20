package school.oose.dea;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StringCalculatorTest
{
    private StringCalculator calc;

    @BeforeEach
    void setup()
    {
        calc = new StringCalculator();
    }

    @Test
    void testLegeStringReturnNul() throws geenCijferException
    {
        //act
        var actual = calc.bereken("");

        //assert
        assertEquals(0, actual);
    }

    @Test
    void testEenReturnEen() throws geenCijferException
    {
        //act
        var actual = calc.bereken("1");

        //assert
        assertEquals(1, actual);
    }

    @Test
    void testSimpeleGetallenReturnSome() throws geenCijferException
    {
        //act
        var actual = calc.bereken("1,2,3");

        //assert
        assertEquals(6, actual);
    }

    @Test
    void testSimpeleGetallenReturnSomNewLine() throws geenCijferException
    {
        //act
        var actual = calc.bereken("1\n2,3");

        //assert
        assertEquals(6, actual);
    }

    @Test
    void testSimpeleGetallenReturnSomDelimiter() throws geenCijferException
    {
        //act
        var actual = calc.bereken("//;\n1,2");

        //assert
        assertEquals(3, actual);
    }

    @Test
    void testException()
    {
        //assert act

        geenCijferException geenCijfer = assertThrows(geenCijferException.class, () -> calc.bereken("geenCijfer"));
        assertEquals("Geen cijfer!", geenCijfer.getMessage());
    }
}
