import java.util.*;
import java.io.*;
/**
 * @author Anthony Tu, 222096770
 * This class implements an object that stores text contents loaded from a file.
 * It also contains methods that:
 * - return the text contents as a List of words
 * - compute the word and letter frequencies and return those as a Map
 */
public class TextFile {
	//add a constructor which takes the file name as a parameter

	//add a method that returns a List where each item is a word from a file.
	//A word is any sequence of one or more characters separated with spaces
	//or punctuation characters.
	
	//add a method that computes letter frequencies in the text file.
	//It treats lowercase and upppercase characters as one character.
	//The method returns a Map object of Character to Integer (characters are
	//uppercase letters).

	//add a method that computes word frequencies in the text file.
	//The method returns a Map object of String to Integer.

	
	private String name = "";
	
	public TextFile(String name) {
		this.name = name;
	}
	
	public List<String> getWords(){
		File file = new File(name);
		List<String> words = new ArrayList<>();
		
		try(Scanner input = new Scanner(file)){
			if (input.hasNext()) {
				String filewords = input.useDelimiter("\\Z").next();
				
				String[] allwords = filewords.split("\\W+");
				
				for (String w: allwords) {
					words.add(w);
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return words;
	}
	
	public Map<String, Integer> getWordFrequencies(){
		List<String> words = getWords();
		Map <String, Integer> count = new HashMap<>();
		
		
		for (String w: words) {
			count.put(w,  count.getOrDefault(w,0) +1);
		}
		
		return count;
	}
	
	public Map<Character, Integer> getLetterFrequencies(){
		Map<Character, Integer> count = new HashMap<>();
		File file = new File(name);
		
		try (Scanner input = new Scanner (file)){
			if (input.hasNext()) {
				String words = input.useDelimiter("\\Z").next();
				
				for (char c: words.toCharArray()) {
					if (Character.isLetter(c)) {
						char up = Character.toUpperCase(c);
						count.put(up, count.getOrDefault(up, 0) + 1);
					}
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return count;
	}
	
}	
