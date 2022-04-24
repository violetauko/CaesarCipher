
import java.util.Scanner;

public class Decoding {
    private String cipherText="";
    public Integer key;
    public String originalText="" ;

    public void setCipherText(String cipherText) {
        this.cipherText = cipherText.toUpperCase();
    }

    public String getCipherText() {
        return cipherText;
    }

    //getting user input
    public void userInput() {
        try {
            System.out.println("Enter a cipher text:");
            Scanner scanner = new Scanner(System.in);
            String originalText = scanner.nextLine();
            this.setCipherText(originalText);

            System.out.println("Enter a key:");
            this.key = scanner.nextInt();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public String decodcipher() {
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
       //split words using space
        for (String word:this.getCipherText().split(" ")) {
            //decode each letter of a word
            for (int i = 0; i <word.length(); i++) {
                //getting index of  each alphabet char
                int currentIndex = alphabet.indexOf(word.charAt(i));
                int newIndex = (currentIndex+this.key);
                newIndex=newIndex>=26?newIndex%26:newIndex;//%26 if key is not within margin of 26
                char textLetter = alphabet.charAt(newIndex);
                originalText = originalText + textLetter;
            }
            originalText = originalText + " ";
        }
        return originalText;
    }

}
