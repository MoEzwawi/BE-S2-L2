package es2;
import java.util.*;

public class Main {
    public static void main(String[] args){
        System.out.println("Inserisci il numero di interi desiderato");
        Scanner input = new Scanner(System.in);
        int numberOfElems = Integer.parseInt(input.nextLine());
        List<Integer> randomIntegers = giveMeOrderedRandomList(numberOfElems);
        System.out.println("Ecco un lista ordinata di "+numberOfElems+" interi: " +randomIntegers.toString());
        List<Integer> upAndDown = montagnaRussa(randomIntegers);
        System.out.println("Ecco la lista che sale e scende: "+upAndDown);
        System.out.println("Quante discese ti vuoi fare sulla montagna russa?");
        int num = Integer.parseInt(input.nextLine());
        List<Integer> repeatedUpAndDown = duplicateAndMerge(upAndDown,num);
        plotGraphDetail(repeatedUpAndDown);
        int bool=0;
        System.out.println("Premi 1 per gli elementi in posizione dispari");
        System.out.println("Premi 2 per gli elementi in posizione pari");
        try {
            bool = Integer.parseInt(input.nextLine());
            while (bool != 1 && bool != 2) {
                System.err.println("Metti o 1 o 2");
                bool=Integer.parseInt(input.nextLine());
            }
        } catch (NumberFormatException ex) {
            System.err.println("Inserisci un numero");
        }
        input.close();
        boolean tf;
        if(bool==2)tf=false;
        else tf=true;
        pariODispari(upAndDown,tf);
    }
    private static List giveMeOrderedRandomList(int n){
        List<Integer> randomIntegers = new ArrayList<>();
        for(int i=0;i<n;i++){
            Random rndm = new Random();
            randomIntegers.add(rndm.nextInt(11));
        }
        Collections.sort(randomIntegers);
        return randomIntegers;
    }
    private static List montagnaRussa(List<Integer> list){
        List rollerCoasterList = new ArrayList<>();
        Collections.sort(list);
        rollerCoasterList.addAll(list);
        Collections.sort(list,Collections.reverseOrder());
        rollerCoasterList.addAll(list);
        int centerIndex = rollerCoasterList.size()/2;
        rollerCoasterList.remove(centerIndex);
        return rollerCoasterList;
    }
    private static void pariODispari(List<Integer> list, boolean b){
        if (b){
            for (int i=0;i<list.size();i+=2){
                System.out.println(list.get(i)+" posizione= "+(i+1));
            }
        } else {
            for (int i=1;i<list.size();i+=2){
                System.out.println(list.get(i)+" posizione= "+(i+1));
            }
        }
    }

    //Sorry drawGraph ma ti mando in pensione :')
    private static void drawGraph(List<Integer> list){
        for(int i=0;i<list.size();i++){
            String str = "";
            for(int j=0;j<list.get(i);j++){
                str += "*";
            }
            System.out.println(str);
        }
        System.out.println("Ecco la montagna russa!");
    }
    private static List duplicateAndMerge(List list,int n){
        List l = new ArrayList<>();
        for (int i=0; i<n;i++){
            l.addAll(list);
        }
        return l;
    }
    private static void plotGraphDetail(List list){
        System.out.println("Ecco la montagna russa:");
        int maxElem = (Integer) Collections.max(list);
        for (int i=maxElem;i>0;i--){
            String str = "";
            for (int j=0;j<list.size();j++){
                if ((int)list.get(j)>=i) str += " * ";
                else str += "   ";
            }
            System.out.println(str);
        }
    }
}