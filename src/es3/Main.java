package es3;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        PhoneRoster contactsList = new PhoneRoster();
        List<String> listOfRandomNames = Arrays.asList(
                "Maria", "Marco", "Anna", "Giovanni", "Laura", "Luigi", "Giorgia", "Alessio",
                "Martina", "Francesco", "Simone", "Elena", "Matteo", "Sara", "Paolo", "Giulia",
                "Andrea", "Chiara", "Davide", "Beatrice", "Roberto", "Valentina", "Antonio",
                "Alessia", "Lorenzo", "Sofia", "Gabriele", "Elisa", "Stefano", "Camilla",
                "Riccardo", "Caterina", "Federico", "Aurora", "Luca", "Isabella", "Daniele",
                "Emma", "Alessandro"
        );
        List<String> listOfRandomNumbers = Arrays.asList(
                "8155995378", "3497871711", "4330618737", "7025092883", "2385382122",
                "6428966838", "5112029320", "5158231034", "4249567985", "4758098597",
                "7858760587", "8308228388", "6909898495", "2183348498", "3659423472",
                "6121678549", "7474587147", "4891473547", "2378411341", "1963783107",
                "1324604276", "8849022725", "1766466523", "3857449602", "6135337648",
                "1648092278", "8349173068", "8777038399", "6622509577", "9940303082",
                "1516419290", "4035004378", "2256734329", "6364579877", "3269459231",
                "5777191297", "4010813324", "9294368654", "9861040485"
        );

        for(int i=0;i<listOfRandomNames.size();i++){
            contactsList.addNewContact(listOfRandomNames.get(i),listOfRandomNumbers.get(i));
        }

        String numberOfCamilla = contactsList.getNumber("Camilla");
        System.out.println("Il numero di Camilla è: "+numberOfCamilla);

        contactsList.deleteContact("Alessio");
        contactsList.addNewContact("William","3857449602");
        String numberHolder = contactsList.getName("7858760587");
        System.out.println("Questa è la riga che mi ha fatto");
        System.out.println("dannare per un'ora e mezza ⬇");
        System.out.println("Il numero 7858760587 è di "+numberHolder +" ⬅");
        System.out.println("esatto,proprio lei ⬆");
        contactsList.printAllContacts();

    }
}
