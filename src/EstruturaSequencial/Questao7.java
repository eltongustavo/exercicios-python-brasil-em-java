package EstruturaSequencial;

import java.util.Scanner;

/**
 * @author devel
 * Faça um Programa que calcule a área de um quadrado, 
 * em seguida mostre o dobro desta área para o usuário.
 */
public class Questao7 {
    public static void main(String[] args) {
        Scanner leitorInt = new Scanner(System.in);
        
        int ladoQuadrado, areaQuadrado;
        
        System.out.print("Digite o lado do quadrado: ");
        ladoQuadrado = leitorInt.nextInt();
        
        areaQuadrado = (int) Math.pow(ladoQuadrado, 2);
        
        System.out.printf("Área do quadrado: %dm²\n", areaQuadrado);
        System.out.printf("O dobro da área acima é %dm²\n",(areaQuadrado * 2));
    }
    
}
