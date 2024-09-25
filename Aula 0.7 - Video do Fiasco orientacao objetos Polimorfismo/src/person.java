public class person {

    String name;
    String job;

    public void cadastroRealizado() {
        System.out.println("Login realizado com sucesso.");
        System.out.println("Nome: " + name);
    }

    public void consultaCadastro() {
        System.out.println("Nome: " + name);
        System.out.println("Nome: " + job);
    }

    public void trabalhando(String cargo) {

        if(cargo == "developer") {
            System.out.println("Voce nao pode se cadastrar em um cargo pois nao e um funcionario");
        } else if (cargo == "metalurgico") {
            System.out.println("Voce nao pode se cadastrar em um cargo pois nao e um funcionario");
        } else {
            System.out.println("Voce nao pode se cadastrar em um cargo pois nao e um funcionario");
        }
    }
}


