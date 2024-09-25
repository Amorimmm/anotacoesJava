public class metallurgico extends person {
    @Override
    public void trabalhando(String cargo) {

        if (cargo == "metalurgico") {
            System.out.println("Voce se cadastrou para o cargo de metalurgico.");
        } else if (cargo == "programador") {
            System.out.println("Voce se cadastrou no cargo incorreto.");
        } else {
            System.out.println("Cargo invalido");
        }

    }
}
