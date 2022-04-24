
import java.util.Scanner;

public class Encoding {
    private String originalText = "";
    public Integer key;
    private String cipherText = "";

    public void setOriginalText(String originalText) {
        this.originalText = originalText.toUpperCase();
    }

    public String getOriginalText() {
        return originalText;
    }

    //getting user input
    public void userInput() {
        try {
            System.out.println("Enter a text:");
            Scanner scanner = new Scanner(System.in);
            String originalText = scanner.nextLine();
            this.setOriginalText(originalText);

            System.out.println("Enter a key:");
            this.key = scanner.nextInt();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public String cipher() {
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        //split words using space
        for (String word:this.getOriginalText().split(" ")) {
            //encode each letter of a word
            for (int i = 0; i < word.length(); i++) {
                //getting index of  each alphabet char
                int currentIndex = alphabet.indexOf(word.charAt(i));
                int newIndex = (currentIndex - this.key);
                newIndex = newIndex<0?newIndex+26:newIndex; //%26 if key is not within margin of 26
                char cipherLetter = alphabet.charAt(newIndex);
                cipherText = cipherText + cipherLetter;

            }
            //put spaces after each encoded word
            cipherText=cipherText+" ";
        }

            return cipherText;

    }
}



