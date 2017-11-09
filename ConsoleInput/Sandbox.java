// #######
// ### Sandbox.ConsoleInput
// #######

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

class Sandbox {

    public static void main (String [] args)
    {
        Salutation ();
        Process ();
    }

    public static void Salutation ()
    {
        System.out.println ("SandBox...ConsoleInput!");
    }

    public static boolean isValidInput (String ipt)
    {
        boolean result = false;

        if (ipt.length () >= 3) {

            String[] section = ipt.split ("-", -1);

for (int ix = 0; ix < section.length; ix++) {            
System.out.println ("DBG: section[" + ix + "] = " + section[ix]);
}
            if (section.length >= 2) {

                boolean isNumber = section[0].matches("[0-9]+");
                boolean isCharacter = section[1].matches("[abcdefghiABCDEFGHI]");
if (isNumber) {            
System.out.println ("DBG: IsNumber Match!");
}
if (isCharacter) {
System.out.println ("DBG: IsCharacter Match!");
}
                if (isNumber && isCharacter) {

                    Integer col = Integer.parseInt (section[0]);

                    if ((col > 0 && col <= 12)) {

                        result = true;

                        String rowStr = section[1].toUpperCase ();
                        Integer CHAR_REF = (int) 'A';
                        Integer row = (int) rowStr.charAt(0);
System.out.printf ("DBG: [%d:%d]\n", col, row-CHAR_REF+1);
                    }
                }
            }
        }

        return result;
    }

    public static void Process ()
    {
        System.out.println ("### Running...");

        int counter = 0;

        String iptStr = "";

        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));

        do {

            System.out.print ("(" + counter + ") Enter Tile:");

            try {

                iptStr = br.readLine ();
                System.out.println ("[" + iptStr + "]");

                if (isValidInput (iptStr)) { counter++; }
                else { System.out.println ("ERROR Invalid Tile input: <1..12>-<A..I> only"); }
            }
            catch (IOException e) { e.printStackTrace (); }

        } while (counter < 5);

        try { if (br != null) { br.close (); } }
        catch (IOException e) { e.printStackTrace (); }

        System.out.println ("### Done");
    }
}
