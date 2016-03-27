package client;

import java_cup.runtime.Symbol;
import java.util.*;

%%

Comentario      ="#*""#"*([^*#]|[^*]"#"|"*"[^#])*"*"*"*#" 
Comentario2     =[/][/] [^\n]* [\n]
num     =[0-9]+[.[0-9]]*
L = [a-zA-Z]
D = [0-9]
S=["."|"/"|"_"]
DP = ":"
IG = "="
MD = "-$"
as = {DP}{DP}{IG}
id = {L}{S}*({L}|{D}|{S})*

CADENACOMILLASDOBLES = [\"]([^\"\n]|(\\\"))*[\"]
CACHAR = [\']([^\'\n]|(\\\'))*[\']






%cupsym sym
%class ALexicoC
%cup
%public
%unicode
%public
%line
%column
%char
%ignorecase

%{
//VARIALES Y METODOS DEL SCANER
public static LinkedList<String> tokens  = new LinkedList();
%}

%%

<YYINITIAL>{
/* PALABRAS RESERVADAS */

"+"             { tokens.add(yytext()); return new Symbol(sym.MAS,yycolumn,yyline, new String("+"));}
"-"             { tokens.add(yytext()); return new Symbol(sym.MENOS,yycolumn,yyline, new String("-"));}
"*"             { tokens.add(yytext()); return new Symbol(sym.POR,yycolumn,yyline, new String("*"));}  
"/"             { tokens.add(yytext()); return new Symbol(sym.DIV,yycolumn,yyline, new String("/"));}
"^"             { return new Symbol(sym.POTENC,yycolumn,yyline, new String("^"));}
"++"            { tokens.add(yytext()); return new Symbol(sym.MASM,yycolumn,yyline, new String("++"));}
"--"            { tokens.add(yytext()); return new Symbol(sym.MENOSM,yycolumn,yyline, new String("--"));}
"("             { tokens.add(yytext()); return new Symbol(sym.PARA,yycolumn,yyline, new String("("));}
")"             { tokens.add(yytext()); return new Symbol(sym.PARC,yycolumn,yyline, new String(")"));}
"{"             { tokens.add(yytext()); return new Symbol(sym.LLAVEA,yycolumn,yyline, new String("{"));}
"}"             { tokens.add(yytext()); return new Symbol(sym.LLAVEC,yycolumn,yyline, new String("}"));}
";"             { tokens.add(yytext()); return new Symbol(sym.PUNTOC,yycolumn,yyline, new String(";"));}
"="              { tokens.add(yytext()); return new Symbol(sym.IGUAL,yycolumn,yyline, new String("="));}
"\""            { tokens.add(yytext()); return new Symbol(sym.COMILLA,yycolumn,yyline, new String("\""));}
"<"             { tokens.add(yytext()); return new Symbol(sym.MNR,yycolumn,yyline, new String("<"));}
">"             { tokens.add(yytext()); return new Symbol(sym.MYR,yycolumn,yyline, new String(">"));}
">="            { tokens.add(yytext()); return new Symbol(sym.MYREQ,yycolumn,yyline, new String(">="));}
"<="            { tokens.add(yytext()); return new Symbol(sym.MNREQ,yycolumn,yyline, new String("<="));}
"=="            { tokens.add(yytext()); return new Symbol(sym.IGUALI,yycolumn,yyline, new String("=="));}
"!="            { tokens.add(yytext()); return new Symbol(sym.NOIGUAL,yycolumn,yyline, new String("!="));}
"."             { tokens.add(yytext()); return new Symbol(sym.PUNTO,yycolumn,yyline, new String("."));}
".."            { tokens.add(yytext()); return new Symbol(sym.PUNTOS,yycolumn,yyline, new String(".."));}
"_"             { tokens.add(yytext()); return new Symbol(sym.BAJO,yycolumn,yyline, new String("_"));}
","             { tokens.add(yytext()); return new Symbol(sym.COMA,yycolumn,yyline, new String(","));}
":"             { tokens.add(yytext()); return new Symbol(sym.DOSP,yycolumn,yyline, new String(":"));}
"$"             { tokens.add(yytext()); return new Symbol(sym.D,yycolumn,yyline, new String(yytext()));}
"reply"              { tokens.add(yytext()); return new Symbol(sym.REPLY,yycolumn,yyline, new String(yytext()));}
"Usuario"            { tokens.add(yytext()); return new Symbol(sym.USER,yycolumn,yyline, new String(yytext()));}
"id"                 { tokens.add(yytext()); return new Symbol(sym.IDE,yycolumn,yyline, new String(yytext()));}
"access"             { tokens.add(yytext()); return new Symbol(sym.ACCESS,yycolumn,yyline, new String(yytext()));}
"True"               { tokens.add(yytext()); return new Symbol(sym.TRUE,yycolumn,yyline, new String(yytext()));}
"Falso"              { tokens.add(yytext()); return new Symbol(sym.FALSE,yycolumn,yyline, new String(yytext()));}
"Fail"               { tokens.add(yytext()); return new Symbol(sym.FAIL,yycolumn,yyline, new String(yytext()));}
"registro"           { tokens.add(yytext()); return new Symbol(sym.REG,yycolumn,yyline, new String(yytext()));}
"modificar"          { tokens.add(yytext()); return new Symbol(sym.MOD,yycolumn,yyline, new String(yytext()));}
"eliminar"           { tokens.add(yytext()); return new Symbol(sym.SUP,yycolumn,yyline, new String(yytext()));}
"sucursal"           { tokens.add(yytext()); return new Symbol(sym.SUC,yycolumn,yyline, new String(yytext()));}
"tienda"             { tokens.add(yytext()); return new Symbol(sym.TIE,yycolumn,yyline, new String(yytext()));}
"producto"           { tokens.add(yytext()); return new Symbol(sym.PROD,yycolumn,yyline, new String(yytext()));}
"error"              { tokens.add(yytext()); return new Symbol(sym.ER,yycolumn,yyline, new String(yytext()));}
"descripcion"        { tokens.add(yytext()); return new Symbol(sym.DES,yycolumn,yyline, new String(yytext()));}
"lista"              { tokens.add(yytext()); return new Symbol(sym.LIST,yycolumn,yyline, new String(yytext()));}
"codigo"             { tokens.add(yytext()); return new Symbol(sym.COD,yycolumn,yyline, new String(yytext()));}
"propietario"        { tokens.add(yytext()); return new Symbol(sym.PROP,yycolumn,yyline, new String(yytext()));}
"nombre"             { tokens.add(yytext()); return new Symbol(sym.NOM,yycolumn,yyline, new String(yytext()));}
"direccion"          { tokens.add(yytext()); return new Symbol(sym.DIR,yycolumn,yyline, new String(yytext()));}
"telefono"           { tokens.add(yytext()); return new Symbol(sym.TEL,yycolumn,yyline, new String(yytext()));}
"cantidad"           { tokens.add(yytext()); return new Symbol(sym.CANT,yycolumn,yyline, new String(yytext()));}
"marca"              { tokens.add(yytext()); return new Symbol(sym.MARC,yycolumn,yyline, new String(yytext()));}
"color"              { tokens.add(yytext()); return new Symbol(sym.COLOR,yycolumn,yyline, new String(yytext()));}
"tamaño"             { tokens.add(yytext()); return new Symbol(sym.TAM,yycolumn,yyline, new String(yytext()));}
{MD}                 { tokens.add(yytext()); return new Symbol(sym.MD,yycolumn,yyline, new String(yytext()));}












{num}       { tokens.add(yytext()); return new Symbol(sym.num, yycolumn,yyline,new String(yytext()));}
{id}        { tokens.add(yytext()); return new Symbol(sym.id, yycolumn,yyline,new String(yytext()));}
{Comentario}        { tokens.add(yytext()); /* Se ignoran */}
{Comentario2}       { tokens.add(yytext()); /* Se ignoran */}
{CADENACOMILLASDOBLES} { tokens.add(yytext());  return new Symbol(sym.CADSPACE,yycolumn,yyline, new String(yytext()));}
{CACHAR} { tokens.add(yytext());  return new Symbol(sym.CACHAR,yycolumn,yyline, new String(yytext()));}


/* BLANCOS */
[ \t\r\f\n]+        { /* Se ignoran */}


/* ERRORES LEXICOS */
.                    { System.out.println("Error lexico: "+yytext());}
}



