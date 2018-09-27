/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package converttemp;

/**
 *
 * @author Batman
 */
import java.util.Scanner;
public class ConvertTemp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    {    
        float temperature;
        Scanner in = new Scanner(System.in);
        final String DEGREE  = "\u00b0";
        
        System.out.println("Enter a temperature in Celcius to convert to Fahrenheit");
        temperature = in.nextInt();
        
        temperature = ((temperature - 32)*5)/9;
        
        System.out.println("Your new temperature is = " + temperature + DEGREE + "c");
        
        
    }
    
}
