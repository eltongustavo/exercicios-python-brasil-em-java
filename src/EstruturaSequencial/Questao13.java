package EstruturaSequencial;

import java.util.Scanner;

public class Questao13 {
    /*
    Tendo como dado de entrada a altura (h) de uma pessoa, construa um algoritmo que calcule seu peso ideal,
    utilizando as seguintes fórmulas:
    Para homens: (72.7*h) - 58
    Para mulheres: (62.1*h) - 44.7*/
    public static void main(String[] args) {
        Scanner leitorDouble = new Scanner(System.in);

        double altura, pesoIdealHomem, pesoIdealMulher;

        System.out.print("Digite sua altura: ");
        altura = leitorDouble.nextDouble();

        pesoIdealHomem = (72.7*altura) - 58;
        pesoIdealMulher = (62.1*altura) - 44.7;

        System.out.printf("Se você for homem, seu peso ideal é: %.1fKg", pesoIdealHomem);
        System.out.println();
        System.out.printf("Se você for mulher, seu peso ideal é: %.1fKg", pesoIdealMulher);

    }
}
