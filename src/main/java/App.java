public class App {
    public static Encoding encoding = new Encoding();
    public static Decoding decoding=new Decoding();

    public static void main(String[] args) {
        encoding.userInput();
        System.out.println("your encrypted text is:" + encoding.cipher());

        decoding.userInput();

        System.out.println(decoding.cipher());

//
    }
}
