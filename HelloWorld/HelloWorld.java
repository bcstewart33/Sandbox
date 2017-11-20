//
// Hello World Sample
//

public class HelloWorld {

    public static void main(String[] args) {

        int ix = 0;

        // Prints "Hello, World" to the terminal window.
        System.out.println("Hello, World");

        salutation ("by bryan.stewart@10xgenomics.com");

        feature (10);

        closing ("10X Genomics Inc");
    }

    //Salutation method
    public static void salutation (String str) {

        System.out.println("HelloWorld.salutation: " + str);
    }

    //Closing method
    public static void closing (String str) {

        System.out.println("HelloWorld.closing: " + str);
    }

    //Feature method
    public static void feature (Integer val) {

        System.out.println("HelloWorld.feature: (" + val + ")");
    }
}
