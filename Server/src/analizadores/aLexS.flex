package analizadores;

import java_cup.runtime.Symbol;
import java.util.LinkedList;

%%

Comentario      ="#*""#"*([^*#]|[^*]"#"|"*"[^#])*"*"*"*#" 
Comentario2     =[/][/] [^\n]* [\n]
num     =[0-9]+[.[0-9]]*
L = [a-zA-Z]
D = [0-9]
S=["."|":"|"/"|"_"|"@"]
id = {L}{S}*({L}|{D}|{S})*
MD = "-$"
CADENACOMILLASDOBLES = [\"]([^\"\n]|(\\\"))*[\"]
FECHA = {num}[-]{id}[-]{num}





%cupsym sym
%class ALexicoS
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

"+"             { return new Symbol(sym.MAS,yycolumn,yyline, new String("+"));}
"-"             { return new Symbol(sym.MENOS,yycolumn,yyline, new String("-"));}
"*"             { return new Symbol(sym.POR,yycolumn,yyline, new String("*"));}  
"/"             { return new Symbol(sym.DIV,yycolumn,yyline, new String("/"));}
"("             { return new Symbol(sym.PARA,yycolumn,yyline, new String("("));}
")"             { return new Symbol(sym.PARC,yycolumn,yyline, new String(")"));}
"{"             { return new Symbol(sym.LLAVEA,yycolumn,yyline, new String("{"));}
"}"             { return new Symbol(sym.LLAVEC,yycolumn,yyline, new String("}"));}
";"             { return new Symbol(sym.PUNTOC,yycolumn,yyline, new String(";"));}
"="             { return new Symbol(sym.IGUAL,yycolumn,yyline, new String("="));}
"\""            { return new Symbol(sym.COMILLA,yycolumn,yyline, new String("\""));}
"<"             { return new Symbol(sym.MNR,yycolumn,yyline, new String("<"));}
">"             { return new Symbol(sym.MYR,yycolumn,yyline, new String(">"));}
"."             { return new Symbol(sym.PUNTO,yycolumn,yyline, new String("."));}
"$"             { return new Symbol(sym.D,yycolumn,yyline, new String("$"));}
"_"             { return new Symbol(sym.BAJO,yycolumn,yyline, new String("_"));}
"["             { return new Symbol(sym.ABREC,yycolumn,yyline, new String("["));}
"]"             { return new Symbol(sym.CIERRAC,yycolumn,yyline, new String("]"));}
"request"           { return new Symbol(sym.R,yycolumn,yyline, new String(yytext()));}
"InicioUsuario"     { return new Symbol(sym.IU,yycolumn,yyline, new String(yytext()));}
"id"                { return new Symbol(sym.IDE,yycolumn,yyline, new String(yytext()));}
"password"          { return new Symbol(sym.P,yycolumn,yyline, new String(yytext()));}
"True"              { return new Symbol(sym.T,yycolumn,yyline, new String(yytext()));}
"CrearUsuario"      { return new Symbol(sym.CU,yycolumn,yyline, new String(yytext()));}
"nombre"            { return new Symbol(sym.NOM,yycolumn,yyline, new String(yytext()));}
"apellido"          { return new Symbol(sym.APE,yycolumn,yyline, new String(yytext()));}
"telefono"          { return new Symbol(sym.TEL,yycolumn,yyline, new String(yytext()));}
"email"             { return new Symbol(sym.EM,yycolumn,yyline, new String(yytext()));}
"direccion"         { return new Symbol(sym.DIR,yycolumn,yyline, new String(yytext()));}
"tienda"            { return new Symbol(sym.TIENDA,yycolumn,yyline, new String(yytext()));}
"tipo"              { return new Symbol(sym.TIPO,yycolumn,yyline, new String(yytext()));}
"codigo"            { return new Symbol(sym.COD,yycolumn,yyline, new String(yytext()));}
"propietario"       { return new Symbol(sym.PROP,yycolumn,yyline, new String(yytext()));}
"img"               { return new Symbol(sym.IMG,yycolumn,yyline, new String(yytext()));}
"Propietario"       { return new Symbol(sym.PROP2,yycolumn,yyline, new String(yytext()));}
"Tipo"              { return new Symbol(sym.TIPO2,yycolumn,yyline, new String(yytext()));}
"cantidad"          { return new Symbol(sym.CANT,yycolumn,yyline, new String(yytext()));}
"marca"             { return new Symbol(sym.MARCA,yycolumn,yyline, new String(yytext()));}
"color"             { return new Symbol(sym.COLOR,yycolumn,yyline, new String(yytext()));}
"tamaño"            { return new Symbol(sym.TAM,yycolumn,yyline, new String(yytext()));}
"sucursal"          { return new Symbol(sym.SUCURSAL,yycolumn,yyline, new String(yytext()));}
"producto"          { return new Symbol(sym.PROD,yycolumn,yyline, new String(yytext()));}
"mate"              { return new Symbol(sym.MATE,yycolumn,yyline, new String(yytext()));}
"Cons"              { return new Symbol(sym.CONS,yycolumn,yyline, new String(yytext()));}
"Extraer"           { return new Symbol(sym.EXTRAER,yycolumn,yyline, new String(yytext()));}
"de"                { return new Symbol(sym.DE,yycolumn,yyline, new String(yytext()));}
"query"             { return new Symbol(sym.QUERY,yycolumn,yyline, new String(yytext()));}
"donde"             { return new Symbol(sym.DONDE,yycolumn,yyline, new String(yytext()));}
"##"            { return new Symbol(sym.OR,yycolumn,yyline, new String("##"));}
"??"            { return new Symbol(sym.XOR,yycolumn,yyline, new String("??"));}
"%%"            { return new Symbol(sym.AND,yycolumn,yyline, new String("%%"));}
"N"             { return new Symbol(sym.NOT,yycolumn,yyline, new String("N"));}
"get"           { return new Symbol(sym.GET,yycolumn,yyline, new String(yytext()));}
"Pt"           { return new Symbol(sym.PT,yycolumn,yyline, new String(yytext()));}
"Rq"           { return new Symbol(sym.RQ,yycolumn,yyline, new String(yytext()));}


{MD}            { return new Symbol(sym.MD,yycolumn,yyline, new String(yytext()));}

{FECHA}             { return new Symbol(sym.FECHA,yycolumn,yyline, new String(yytext()));}
","             { return new Symbol(sym.COMA,yycolumn,yyline, new String(","));}





{num}       { return new Symbol(sym.num, yycolumn,yyline,new String(yytext()));}
{id}        { return new Symbol(sym.id, yycolumn,yyline,new String(yytext()));}
{Comentario}        { /* Se ignoran */}
{Comentario2}       { /* Se ignoran */}
{CADENACOMILLASDOBLES} { return new Symbol(sym.CADS,yycolumn,yyline, new String(yytext()));}

/* BLANCOS */
[ \t\r\f\n]+        { /* Se ignoran */}


/* ERRORES LEXICOS */
.                    { System.out.println("Error lexico: "+yytext());}
}



