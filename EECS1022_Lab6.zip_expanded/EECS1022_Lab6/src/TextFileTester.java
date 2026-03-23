import java.io.IOException;

public class TextFileTester {

	public static void main(String[] args) throws IOException {
		// (You can put other text files into this project. Please observe where it is stored) 
		 TextFile tf = new TextFile("text.txt");
		
		 System.out.println(tf.getWords());
		 System.out.println(tf.getWordFrequencies());
		 System.out.println(tf.getLetterFrequencies());
	}
}
