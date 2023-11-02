package EstruturaSequencial;

import java.util.Scanner;



/**
 * @author devel
 * Questão 6 da lista Estrutura Sequencial da PythonBrasil:
 * Faça um Programa que peça o raio de um círculo, calcule e mostre sua área.
 */
public class Questao6 {
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        double raio, area;
        
        System.out.println("Digite o raio: ");
        raio = leitor.nextDouble();
        
        area = 3.14*(raio*raio);
        
        System.out.println("A área de um circulo de raio " + raio + " é igual a: " + area);
        
        
    }
}
