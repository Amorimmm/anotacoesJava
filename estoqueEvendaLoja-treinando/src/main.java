import java.util.Scanner;
import java.util.Random;

public class main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        funcionario f1 = new funcionario();

        System.out.println("Ola seja bem vindo ao nosso Sistema!");
        System.out.println();
        System.out.println("Vamos fazer seu cadastro.");
        System.out.println("Qual seu nome ?");
        f1.nome = sc.nextLine();
        System.out.println("Nome cadastrado com sucesso!");
        System.out.println("Vamos gerar um login para voce");
        f1.numLogin = 1000 + random.nextInt(9000);
        System.out.println("Login gerado com sucesso!");
        System.out.println();
        System.out.println("Nome: " + f1.nome);
        System.out.println("Login: " + f1.numLogin);
        System.out.print("Crie uma senha: ");
        f1.senha = sc.nextLine();
        System.out.println("Usuario cadastrado com sucesso!");
        System.out.println();
        System.out.println("Nome: " + f1.nome);
        System.out.println("Login: " + f1.numLogin);
        System.out.println("Senha: " + f1.senha);


    }
}
