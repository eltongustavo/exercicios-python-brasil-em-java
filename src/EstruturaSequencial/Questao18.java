package EstruturaSequencial;

import java.util.Scanner;

public class Questao18 {

    /*Faça um programa que peça o tamanho de um arquivo para download (em MB) e a velocidade de um link de Internet (em Mbps), calcule e informe o tempo aproximado de download do arquivo usando este link (em minutos).*/

    public static void main(String[] args) {
        Scanner leitorInt = new Scanner(System.in);

        int tamanhoArquivo, velocidadeInternet, tempoDownload;

        System.out.print("Digite quantos MB tem o arquivo a ser baixado: ");
        tamanhoArquivo = leitorInt.nextInt();

        System.out.print("Digite quantos MB sua internet baixa em Mbps: ");
        velocidadeInternet = leitorInt.nextInt();

        tempoDownload = (tamanhoArquivo / velocidadeInternet) / 60;

        System.out.printf("O arquivo vai demorar aproximadamente %d minuto(s) para ser baixado", tempoDownload);
    }
}
