package EstruturaSequencial;

import java.util.Scanner;

public class Questao14 {
    /*
    João Papo-de-Pescador, homem de bem, comprou um microcomputador para controlar o rendimento diário de seu trabalho. Toda vez que ele traz um peso de peixes maior que o estabelecido pelo regulamento de pesca do estado de São Paulo (50 quilos) deve pagar uma multa de R$ 4,00 por quilo excedente. João precisa que você faça um programa que leia a variável peso (peso de peixes) e calcule o excesso. Gravar na variável excesso a quantidade de quilos além do limite e na variável multa o valor da multa que João deverá pagar. Imprima os dados do programa com as mensagens adequadas.
    */
    public static void main(String[] args) {
        Scanner leitorDouble = new Scanner(System.in);

        double pesoPeixe, pesoExcesso;

        System.out.print("Digite o peso do peixe pescado: ");
        pesoPeixe = leitorDouble.nextDouble();

        pesoExcesso = pesoPeixe - 50;

        if(pesoPeixe > 50){
            System.out.printf("A multa a ser paga é de R$%.2f", (pesoExcesso * 4));
        }else{
            System.out.println("Não existe multa a ser paga.");
        }

    }
}
