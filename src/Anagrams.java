import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * Created by jeremypitt on 12/19/16.
 */
public class Anagrams {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstWord = getFirstWord(scanner);
        String secondWord = getSecondWord(scanner);
        compareWords(firstWord, secondWord);
    }

    private static List getFirstWord(Scanner scanner) {
        System.out.println("Please enter a word:");
        String firstWord = scanner.nextLine();
        ArrayList<Character> firstList = firstWord.
        return
    }

    private static String getSecondWord(Scanner scanner) {
        System.out.println("Please enter a second word:");
        return scanner.nextLine();
    }

    private static Boolean compareWords(String firstWord, String secondWord) {
        char[] firstList = firstWord.toCharArray();

        Collections.sort(firstList);
    }
}
