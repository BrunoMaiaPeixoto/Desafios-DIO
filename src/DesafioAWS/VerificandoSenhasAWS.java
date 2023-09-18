package DesafioAWS;

import java.util.Scanner;
import java.util.regex.Pattern;

public class VerificandoSenhasAWS {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String senha = scanner.nextLine();

        String resultado = verificarForcaSenha(senha);
        System.out.println(resultado);
    }

    public static String verificarForcaSenha(String senha) {
        int comprimentoMinimo = 8;

        boolean temLetraMaiuscula = Pattern.compile("[A-Z]").matcher(senha).find();
        boolean temLetraMinuscula = Pattern.compile("[a-z]").matcher(senha).find();
        boolean temNumero = Pattern.compile("[0-9]").matcher(senha).find();
        boolean temCaractereEspecial = Pattern.compile("[!@#$%¨&*()\\-+\\=<>.,./?|]").matcher(senha).find();
        boolean temSequenciaComum = senha.matches(".*(?i)123456.*|.*(?i)abcdef.*");
        boolean temPalavraComum = senha.equalsIgnoreCase("password") || senha.equalsIgnoreCase("123456") || senha.equalsIgnoreCase("qwerty");

        if (senha.length() < comprimentoMinimo) {
            return "Sua senha e muito curta. Recomenda-se no minimo 8 caracteres.";
        }

        // Check for at least one uppercase letter
        if (!Pattern.compile("[A-Z]").matcher(senha).find()) {
            return "Sua senha nao atende aos requisitos de seguranca.";
        }

        if (!Pattern.compile("[a-z]").matcher(senha).find()) {
            return "Sua senha nao atende aos requisitos de seguranca.";
        }

        if (!Pattern.compile("[0-9]").matcher(senha).find()) {
            return "Sua senha nao atende aos requisitos de seguranca.";
        }

        if (!Pattern.compile("[!@#$%¨&*()\\-+\\=<>.,./?|]").matcher(senha).find()) {
            return "Sua senha nao atende aos requisitos de seguranca.";
        }

        return "Sua senha atende aos requisitos de seguranca. Parabens!";




    }
}