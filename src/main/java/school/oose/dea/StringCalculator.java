package school.oose.dea;

public class StringCalculator
{
    public static void main( String[] args ){}

    public int add(String numbers) throws geenCijferException
    {
        var e1 = new geenCijferException;
        if (numbers.contains("geenCijfer"))
        {
            throw e1;
        }
        else if ("".equals(numbers))
        {
            return 0;
        }
        else if (numbers.length() == 1)
        {
            return Integer.parseInt(numbers);
        }
        else
        {
            numbers = numbers.replaceAll("[//]|[\n]|\\;", ",");
            if (",".equals(numbers.charAt(0)))
            {
                int i = 0;
                while (i < numbers.length() && String.valueOf(numbers.charAt(i)) != ",")
                {
                    String commaRemover = String.valueOf(numbers.charAt(i));
                    commaRemover.replaceAll(",", "");
                    i++;
                }
            }
            var parts = numbers.split(",");
            var result = 0;

            for (int i = 0; i < parts.length; i++)
            {
                result += Integer.parseInt(parts[i]);
            }
            return result;
        }
    }
}
