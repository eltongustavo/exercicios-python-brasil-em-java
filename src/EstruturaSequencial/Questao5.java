package EstruturaSequencial;

import java.util.Scanner;

/**
 * @author devel
 * Questão 5 da lista Estrutura Sequencial da PythonBrasil:
 * Faça um Programa que converta metros para centímetros.
 */
public class Questao5 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int valorEmMetros, valorEmCentimetros;
        
        System.out.println("Digite um valor em metros: ");
        valorEmMetros = leitor.nextInt();
        
        valorEmCentimetros = valorEmMetros*100;
        
        System.out.println(valorEmMetros + "m" + " equivalem a " + valorEmCentimetros + "cm");
        
        
        
        
    }
}
