
class Sandbox {

    public static void main (String [] args)
    {
        Salutation ();
        Process ();
    }

    public static void Salutation ()
    {
        System.out.println ("Sandbox...Abstract!");
    }

    public static void Process ()
    {
        A_Class instA = new A_Class ();
        B_Class instB = new B_Class ();

        System.out.println ("### Initial Values ###");

        System.out.print ("[ ");
        System.out.print (instA.getStr () + instA.getVal ());
        System.out.print (", ");
        System.out.print (instB.getStr () + instB.getVal ());
        System.out.println (" ]");

        System.out.println ("### Running...");

        int counter = 0;

        do {

            instA.changeVal ();
            instB.changeVal ();

            System.out.print ("[ ");
            System.out.print (instA.getStr () + instA.getVal ());
            System.out.print (", ");
            System.out.print (instB.getStr () + instB.getVal ());
            System.out.println (" ]");

        } while (counter++ < 5);

        System.out.println ("### Done");
    }
}

abstract class BaseClass {

    int val = 0;
    String str = ".";

    int getVal () { return val; }
    void setVal (int newVal) { val = newVal; }
    abstract void changeVal ();
    abstract String getStr ();
}

class A_Class extends BaseClass {

    void changeVal () { val++; }

    String getStr () { return "A" + str; }
}

class B_Class extends BaseClass {

    void changeVal () { val--; }

    String getStr () { return "B" + str; }
}
