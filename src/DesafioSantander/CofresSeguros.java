package DesafioSantander;

import java.util.Scanner;

abstract class Cofre {
    protected String tipo;
    protected String metodoAbertura;

    public Cofre(String tipo, String metodoAbertura) {
        this.tipo = tipo;
        this.metodoAbertura = metodoAbertura;
    }

    public void imprimirInformacoes() {
        System.out.println("Tipo: " + this.tipo);
        System.out.println("Método de abertura: " + this.metodoAbertura);
    }
}

class CofreDigital extends Cofre {

    private int senha;

    public CofreDigital(int senha) {
        super("Cofre Digital", "Senha");
        this.senha = senha;
    }

    public boolean validarSenha(int confirmacaoSenha) {
        return confirmacaoSenha == this.senha;
    }
}

class CofreFisico extends Cofre {

    public CofreFisico() {
        super("Cofre Fisico", "Chave");
    }
}

public class CofresSeguros{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String tipoCofre = scanner.nextLine();

        Cofre cofre = null;

        if (tipoCofre.equalsIgnoreCase("digital")) {
            int senha = scanner.nextInt();
            int confirmacaoSenha = scanner.nextInt();

            CofreDigital cofreDigital = new CofreDigital(senha);

            if (cofreDigital.validarSenha(confirmacaoSenha)) {
                System.out.println("Tipo: " + cofreDigital.tipo);
                System.out.println("Metodo de abertura: " + cofreDigital.metodoAbertura);
                System.out.println("Cofre aberto!");
            } else {
                System.out.println("Tipo: " + cofreDigital.tipo);
                System.out.println("Metodo de abertura: " + cofreDigital.metodoAbertura);
                System.out.println("Senha incorreta!");
            }

            cofre = cofreDigital;
        } else if (tipoCofre.equalsIgnoreCase("fisico")) {

            CofreFisico cofreFisico = new CofreFisico();
            cofre = cofreFisico;
            System.out.println("Tipo: " + cofre.tipo);
            System.out.println("Metodo de abertura: " + cofre.metodoAbertura);
        }
    }
}
