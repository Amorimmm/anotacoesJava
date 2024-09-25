public class main {
    public static void main(String[] args) {

        metallurgico person1 = new metallurgico();

        person1.name = "Andre Luciano";
        person1.job = "metalurgico";
        person1.cadastroRealizado();
        person1.trabalhando(person1.job);
        System.out.println();

        dev person2 = new dev();

        person2.name = "Leonardo Amorim";
        person2.job = "programador";
        person2.cadastroRealizado();
        person2.trabalhando(person2.job);

    }
}