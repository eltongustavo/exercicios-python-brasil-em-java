/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

import java.util.Scanner;

/**
 *
 * @author 20221134010074
 * Faça um programa que peça uma nota, entre zero e dez. Mostre uma mensagem caso o valor seja inválido e continue pedindo até que o usuário informe um valor válido.
 */
public class Questao1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner teclado = new Scanner(System.in);
       
       double nota;
       
       do{
           System.out.print("Digite sua nota: ");
           nota = teclado.nextDouble();
           
           if(nota < 0 || nota > 10){
               System.err.println("\n" + nota + " é uma nota inválida!\n");
           }
       }while(nota < 0 || nota > 10);
    }
    
}
