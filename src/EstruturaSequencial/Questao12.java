package EstruturaSequencial;

import java.util.Scanner;

public class Questao12 {
    /*
    Tendo como dados de entrada a altura de uma pessoa, construa um algoritmo que calcule seu peso ideal,
    usando a seguinte fórmula: (72.7*altura) - 58
    */
    public static void main(String[] args) {
        Scanner leitorDouble = new Scanner(System.in);

        double altura, pesoIdeal;

        System.out.print("Digite sua altura: ");
        altura = leitorDouble.nextDouble();

        pesoIdeal = (72.7*altura) - 58;

        System.out.printf("Seu peso ideal é: %.1f", pesoIdeal);
    }
}
