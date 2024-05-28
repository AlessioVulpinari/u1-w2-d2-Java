package exercise_3;

import java.util.HashMap;
import java.util.Map;

public class Rubrica {
    private Map<String, Integer> contatti;

    public Rubrica() {
        this.setContatti(new HashMap<>());
    }

    public Map<String, Integer> getContatti() {
        return contatti;
    }

    public void setContatti(Map<String, Integer> contatti) {
        this.contatti = contatti;
    }

    public void addContact(String name, int cellNumber) {
        this.getContatti().put(name, cellNumber);
        System.out.println("Contatto: " + name + " aggiunto con successo!");
    }

    public void deleteContact(String name) {
        if (this.getContatti().containsKey(name)) {
            this.getContatti().remove(name);
            System.out.println("Contatto: " + name + " eliminato con successo!");
        } else {
            System.out.println("Contatto: " + name + " non presente!");
        }

    }

    public String returnName(int cellNum) {
        String result = "";
        for (String contact : this.getContatti().keySet()) {
            if (this.getContatti().get(contact) == cellNum) {
                result = contact;
            }
        }
        return result;
    }

    public int returnCellNumber(String name) {
        try {
            return this.getContatti().get(name);
        } catch (NullPointerException err) {
            System.out.println("Contatto non presente nella rubrica");
            return -1;
        }

    }

    public void printAllContacts() {
        for (String contact : this.getContatti().keySet()) {
            System.out.println("Telefono: " + this.getContatti().get(contact) + " name: " + contact);
        }
    }
}
