package exercise_1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<String> listOfString = new HashSet<>();
        Set<String> duplicatedWords = new HashSet<>();
        Set<String> distinctWords = new HashSet<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci un numero intero:");
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            System.out.println("Inserisci una parola.");
            String input = scanner.nextLine();

            if (listOfString.contains(input)) duplicatedWords.add(input);
            else distinctWords.add(input);

            listOfString.add(input);
        }

        if (duplicatedWords.isEmpty()) System.out.println("Non ci sono elementi duplicato.");
        else System.out.println("Ci sono " + (duplicatedWords.size()) + " elementi duplicati.");

        for (String word : duplicatedWords) System.out.println("Elemento duplicato: " + word);

        if (distinctWords.isEmpty()) System.out.println("Non ci sono elementi distinti.");
        else System.out.println("Ci sono " + (distinctWords.size()) + " elementi distinti.");

        for (String word : distinctWords) System.out.println("Elemento distinto: " + word);
        scanner.close();
    }

}
