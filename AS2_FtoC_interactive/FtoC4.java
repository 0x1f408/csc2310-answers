// interactive farenheit-to-celsius converter
// uses simpleIO to readinput

import jpb.*;

public class FtoC4{
	public static void main(String[] args){
		final double FREEZING = 32.0;
		final double RATIO = (5.0/9.0);
		SimpleIO.prompt("Enter temperature /(F/): ");
		
		String input = SimpleIO.readLine();
		int fahrenheit = Integer.parseInt(input);
		double celsius = (fahrenheit - FREEZING)*RATIO;
		
		System.out.println("Celsius: "+celsius);
	}
}