package EstruturaSequencial;

import java.util.Scanner;

/**
 * @author devel
 * Questão 3 da lista Estrutura Sequencial da PythonBrasil:
 * Faça um Programa que peça dois números e imprima a soma.
 */
public class Questao3 {
    
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int num1, num2;
        
        System.out.print("Digite o primeiro número: ");
        num1 = leitor.nextInt();
        
        System.out.print("Digite o segundo número: ");
        num2 = leitor.nextInt();
        
        System.out.println("A soma dos dois números digitado é: " + (num1 + num2));
        
        
        
    }
    
}
