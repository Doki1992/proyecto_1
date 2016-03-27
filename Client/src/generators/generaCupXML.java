
package generators;

import java.io.File;

public class generaCupXML {

    public static void main(String []args){
         String entrada[] = new String[5];
        entrada[0]="-destdir";
        entrada[1]="src"+File.separator+"analizadores";
       entrada[2]="-parser";
        entrada[3]="AnalizadorS1";
        entrada[4]="src"+File.separator+"analizadores"+File.separator+"aSintactico1.cup";
        try {
            java_cup.Main.main(entrada);
            }
        catch (Exception e) {
            System.out.print(e);
            }
    }
}
