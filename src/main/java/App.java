
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) {
        try {
            System.out.println("Enter a text:");
            InputStreamReader streamReader = new InputStreamReader(System.in);
            BufferedReader bufferedReader = new BufferedReader(streamReader);
            String text = bufferedReader.readLine();
            System.out.println("Your text is "+text);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
