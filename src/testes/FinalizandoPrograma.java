/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testes;

import java.util.Scanner;

/**
 *
 * @author devel
 */
public class FinalizandoPrograma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        while(true){
            System.out.println("Se você escrever 'fim' o programa vai acabar: ");
            String texto = input.nextLine();
            
            if(texto.equals("fim")){
                System.exit(0);
              
            }
        }
        

        
    }
}
