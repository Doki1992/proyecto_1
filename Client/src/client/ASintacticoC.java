
//----------------------------------------------------
// The following code was generated by CUP v0.11a beta 20060608
// Sat Mar 26 19:30:55 CST 2016
//----------------------------------------------------

package client;

import java.io.*;
import java_cup.runtime.*;
import java.util.LinkedList;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import java.util.Hashtable;

/** CUP v0.11a beta 20060608 generated parser.
  * @version Sat Mar 26 19:30:55 CST 2016
  */
public class ASintacticoC extends java_cup.runtime.lr_parser {

  /** Default constructor. */
  public ASintacticoC() {super();}

  /** Constructor which sets the default scanner. */
  public ASintacticoC(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public ASintacticoC(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\021\000\002\002\004\000\002\002\004\000\002\002" +
    "\003\000\002\003\034\000\002\004\003\000\002\005\005" +
    "\000\002\005\005\000\002\005\003\000\002\006\005\000" +
    "\002\006\005\000\002\006\003\000\002\007\005\000\002" +
    "\007\005\000\002\007\004\000\002\007\003\000\002\007" +
    "\003\000\002\007\003" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\065\000\004\030\005\001\002\000\006\002\066\030" +
    "\005\001\002\000\004\040\007\001\002\000\006\002\uffff" +
    "\030\uffff\001\002\000\004\030\010\001\002\000\004\030" +
    "\011\001\002\000\004\041\012\001\002\000\004\030\013" +
    "\001\002\000\004\030\014\001\002\000\004\042\015\001" +
    "\002\000\004\030\016\001\002\000\016\005\020\012\027" +
    "\020\030\022\024\101\022\102\017\001\002\000\020\004" +
    "\ufff2\005\ufff2\006\ufff2\007\ufff2\021\ufff2\023\ufff2\030\ufff2" +
    "\001\002\000\016\005\020\012\027\020\030\022\024\101" +
    "\022\102\017\001\002\000\020\004\061\005\062\006\ufffa" +
    "\007\ufffa\021\ufffa\023\ufffa\030\ufffa\001\002\000\020\004" +
    "\ufff3\005\ufff3\006\ufff3\007\ufff3\021\ufff3\023\ufff3\030\ufff3" +
    "\001\002\000\010\021\ufffd\023\ufffd\030\ufffd\001\002\000" +
    "\016\005\020\012\027\020\030\022\024\101\022\102\017" +
    "\001\002\000\020\004\ufff7\005\ufff7\006\054\007\053\021" +
    "\ufff7\023\ufff7\030\ufff7\001\002\000\004\030\033\001\002" +
    "\000\020\004\ufff1\005\ufff1\006\ufff1\007\ufff1\021\ufff1\023" +
    "\ufff1\030\ufff1\001\002\000\016\005\020\012\027\020\030" +
    "\022\024\101\022\102\017\001\002\000\004\021\032\001" +
    "\002\000\020\004\ufff6\005\ufff6\006\ufff6\007\ufff6\021\ufff6" +
    "\023\ufff6\030\ufff6\001\002\000\004\042\034\001\002\000" +
    "\004\027\035\001\002\000\004\030\036\001\002\000\004" +
    "\043\037\001\002\000\004\030\040\001\002\000\016\005" +
    "\020\012\027\020\030\022\024\101\022\102\017\001\002" +
    "\000\004\030\042\001\002\000\004\043\043\001\002\000" +
    "\004\027\044\001\002\000\004\030\045\001\002\000\004" +
    "\041\046\001\002\000\004\027\047\001\002\000\004\030" +
    "\050\001\002\000\004\040\051\001\002\000\004\027\052" +
    "\001\002\000\006\002\ufffe\030\ufffe\001\002\000\016\005" +
    "\020\012\027\020\030\022\024\101\022\102\017\001\002" +
    "\000\016\005\020\012\027\020\030\022\024\101\022\102" +
    "\017\001\002\000\020\004\ufff9\005\ufff9\006\ufff9\007\ufff9" +
    "\021\ufff9\023\ufff9\030\ufff9\001\002\000\020\004\ufff8\005" +
    "\ufff8\006\ufff8\007\ufff8\021\ufff8\023\ufff8\030\ufff8\001\002" +
    "\000\004\023\060\001\002\000\020\004\ufff5\005\ufff5\006" +
    "\ufff5\007\ufff5\021\ufff5\023\ufff5\030\ufff5\001\002\000\016" +
    "\005\020\012\027\020\030\022\024\101\022\102\017\001" +
    "\002\000\016\005\020\012\027\020\030\022\024\101\022" +
    "\102\017\001\002\000\020\004\ufffb\005\ufffb\006\ufffb\007" +
    "\ufffb\021\ufffb\023\ufffb\030\ufffb\001\002\000\020\004\ufffc" +
    "\005\ufffc\006\ufffc\007\ufffc\021\ufffc\023\ufffc\030\ufffc\001" +
    "\002\000\020\004\ufff4\005\ufff4\006\ufff4\007\ufff4\021\ufff4" +
    "\023\ufff4\030\ufff4\001\002\000\004\002\001\001\002\000" +
    "\006\002\000\030\000\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\065\000\006\002\003\003\005\001\001\000\004\003" +
    "\066\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\012\004\025\005\022\006\020\007\024\001\001\000" +
    "\002\001\001\000\010\005\064\006\020\007\024\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\012\004\056\005\022\006\020\007\024\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\012\004" +
    "\030\005\022\006\020\007\024\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\012" +
    "\004\040\005\022\006\020\007\024\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\006" +
    "\006\055\007\024\001\001\000\006\006\054\007\024\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\010\005\063\006\020\007\024\001" +
    "\001\000\010\005\062\006\020\007\024\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$ASintacticoC$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$ASintacticoC$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$ASintacticoC$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}



    // METODOS Y VARIABLES GLOBALES DEL PARSER, PUEDEN SER PUBLICAS O PRIVADAS
     public String salida="";
    public ArrayList<String> getDatosFigura(){
    return action_obj.gman;
    }
    public int tam1, tam2;
    public LinkedList tab = new LinkedList();
  //  static LinkedList<Element> gmansimb = new LinkedList();
    public boolean err=false;
    public String resultado="";

    public void syntax_error(Symbol s){
    /**Metodo al que se llama automaticamente ante algun error sintactico.*/
            err=true;
            System.out.println("Error Sintactico en la Linea " + (s.right+1) +" Columna "+s.left+ ". Identificador " +s.value + " no reconocido." );
       tab.add(s.right+1);
       tab.add(s.left);
       tab.add(s.value);
        }

    public void unrecovered_syntax_error(Symbol s) throws java.lang.Exception{
    /**Metodo al que se llama en el momento en que ya no es posible una recuperacion de errores.*/
            err=true;
            System.out.println("Error Sintactico en la Linea " + (s.right+1)+ "Columna "+s.left+". Identificador " + s.value + " no reconocido.");
    }


    
}

/** Cup generated class to encapsulate user supplied action code.*/
class CUP$ASintacticoC$actions {


    ArrayList<String> gman = new ArrayList();
    

    //METODOS Y VARIABLES QUE SOLO PUEDEN SER ACCEDIDAS DENTRO DEL PARSER
    int exponente(int exp){
    int resultado= 1;
    for(int i=1; i<exp; i++){
    resultado = resultado *2;
    }
    return resultado;
    }
    
  private final ASintacticoC parser;

  /** Constructor */
  CUP$ASintacticoC$actions(ASintacticoC parser) {
    this.parser = parser;
  }

  /** Method with the actual generated action code. */
  public final java_cup.runtime.Symbol CUP$ASintacticoC$do_action(
    int                        CUP$ASintacticoC$act_num,
    java_cup.runtime.lr_parser CUP$ASintacticoC$parser,
    java.util.Stack            CUP$ASintacticoC$stack,
    int                        CUP$ASintacticoC$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$ASintacticoC$result;

      /* select the action based on the action number */
      switch (CUP$ASintacticoC$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // factor ::= CADSPACE 
            {
              String RESULT =null;

              CUP$ASintacticoC$result = parser.getSymbolFactory().newSymbol("factor",5, ((java_cup.runtime.Symbol)CUP$ASintacticoC$stack.peek()), ((java_cup.runtime.Symbol)CUP$ASintacticoC$stack.peek()), RESULT);
            }
          return CUP$ASintacticoC$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // factor ::= id 
            {
              String RESULT =null;

              CUP$ASintacticoC$result = parser.getSymbolFactory().newSymbol("factor",5, ((java_cup.runtime.Symbol)CUP$ASintacticoC$stack.peek()), ((java_cup.runtime.Symbol)CUP$ASintacticoC$stack.peek()), RESULT);
            }
          return CUP$ASintacticoC$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // factor ::= num 
            {
              String RESULT =null;

              CUP$ASintacticoC$result = parser.getSymbolFactory().newSymbol("factor",5, ((java_cup.runtime.Symbol)CUP$ASintacticoC$stack.peek()), ((java_cup.runtime.Symbol)CUP$ASintacticoC$stack.peek()), RESULT);
            }
          return CUP$ASintacticoC$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // factor ::= MENOS expresion 
            {
              String RESULT =null;

              CUP$ASintacticoC$result = parser.getSymbolFactory().newSymbol("factor",5, ((java_cup.runtime.Symbol)CUP$ASintacticoC$stack.elementAt(CUP$ASintacticoC$top-1)), ((java_cup.runtime.Symbol)CUP$ASintacticoC$stack.peek()), RESULT);
            }
          return CUP$ASintacticoC$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // factor ::= LLAVEA in LLAVEC 
            {
              String RESULT =null;

              CUP$ASintacticoC$result = parser.getSymbolFactory().newSymbol("factor",5, ((java_cup.runtime.Symbol)CUP$ASintacticoC$stack.elementAt(CUP$ASintacticoC$top-2)), ((java_cup.runtime.Symbol)CUP$ASintacticoC$stack.peek()), RESULT);
            }
          return CUP$ASintacticoC$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // factor ::= PARA in PARC 
            {
              String RESULT =null;

              CUP$ASintacticoC$result = parser.getSymbolFactory().newSymbol("factor",5, ((java_cup.runtime.Symbol)CUP$ASintacticoC$stack.elementAt(CUP$ASintacticoC$top-2)), ((java_cup.runtime.Symbol)CUP$ASintacticoC$stack.peek()), RESULT);
            }
          return CUP$ASintacticoC$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // termino ::= factor 
            {
              String RESULT =null;

              CUP$ASintacticoC$result = parser.getSymbolFactory().newSymbol("termino",4, ((java_cup.runtime.Symbol)CUP$ASintacticoC$stack.peek()), ((java_cup.runtime.Symbol)CUP$ASintacticoC$stack.peek()), RESULT);
            }
          return CUP$ASintacticoC$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // termino ::= factor DIV termino 
            {
              String RESULT =null;

              CUP$ASintacticoC$result = parser.getSymbolFactory().newSymbol("termino",4, ((java_cup.runtime.Symbol)CUP$ASintacticoC$stack.elementAt(CUP$ASintacticoC$top-2)), ((java_cup.runtime.Symbol)CUP$ASintacticoC$stack.peek()), RESULT);
            }
          return CUP$ASintacticoC$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // termino ::= factor POR termino 
            {
              String RESULT =null;

              CUP$ASintacticoC$result = parser.getSymbolFactory().newSymbol("termino",4, ((java_cup.runtime.Symbol)CUP$ASintacticoC$stack.elementAt(CUP$ASintacticoC$top-2)), ((java_cup.runtime.Symbol)CUP$ASintacticoC$stack.peek()), RESULT);
            }
          return CUP$ASintacticoC$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // expresion ::= termino 
            {
              String RESULT =null;

              CUP$ASintacticoC$result = parser.getSymbolFactory().newSymbol("expresion",3, ((java_cup.runtime.Symbol)CUP$ASintacticoC$stack.peek()), ((java_cup.runtime.Symbol)CUP$ASintacticoC$stack.peek()), RESULT);
            }
          return CUP$ASintacticoC$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // expresion ::= termino MENOS expresion 
            {
              String RESULT =null;

              CUP$ASintacticoC$result = parser.getSymbolFactory().newSymbol("expresion",3, ((java_cup.runtime.Symbol)CUP$ASintacticoC$stack.elementAt(CUP$ASintacticoC$top-2)), ((java_cup.runtime.Symbol)CUP$ASintacticoC$stack.peek()), RESULT);
            }
          return CUP$ASintacticoC$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // expresion ::= termino MAS expresion 
            {
              String RESULT =null;

              CUP$ASintacticoC$result = parser.getSymbolFactory().newSymbol("expresion",3, ((java_cup.runtime.Symbol)CUP$ASintacticoC$stack.elementAt(CUP$ASintacticoC$top-2)), ((java_cup.runtime.Symbol)CUP$ASintacticoC$stack.peek()), RESULT);
            }
          return CUP$ASintacticoC$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // in ::= expresion 
            {
              String RESULT =null;

              CUP$ASintacticoC$result = parser.getSymbolFactory().newSymbol("in",2, ((java_cup.runtime.Symbol)CUP$ASintacticoC$stack.peek()), ((java_cup.runtime.Symbol)CUP$ASintacticoC$stack.peek()), RESULT);
            }
          return CUP$ASintacticoC$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // pro ::= D REPLY D D USER D D IDE D in D IDE MD D ACCESS D in D ACCESS MD D USER MD D REPLY MD 
            {
              String RESULT =null;

              CUP$ASintacticoC$result = parser.getSymbolFactory().newSymbol("pro",1, ((java_cup.runtime.Symbol)CUP$ASintacticoC$stack.elementAt(CUP$ASintacticoC$top-25)), ((java_cup.runtime.Symbol)CUP$ASintacticoC$stack.peek()), RESULT);
            }
          return CUP$ASintacticoC$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // programa ::= pro 
            {
              String RESULT =null;

              CUP$ASintacticoC$result = parser.getSymbolFactory().newSymbol("programa",0, ((java_cup.runtime.Symbol)CUP$ASintacticoC$stack.peek()), ((java_cup.runtime.Symbol)CUP$ASintacticoC$stack.peek()), RESULT);
            }
          return CUP$ASintacticoC$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // programa ::= programa pro 
            {
              String RESULT =null;

              CUP$ASintacticoC$result = parser.getSymbolFactory().newSymbol("programa",0, ((java_cup.runtime.Symbol)CUP$ASintacticoC$stack.elementAt(CUP$ASintacticoC$top-1)), ((java_cup.runtime.Symbol)CUP$ASintacticoC$stack.peek()), RESULT);
            }
          return CUP$ASintacticoC$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= programa EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$ASintacticoC$stack.elementAt(CUP$ASintacticoC$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$ASintacticoC$stack.elementAt(CUP$ASintacticoC$top-1)).right;
		String start_val = (String)((java_cup.runtime.Symbol) CUP$ASintacticoC$stack.elementAt(CUP$ASintacticoC$top-1)).value;
		RESULT = start_val;
              CUP$ASintacticoC$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$ASintacticoC$stack.elementAt(CUP$ASintacticoC$top-1)), ((java_cup.runtime.Symbol)CUP$ASintacticoC$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$ASintacticoC$parser.done_parsing();
          return CUP$ASintacticoC$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number found in internal parse table");

        }
    }
}

