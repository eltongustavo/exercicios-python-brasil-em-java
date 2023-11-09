package EstruturaSequencial;

import java.util.Scanner;

public class Questao15 {
    /*Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês. Calcule e mostre o total do seu salário no referido mês, sabendo-se que são descontados 11% para o Imposto de Renda, 8% para o INSS e 5% para o sindicato, faça um programa que nos dê:
       - salário bruto.
       - quanto pagou ao INSS.
       - quanto pagou ao sindicato.
       - o salário líquido.
    calcule os descontos e o salário líquido, conforme a tabela abaixo:
    + Salário Bruto : R$
    - IR (11%) : R$
    - INSS (8%) : R$
    - Sindicato ( 5%) : R$
    = Salário Liquido : R$
    */

    public static void main(String[] args) {
        Scanner leitorInt = new Scanner(System.in);
        Scanner leitorDouble = new Scanner(System.in);

        int horasTrabalhadas;
        double salarioPorHora, salarioBruto, valorInss, valorSindicato, salarioLiquido, valorImpostoDeRenda;

        System.out.print("Digite quanto você ganha por hora: R$");
        salarioPorHora = leitorDouble.nextDouble();

        System.out.print("Digite quantas horas você trabalhou esse mês: ");
        horasTrabalhadas = leitorInt.nextInt();

        salarioBruto = horasTrabalhadas * salarioPorHora;

        valorImpostoDeRenda = 0.11 * salarioBruto;

        valorInss = 0.08 * salarioBruto;

        valorSindicato = 0.05 * salarioBruto;

        salarioLiquido = salarioBruto - (valorInss + valorSindicato + valorImpostoDeRenda);

        System.out.printf("Salário Bruto : %.2f\n", salarioBruto);
        System.out.printf("Imposto de Renda : %.2f\n", valorImpostoDeRenda);
        System.out.printf("INSS: %.2f\n", valorInss);
        System.out.printf("Sindicato : %.2f\n", valorSindicato);
        System.out.printf("Salário Liquido : %.2f\n", salarioLiquido);




    }
}
