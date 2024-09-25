public class main {
    public static void main(String[] args) {

        metallurgico person1 = new metallurgico();

        person1.name = "Andre Luciano";
        person1.job = "metallurgical";
        person1.cadastroRealizado();
        System.out.println();
        person1.trabalhando();

        dev person2 = new dev();

        person2.name = "Leonardo Amorim";
        person2.job = "Developer";
        person2.cadastroRealizado();
        System.out.println();
        person2.programar();

    }
}