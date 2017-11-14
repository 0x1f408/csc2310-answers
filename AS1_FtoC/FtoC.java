// non-interactive fahrenheit-to-celsius conversion
public class FtoC
{
public static void main(String[] args)
{
double fahrenheit = 98.6;
double celsius = (fahrenheit - 32.0) * ((double)5 / (double)9);
System.out.println("Celsius Equivalent of " + fahrenheit + " is: " + celsius);
}
}
