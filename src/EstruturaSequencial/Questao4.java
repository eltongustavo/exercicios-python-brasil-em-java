package EstruturaSequencial;

import java.util.Scanner;

/**
 * @author devel
 * Questão 4 da lista Estrutura Sequencial da PythonBrasil:
 * Faça um Programa que peça as 4 notas bimestrais e mostre a média.
 */
public class Questao4 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        float nota1, nota2, nota3, nota4, media;
    
        
        System.out.print("Digite a primeira nota: ");
        nota1 = leitor.nextFloat();
        
        System.out.print("Digite a segunda nota: ");
        nota2 = leitor.nextFloat();
        
        System.out.print("Digite a terceira nota: ");
        nota3 = leitor.nextFloat();
        
        System.out.print("Digite a quarta nota: ");
        nota4 = leitor.nextFloat();
        
        media = (nota1 + nota2 + nota3 + nota4) / 4;
        
        System.out.println("A média aritmética das 4 notas acima é: " + media);
    }
}
