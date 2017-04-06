package collections;

import java.util.Scanner;
import java.util.Stack;

public class Zad2Kolekcja {

    /*Korzystając ze Stosu, napisz funkcję, która odczytuje daną liczbę i zwraca liczbę zapisaną w systemie dwójkowym.
     Argumentem funkcji jest liczba całkowita(int), zwróconym wynikiemciąg znaków (String).*/

    public static String toStringBinarySystem(int number){
        int binaryNumber = number;

        Stack<Integer>stack = new Stack<>();
        while(binaryNumber!=0){
            stack.push(binaryNumber%2);
            binaryNumber/=2;

        }
        StringBuilder returnNumber = new StringBuilder();

        while(!stack.isEmpty()){
            returnNumber.append(stack.pop());
        }
        return returnNumber.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę w systemie dziesiętnym ");
        int number = scanner.nextInt();
        System.out.println("Liczba w systemie dwójkowym to "+ Zad2Kolekcja.toStringBinarySystem(number));
    }
}
//pop pokazuje wartość i zdejmuje kartkę ze stosu