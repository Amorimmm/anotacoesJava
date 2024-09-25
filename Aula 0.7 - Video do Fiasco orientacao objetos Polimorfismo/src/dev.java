public class dev extends person {

    @Override
    public void trabalhando(String cargo) {

       // for(int i=0;i > i; System.exit(0);) {
            if (cargo == "programador") {
                System.out.println("Voce foi cadastrado como desenvolvedor");
            } else if (cargo == "metalurgico") {
                System.out.println("Voce se cadastrou para o cargo incorreto");
            } else {
                System.out.println("Cargo invalido.");
            }
       // }

    }
}
