package DesafioAWS;

import java.util.Scanner;

public class VelocidadeDownloadAWS {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a distância física entre o servidor de origem e o dispositivo do usuário (KM):   ");
        double distanciaServidores = scanner.nextDouble();

        System.out.println("Digite a velocidade do plano de internet (em Mbps): ");
        double velocidadePlano = scanner.nextDouble();

        double velocidadeDownloadEstimada = calcularVelocidadeDownload(distanciaServidores, velocidadePlano);

        System.out.println("Velocidade de Download Estimada: " + String.format("%.2f", velocidadeDownloadEstimada) + " Mbps");

        scanner.close();
    }
    public static double calcularVelocidadeDownload(double distanciaServidores, double velocidadePlano) {
        double velocidadeDownloadEstimada = velocidadePlano / (1 + (distanciaServidores / 100));

        return Math.min(velocidadeDownloadEstimada, velocidadePlano);
    }
}
