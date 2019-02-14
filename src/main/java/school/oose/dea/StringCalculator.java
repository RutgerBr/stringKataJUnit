package school.oose.dea;

public class StringCalculator
{
    public static void main( String[] args ){
        var calc = new StringCalculator();
        calc.bereken("geenCijfer");
    }

    public int bereken(String s)
    {
        var result = 0;
        try {
            result = add(s);
        } catch (geenCijferException e)
        {
            System.out.println("geenCijferException");
        }
        return result;
    }

    public int add(String numbers) throws geenCijferException
    {
        var e1 = new geenCijferException("Geen cijfer!");
        if (numbers.contains("geenCijfer"))
        {
            throw e1;
        }
        else
        if ("".equals(numbers))
        {
            return 0;
        }
        else if (numbers.length() == 1)
        {
            return Integer.parseInt(numbers);
        }
        else if ("/".equals(String.valueOf(numbers.charAt(0))))
        {
            numbers = numbers.replaceAll("[//].*?[\n]", "");
            numbers = numbers.replaceAll("[//]|[\n]", "");
            var parts = numbers.split(",");
            var result = 0;

            for (int i = 0; i < parts.length; i++)
            {
                result += Integer.parseInt(parts[i]);
            }
            return result;
        }
        else
        {
            var parts = numbers.split("[\n]|,");
            var result = 0;

            for (int i = 0; i < parts.length; i++)
            {
                result += Integer.parseInt(parts[i]);
            }
            return result;
        }
    }
}
