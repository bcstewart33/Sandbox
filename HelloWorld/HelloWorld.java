//
// Hello World Sample
//

public class HelloWorld {

    public static void main(String[] args) {

        int ix = 0;

        // Prints "Hello, World" to the terminal window.
        System.out.println("Hello, World");

        Salutation ("by bryan.stewart@10xgenomics.com");

        Closing ("10X Genomics Inc");
    }

    public static void Salutation (String str) {

        System.out.println("Salutation: " + str);
    }

    public static void Closing (String str) {

        System.out.println("Closing: " + str);
    }
}
