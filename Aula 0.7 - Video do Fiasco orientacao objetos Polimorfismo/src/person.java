import java.util.Objects;

public class person extends cadastro {

    private String name;
    private String job;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public void cadastroRealizado() {
        System.out.println("Login realizado com sucesso.");
        System.out.println("Nome: " + name);
    }

    public void consultaCadastro() {
        System.out.println("Nome: " + name);
        System.out.println("Nome: " + job);
    }


/*   public void trabalhando(String cargo) {

        for(int i=0;i < 1; System.exit(0)) {
            if (Objects.equals(cargo, "programador")) {
                System.out.println("Voce nao pode se cadastrar em um cargo pois nao e um funcionario");
                System.exit(0);
            } else if (Objects.equals(cargo, "metalurgico")) {
                System.out.println("Voce nao pode se cadastrar em um cargo pois nao e um funcionario");
                System.exit(0);
            } else {
                System.out.println("Voce nao pode se cadastrar em um cargo pois nao e um funcionario");
                System.exit(0);
            }
        }
    }*/
}


