package EstruturaSequencial;

import java.util.Scanner;

/**
 * @author devel
 * Faça um Programa que peça a temperatura em graus Fahrenheit, 
 * transforme e mostre a temperatura em graus Celsius.
 * C = 5 * ((F-32) / 9).
 */
public class Questao9 {
    public static void main(String[] args) {
        Scanner leitorDouble = new Scanner(System.in);
        
        double temperaturaCelsius;
        double temperaturaFahrenheit;
        
        System.out.print("Digite a temperatura em Fahrenheit(°F): ");
        temperaturaFahrenheit = leitorDouble.nextDouble();
        
        temperaturaCelsius = 5 * ((temperaturaFahrenheit - 32) / 9);
        
        System.out.printf("A temperatura %.1fºF equivalem a %.1fºC\n", temperaturaFahrenheit, temperaturaCelsius);
    }
}
