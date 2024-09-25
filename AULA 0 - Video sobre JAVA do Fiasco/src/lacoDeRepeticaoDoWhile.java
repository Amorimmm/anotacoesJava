public class lacoDeRepeticaoDoWhile {
    public static void main(String[] args) {

        int unidades = 5;

        do {
            System.out.print("Unidades no estoque: " + unidades);
            System.out.println();
            unidades--;
        } while (unidades >= 0);

    }
}
