import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Créer une classe Personne (nom, prénom, sex, address)
 * Créer une liste de n personnes
 * Parcourir la liste, retrouver des éléments de la liste
 * <p>
 * Créer une map pour indexer les personnes par leur nom.
 * Ajouter des personnes dans la Map
 * Effectuer une recherche simple par nom
 */


public class Main {
    private static List<Person> person() {
        List<Person> people = new ArrayList<>();

        people.add(new Person(
                "Pierre", "André", Sex.FEMALE, Color.BLACK
        ));
        people.add(new Person(
                "Jacques", "Michel", Sex.MALE, Color.YELLOW
        ));
        people.add(new Person(
                "Jean", "Calving", Sex.FEMALE, Color.WHITE
        ));
        people.add(new Person(
                "Marc", "Pot De Vin", Sex.MALE, Color.BLACK
        ));

        people.add(new Person(
                "Witchy", "Augustin", Sex.MALE, Color.WHITE
        ));

        people.add(2, new Person(
                "Chardy", "Cheristil", Sex.MALE, Color.BLACK
        ));
        return people;
    }

    private void searchByNumber(List<Person> people) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Quel numéro voulez vous ? : ");
        int number = scanner.nextInt();
        System.out.println("Vous avez entré le numéro " + number);
        if (number < people.size()) {
            System.out.println(people.get(number));
        } else {
            System.out.println("Mauvais numéro");
        }
    }

    public static void main(String[] args) {
        List<Person> people = person();
        System.out.println(people);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez un nom : ");
        String name = scanner.nextLine();

        for (Person person : people) {
            if (person.getName().equalsIgnoreCase(name)) {
                System.out.println(person);
            }
        }

    }
}