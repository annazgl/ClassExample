package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Zad1Kolekcja {

    /*Stwórz program, który będzie umożliwiał tłumaczenie słów z języka polskiego na angielski.*/

    public static void main(String[] args) {
        Map<String, String>dictionary = new HashMap<>();
        dictionary.put("kot", "cat");
        dictionary.put("pies", "dog");
        dictionary.put("dom", "house");
        System.out.println("Podaj słowo po polsku");
        Scanner scanner = new Scanner(System.in);
        String polishWord = scanner.next();

        if(dictionary.containsKey(polishWord)){
            System.out.println("Słowo po angielsku to " + dictionary.get(polishWord));
        }
        else{
            System.out.println("Nie znaleziono słowa w słowniku");
        }

    }
}
