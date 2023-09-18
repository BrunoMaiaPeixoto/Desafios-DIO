package DesafioAWS;

import java.util.Scanner;

public class CustosAWS {
    public static void main(String[] args) {

        double custoPorHoraServidor = 0.15;
        double custoPorHoraBancoDados = 0.05;

        Scanner scanner = new Scanner(System.in);

        System.out.println("quantidade de servidores necessários: ");
        int quantidadeServidores = scanner.nextInt();

        System.out.println("quantidade de servidores necessários:   ");
        int quantidadeBancosDados = scanner.nextInt();

        double custoServidores = quantidadeServidores * custoPorHoraServidor;
        double custoBancosDados = quantidadeBancosDados * custoPorHoraBancoDados;
        double custoTotal = custoServidores + custoBancosDados;



        System.out.printf("Custo total de uso da AWS por hora: R$ %.2f%n", custoTotal);

        scanner.close();
    }
}