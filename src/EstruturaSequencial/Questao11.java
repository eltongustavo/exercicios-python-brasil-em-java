package EstruturaSequencial;

import java.util.Scanner;

/*
11 - Faça um Programa que peça 2 números inteiros e um número real. Calcule e mostre:
o produto do dobro do primeiro com metade do segundo .
a soma do triplo do primeiro com o terceiro.
o terceiro elevado ao cubo.*/
public class Questao11 {

    public static void main(String[] args) {
        Scanner leitorInt = new Scanner(System.in);
        Scanner leitorDouble = new Scanner(System.in);

        int numInt1, numInt2;
        double numDouble1;

        System.out.print("Digite um número inteiro: ");
        numInt1 = leitorInt.nextInt();

        System.out.print("Digite outro número inteiro: ");
        numInt2 = leitorInt.nextInt();

        System.out.print("Digite um número real: ");
        numDouble1 = leitorDouble.nextDouble();

        System.out.println("produto do dobro do primeiro com metade do segundo: " + ((2 * numInt1)*(numInt2/2)));
        System.out.println("A soma do triplo do primeiro com o terceiro: " + ((3 * numInt1) + numDouble1));
        System.out.println("O terceiro elevado ao cubo: " + Math.pow(numDouble1, 3));






    }

}
