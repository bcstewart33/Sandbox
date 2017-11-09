
class Sandbox {

    public static void main (String [] args)
    {
        Salutation ();
        Process ();
    }

    public static void Salutation ()
    {
        System.out.println ("Hello World...Reference!");
    }

    public static void Process ()
    {
        DataClass data = new DataClass ();
        A_Class instA = new A_Class (data);
        B_Class instB = new B_Class (data);

        System.out.println ("Data: " + data.getStr ());
        System.out.println (instA.getStr ());
        System.out.println (instB.getStr ());

        instA.changeVal ();

        System.out.println (instA.getStr ());
        System.out.println (instB.getStr ());
        System.out.println ("Data: " + data.getStr ());
        
        instB.changeVal ();

        System.out.println (instA.getStr ());
        System.out.println (instB.getStr ());
        System.out.println ("Data: " + data.getStr ());
    }
}

class DataClass {

    private int val = 0;
    private String str = ".";

    public DataClass () {;}

    public int getVal () { return val; }
    public void setVal (int newVal) { val = newVal; }

    public String getStr () { return str + val; }
}

interface BaseClass {

    public void changeVal ();
    public String getStr ();
}

class A_Class implements BaseClass {

    private DataClass data;

    public A_Class (DataClass inData) { data = inData; }

    public void changeVal () {
        int temp = data.getVal ();
        data.setVal (++temp);
    }

    public String getStr () { return "A" + data.getStr (); }
}

class B_Class implements BaseClass {

    private DataClass data;

    public B_Class (DataClass inData) { data = inData; }

    public void changeVal () {
        int temp = data.getVal ();
        data.setVal (--temp);
    }

    public String getStr () { return "B" + data.getStr (); }
}
