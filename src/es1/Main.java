package es1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;
import java.util.Set;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    private static Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        logger.info("Inserisci un numero N di elementi");
        Scanner input = new Scanner(System.in);
        int numberOfElems = Integer.parseInt(input.nextLine());
        String[] myArray = new String[numberOfElems];
        Set<String> setDiParoleDuplicate = new HashSet<>();
        for(int i=0;i< myArray.length;i++){
            logger.info("Inserisci la parola numero " + (i+1));
            String currentWord = input.nextLine();
            myArray[i]=currentWord;
            for(int j=0; j<i;j++){
                if(myArray[j].equals(currentWord)) setDiParoleDuplicate.add(currentWord);
            }
        }
        input.close();
        logger.info("Le parole sono: "+Arrays.toString(myArray));
        Set<String> setDiParole = new HashSet<>(Arrays.asList(myArray));
        logger.info("Numero di parole distinte: " + String.valueOf(setDiParole.size()));
        logger.info("Elenco parole distinte: " + setDiParole.toString());
        logger.info("Parole duplicate: " + setDiParoleDuplicate.toString());
    }
}