/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EstruturaSequencial;

import java.util.Scanner;

/**
 * @author devel
 * Faça um Programa que peça a temperatura em graus Celsius, 
 * transforme e mostre a temperatura em graus Fahrenheit.
 * F = 1,8C + 32
 */
public class Questao10 {
    public static void main(String[] args) {
        Scanner leitorDouble = new Scanner(System.in);
        
        double temperaturaCelsius, temperaturaFahrenheit;
        
        System.out.print("Digite a temperatura em Celsius(°C): ");
        temperaturaCelsius = leitorDouble.nextDouble();
        
        temperaturaFahrenheit = (1.8*temperaturaCelsius) + 32; 
        
        System.out.printf("A temperatura %.1fºC equivalem a %.1fºF\n", temperaturaCelsius, temperaturaFahrenheit);
    }
}
