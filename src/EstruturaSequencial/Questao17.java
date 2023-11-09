package EstruturaSequencial;

import java.util.Scanner;

public class Questao17 {
    /*Faça um Programa para uma loja de tintas. O programa deverá pedir o tamanho em metros quadrados da área a ser pintada. Considere que a cobertura da tinta é de 1 litro para cada 6 metros quadrados e que a tinta é vendida em latas de 18 litros, que custam R$ 80,00 ou em galões de 3,6 litros, que custam R$ 25,00.
     Informe ao usuário as quantidades de tinta a serem compradas e os respectivos preços em 3 situações:

        comprar apenas latas de 18 litros;

        comprar apenas galões de 3,6 litros;

        misturar latas e galões, de forma que o desperdício de tinta seja menor. Acrescente 10% de folga e sempre arredonde os valores para cima, isto é, considere latas cheias.*/

    public static void main(String[] args) {
        Scanner leitorDouble = new Scanner(System.in);
        double quantidadeLatas18L, metrosQuadrados, quantidadeLatas3_6L, valorA80, valorA25;

        System.out.print("Digite quantos metros quadrados serão pintados: ");
        metrosQuadrados = leitorDouble.nextDouble();

        metrosQuadrados = metrosQuadrados + 0.10 * metrosQuadrados;

        //calculando apenas latas de 18L
        if(metrosQuadrados % 108 == 0){
            quantidadeLatas18L = metrosQuadrados / 108;
            valorA80 = (int)quantidadeLatas18L * 80;
        }else{
            quantidadeLatas18L = (metrosQuadrados / 108) + 1;
            valorA80 = (int)quantidadeLatas18L * 80;
        }

        //calculando apenas latas de 3_6L
        if(metrosQuadrados % 21.6 == 0){
            quantidadeLatas3_6L =  metrosQuadrados / 21.6;
            valorA25 = (int)quantidadeLatas3_6L * 25;
        }else{
            quantidadeLatas3_6L =  (int)(metrosQuadrados / 21.6) + 1;
            valorA25 = (int)quantidadeLatas3_6L * 25;
        }

        System.out.printf("Apenas Latas de 18L: %.0f Latas a R$%.2f", quantidadeLatas18L, valorA80);
        System.out.println();
        System.out.printf("Apenas Latas de 3.6L: %.0f Latas a R$%.2f", quantidadeLatas3_6L, valorA25);
        System.out.println();

        valorA80 = 0;
        valorA25 = 0;

        if (metrosQuadrados % 108 == 0) {
            quantidadeLatas18L = metrosQuadrados / 108;
            quantidadeLatas3_6L = 0;
            valorA80 = (int)quantidadeLatas18L * 80;
        }else{
            quantidadeLatas18L = metrosQuadrados / 108;
            double metrosRestantes = metrosQuadrados % 108;
            if(metrosRestantes % 21.6 == 0){
                quantidadeLatas3_6L = metrosRestantes / 21.6;
                valorA25 = (int)quantidadeLatas3_6L * 25;
                valorA80 = (int)quantidadeLatas18L * 80;
            }else{
                quantidadeLatas3_6L = (int)(metrosRestantes / 21.6) + 1;
                valorA25 = (int)quantidadeLatas3_6L * 25;
                valorA80 = (int)quantidadeLatas18L * 80;
            }
        }

        System.out.printf("Misturado: %.0f latas de 18L e %.0f latas de 3.6L, totalizando R$%.2f reais", quantidadeLatas18L, quantidadeLatas3_6L, (valorA80 + valorA25));
    }
}
