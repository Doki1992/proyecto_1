
package generators;

import java.io.File;

public class GeneraACup_1 {

    public static void main(String []args){
         String entrada[] = new String[5];
        entrada[0]="-destdir";
        entrada[1]="src"+File.separator+"client";
       entrada[2]="-parser";
        entrada[3]="ASintacticoC";
        entrada[4]="src"+File.separator+"client"+File.separator+"aSintacticoC.cup";
        try {
            java_cup.Main.main(entrada);
            }
        catch (Exception e) {
            System.out.print(e);
            }
    }
}
