
package generators;

import java.io.File;

public class GeneraACup_1 {

    public static void main(String []args){
         String entrada[] = new String[5];
        entrada[0]="-destdir";
        entrada[1]="src"+File.separator+"analizadores";
       entrada[2]="-parser";
        entrada[3]="ASintacticoS";
        entrada[4]="src"+File.separator+"analizadores"+File.separator+"aSintacticoS.cup";
        try {
            java_cup.Main.main(entrada);
            }
        catch (Exception e) {
            System.out.print(e);
            }
    }
}
