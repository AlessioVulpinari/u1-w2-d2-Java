package exercise_3;

public class Main {
    public static void main(String[] args) {
        Rubrica rubrica1 = new Rubrica();

        rubrica1.addContact("Alessio", 331);
        rubrica1.addContact("Simone", 337000);
        rubrica1.addContact("Federico", 3310000);

        rubrica1.printAllContacts();

        rubrica1.deleteContact("Alessi");
        rubrica1.deleteContact("Alessio");

        rubrica1.printAllContacts();

        System.out.println(rubrica1.returnCellNumber("Federic"));
        System.out.println(rubrica1.returnCellNumber("Federico"));

    }
}
