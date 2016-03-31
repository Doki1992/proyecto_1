package server;

import Arbol.*;
import analizadores.ALexicoS;
import analizadores.ASintacticoS;
import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.StringReader;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Duglas
 */
public class EjecutaAnalisis 
{
    
    public EjecutaAnalisis()
    {
        
    }
Document documento = new Document() {};  
    FileOutputStream ficheroPdf;
    public String analizaFile(String entrada)
    {
        try 
        {
            //crear el lexico
                ALexicoS lexico = new ALexicoS(new StringReader(entrada));
            //crear el sintactico
            ASintacticoS parser = new ASintacticoS(lexico);
            
            //ejecutar el analisis
            parser.parse();
            Nodo raiz = parser.getRaiz();
            Traductor tra = new Traductor();
            raiz.Acept(tra);
            if(parser.err==true){

                if(parser.tab.isEmpty()){
                    G_Server.jTextArea1.setText("Caja Vacía");
                }else{
                 try{
                   G_Server.jTextArea1.append("\n" + "Error de Sintáxis cercano a:   "+parser.tab.get(2).toString()+"  Fila: "+parser.tab.get(0).toString()+"  Columna: "+parser.tab.get(1).toString()+"\n");
                 //   jresultext.setText(jresultext.getText() + "\n" + "error");
                 }catch(NullPointerException e){
                    G_Server.jTextArea1.append("\n" + "Error de Sintáxis cercano a:    "+"  Fila: "+parser.tab.get(0).toString()+"  Columna: "+parser.tab.get(1).toString()+"\n");
                 }
                 
                 mostrartablaE(parser);
                    parser.err=false;
                    parser.tab.clear();
                }

            }else{
                 G_Server.jTextArea1.append( "\n" + "Análisis Sintáctico Completado.");
                 for(int i =0; i<tra.Log.size();i++){
                     G_Server.jTextArea1.append("\n" +tra.Log.get(i));
                 }
              
            }
            
       //     JOptionPane.showMessageDialog(null, "Analisis Completo","Ejemplo",1);
            return parser.salida;
            
        } 
        catch (Exception ex) 
        {
            System.err.println(ex.getMessage());
            Logger.getLogger(EjecutaAnalisis.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Ocurrio un grave problema","Ejemplo",2);
            return "Error Encontrado";
            
        }        
    }
    
    
    void mostrartablaE(ASintacticoS parser){ 
Document documento = new Document() {};  
    FileOutputStream ficheroPdf;
try 
{
 ficheroPdf = new FileOutputStream("Reporte3.pdf");
 PdfWriter.getInstance(
                       documento, 
                       ficheroPdf
                       ).setInitialLeading(20);
}
catch (Exception ex) 
{
 System.out.println(ex.toString());
}
try{
    documento.open();
    documento.add(new Paragraph("Proyecto 1 Compi1"));
    Paragraph parrafo2 = new Paragraph("Tabla de Errores");
    parrafo2.setAlignment(1);//el 1 es para centrar
    documento.add(parrafo2);
    documento.add(new Paragraph(" "));
    PdfPTable tabla = new PdfPTable(4);
    //el numero indica la cantidad de Columnas
    
    String entrada=    "";
    
    tabla.addCell("Token");
        tabla.addCell("Fila");
        tabla.addCell("Columna");
        tabla.addCell("Tipo");
        
         
         tabla.addCell(parser.tab.get(2).toString());
        tabla.addCell(parser.tab.get(0).toString());
        tabla.addCell(parser.tab.get(1).toString());
        tabla.addCell("Error Sintactico"); 
        
        
    
   
    // esto nos crea una tabla de 3 Columnas por dos Filas
    documento.add(tabla);
    documento.add(new Paragraph(" "));


    documento.close();
    
    File f = new File("Reporte3.pdf");
        if(f.exists()){
            try {Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + "Reporte3.pdf");
            
            }
            catch(Exception e){}
        }
        else
        JOptionPane.showMessageDialog(null, "No existe\n"+"Reporte3.pdf", "ERROR", JOptionPane.ERROR_MESSAGE);
}catch(Exception ex){
    System.out.println(ex.toString());
    
}
}
    
}
