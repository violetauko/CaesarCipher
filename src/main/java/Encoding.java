
import java.util.Scanner;

public class Encoding {
    private String originalText ="";
    public Integer key;
    public String cipherText = "";

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

      //looping through the characters of originalText
        for (int i = 0; i < this.getOriginalText().length(); i++) {
            int currentIndex = alphabet.indexOf(this.getOriginalText().charAt(i));
            int newIndex = (currentIndex + this.key) % 26;
            char cipherLetter = alphabet.charAt(newIndex);
            cipherText = cipherText + cipherLetter;



        }
        return cipherText;
    }
}



//            char myLetter = this.getOriginalText().charAt(i);
//            Integer currentIndex = myList.indexOf(Character.toString(myLetter));
//            int key =currentIndex + this.key;
//            String cipherLetter = myList.get(key);
//            this.cipherText = this.cipherText + ""+ cipherLetter;
//
//        }
//        return this.cipherText;





