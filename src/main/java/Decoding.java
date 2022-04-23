import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Decoding {
    private String originalText="";
    public Integer key;
    public String cipherText ;

    public void setOriginalText(String originalText) {
        this.originalText = originalText.toUpperCase();
    }

    public String getOriginalText() {
        return originalText;
    }

    //getting user input
    public void userInput() {
        try {
            System.out.println("Enter a plaintext:");
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


        for (int i = 0; i <cipherText.length(); i++) {
            int currentIndex = alphabet.indexOf(cipherText.charAt(i));
            int newIndex = (currentIndex-this.key) % 26;
            if(newIndex<0) {
                newIndex = alphabet.length() + newIndex;
            }
            char textLetter = alphabet.charAt(newIndex);
            originalText = originalText + textLetter;
        }
        return originalText;
    }

}
