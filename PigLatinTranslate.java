
/* Lab 6: Translate English words to Pig Latin. 
 * What to do: Prompt the user for a word. 
 * Translate the text to Pig Latin and display it on the console. 
 * Ask the user if he or she wants to translate another word. 
 * Build Specs: 
 * Convert each word to lower case before translating. 
 * If a word starts with a VOWEL, just add "way" onto the ending. 
 * If a word starts with a consonant, move all of the consonants that appear before the 
 * first vowel to the end of the word, then add "ay" to the end of the word. 
 * HINT: Treat "y" as a consonant.
 * @author DanielChristiansen 
 */
import java.lang.String; //will be needed for strings & substrings
import java.util.Scanner; //will be needed for user input. 

public class PigLatinTranslate {

	public static void main(String[] args) {

		System.out.println("Welcome to the Pig Latin Translator!");
		System.out.println();

		// scanner used for user input
		Scanner scan = new Scanner(System.in);
		String cont = "y";
		String engWord = ""; // leave blank quotations so anything can be
								// entered by user.

		// the cont.equalsIgnoreCase ("y") is for the user to continue or not.
		while (cont.equalsIgnoreCase("y")) {
			System.out.print("Please enter a whole word in English to be translated: ");
			engWord = scan.nextLine().toLowerCase().trim(); // converts word to
															// lower case
			System.out.println();
			System.out.println("You entered the word: " + engWord);
			System.out.println();

			// output the translated word
			System.out.print("Your word translated to Pig Latin is:  " + pigWord(engWord));
			System.out.println();
			System.out.println();

			System.out.print("Would you like to enter another word? (y/n): ");
			cont = scan.nextLine();
			System.out.println();
			
		}
		System.out.println("Goodbye!");
		scan.close();
	}

	public static String pigWord(String engWord) {

		// created method pigWord for words starting with a vowel and converting
		// it.
		// Strings are an array of chars so chartAt(0) refers to first letter.

		if (engWord.charAt(0) == 'a' || engWord.charAt(0) == 'e' || engWord.charAt(0) == 'i' || engWord.charAt(0) == 'o'
				|| engWord.charAt(0) == 'u') {

			return engWord + "way";

		}
			//method to translate if starts with consonant
			for ( int i  = 0; i < engWord.length(); i++) {
			if (engWord.charAt(i) == 'a' || engWord.charAt(i) == 'e' || engWord.charAt(i) == 'i'
					|| engWord.charAt(i) == 'o' || engWord.charAt(i) == 'u') {

				String lettersBeforeVowel = engWord.substring(0, i);{
				String remainingWord = engWord.substring(i, engWord.length());
				String wordConsonant = (remainingWord + lettersBeforeVowel + "ay");

					return wordConsonant;
					
			}

		}

		{
			
		}
	}
			return "this doesn't work";
	}
}

