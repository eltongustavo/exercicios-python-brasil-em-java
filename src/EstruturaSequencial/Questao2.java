package EstruturaSequencial;

import java.util.Scanner;

/**
 * @author devel
 * Questão 2 da lista Estrutura Sequencial da PythonBrasil::
 * Faça um Programa que peça um número e então mostre a mensagem:
 * O número informado foi [número].
 */
public class Questao2 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int num;
        
        System.out.print("Digite um número: ");
        num = leitor.nextInt();
        
        System.out.println("O número informado foi " + num);
        
    }
}
