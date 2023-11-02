package EstruturaSequencial;

import java.util.Scanner;

/**
 * @author devel
 * Faça um Programa que pergunte quanto você ganha por hora
 * e o número de horas trabalhadas no mês. Calcule e mostre 
 * o total do seu salário no referido mês.
 */
public class Questao8 {
    public static void main(String[] args) {
        Scanner leitorDouble = new Scanner(System.in);
        Scanner leitorInt = new Scanner(System.in);
        
        int quantidadeHorasDia;
        double valorHora;
        
        
        System.out.print("Digite quanto você ganha por hora: R$");
        valorHora = leitorDouble.nextDouble();
        
        System.out.print("Digite quantas horas você trabalha por dia: ");
        quantidadeHorasDia = leitorInt.nextInt();
        
        System.out.printf("Ao fim do mês, você ganha R$%.2f\n", (valorHora * quantidadeHorasDia));
    }
}
