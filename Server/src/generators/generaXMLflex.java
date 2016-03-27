
package generators;

import java.io.File;

public class generaXMLflex {

    public static void main(String []args){
           jflex.Main.generate(new File("src"+File.separator+"analizadores"+ File.separator + "aLex1.flex"));
    }
    
    }
   

