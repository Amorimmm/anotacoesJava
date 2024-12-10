import java.util.Scanner;

public class cadastro {

    Scanner sc = new Scanner(System.in);

    String nm;
    String password;
    String colabOrClie;

    private void clabOrClient(String name, String senha, String colabOrClient) {

        person p1 = new person();

        System.out.print("Digite seu nome: ");
        p1.setName(sc.nextLine());
        System.out.println("Welcome to the system " + p1.getName());;
        System.out.print("Crie uma senha para seu login: ");
        senha = sc.nextLine();
        password = senha;
        System.out.println("Certo ! Você é um cliente ou colaborador ?");
        colabOrClient = sc.nextLine();
        colabOrClie = colabOrClient;


    }
}
