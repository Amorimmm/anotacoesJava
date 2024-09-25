public class lacoDeRepeticaoFor {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            showYouNameAndAge("Andre", 24);
        }
    }

    public static void showYouNameAndAge(String name, int age) {
        System.out.println("Name: " + name);
        System.out.print("Age: " + age);
        System.out.println();
    }
}
