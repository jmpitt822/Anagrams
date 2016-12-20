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
        char[] firstArray = convertToArray(firstWord);
        char[] secondArray = convertToArray(secondWord);
        List<Character> firstList = convertToList(firstArray);
        List<Character> secondList = convertToList(secondArray);
        sortAndCompare(firstList, secondList);

    }

    private static String getFirstWord(Scanner scanner) {
        System.out.println("Please enter a word or phrase:");
        return scanner.nextLine().toLowerCase();
    }

    private static String getSecondWord(Scanner scanner) {
        System.out.println("Please enter a second word or phrase:");
        return scanner.nextLine().toLowerCase();
    }

    private static char[] convertToArray(String word) {
        return word.toCharArray();
    }

    private static List<Character> convertToList(char[] arrayOfLetters) {
        List<Character> listOfCharacters = new ArrayList<>();
        for(int i = 0; i < arrayOfLetters.length; i++) {
            if(arrayOfLetters[i] != ' ') {
                listOfCharacters.add(arrayOfLetters[i]);
            }
        }
        return listOfCharacters;
    }

    private static void sortAndCompare(List<Character> firstList, List<Character> secondList){
        Collections.sort(firstList);
        Collections.sort(secondList);
        if (firstList.equals(secondList)){
            System.out.println("Yes, that is an anagram!");
        } else {
            System.out.println("Nope, that's not an anagram...");
        }
    }


}
