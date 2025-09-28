import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("Manzana");
        fruits.add("Banano");
        fruits.add("Naranja");

        System.out.println("Frutas: " + fruits);

        // Acceder a elementos
        String firstFruit = fruits.get(0);
        System.out.println("Primera fruta: " + firstFruit);

        // Iterar sobre la lista
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}